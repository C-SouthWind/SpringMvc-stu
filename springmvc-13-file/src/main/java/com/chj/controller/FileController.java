package com.chj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;

/**
 * @author ：chj
 * @date ：Created in 2021/12/16 20:34
 * @params :
 */
@Controller
public class FileController {

    //@RequestParam 将name=file控件得到的文件封装成CommonsMultipartFile对象
    //批量上传CommonsMultipartFile则为数据即可
    @RequestMapping("/file")
    public String file(@RequestParam("file")CommonsMultipartFile file, HttpServletRequest request) throws IOException {
        //获取文件名 file.getOriginalFilename();
        String uploadFileName = file.getOriginalFilename();
        //如果文件名为空，直接返回到首页
        if ("".equals(uploadFileName)) {
            return "redirect:/index";
        }
        System.out.println("上传文件名："+uploadFileName);
        //上传路径保存位置
        String path = request.getServletContext().getRealPath("/upload");
        //如果路径不存在，创建一个
        File realPath = new File(path);
        if (!realPath.exists()) {
            realPath.mkdir();
        }
        System.out.println("上传文件保存地址："+realPath);

        InputStream is = file.getInputStream();//文件输入流
        FileOutputStream os = new FileOutputStream(new File(realPath, uploadFileName));//文件输出流

        //读取写出
        int len=0;
        byte[] buffer = new byte[1024];
        while ((len = is.read(buffer))!=-1){
            os.write(buffer,0,len);
            os.flush();
        }
        os.close();
        is.close();

        return "redirect:/index";
    }

    @RequestMapping("/file2")
    public String file2(@RequestParam("file") CommonsMultipartFile file,HttpServletRequest request) throws IOException {
       //上传路径保存设置
        String path = request.getServletContext().getRealPath("/upload");
        File realPath = new File(path);
        if (!realPath.exists()) {
            realPath.mkdir();
        }
        //上传文件地址
        System.out.println("上传文件保存地址" + realPath);

        //通过CommonsMultipartFile的方法直接写文件（注意这个时候）
        file.transferTo(new File(realPath+"/"+file.getOriginalFilename()));
        return "redirect:/index";
    }


    @RequestMapping("/download")
    public String download(HttpServletResponse response,HttpServletRequest request) throws Exception {
        //要下载的图片地址
        String path = request.getServletContext().getRealPath("/upload");
        String fileName = "1.jpg";

        //设置 response响应头
        response.reset();//设置页面不缓存，情况buffer
        response.setCharacterEncoding("utf-8");//字符编码
        response.setContentType("multipart/form-data");//二进制传输数据
        //设置相应头
        response.setHeader("Content-Disposition",
                "attachment;fileName"+ URLEncoder.encode(fileName,"utf-8"));

        File file = new File(path, fileName);
        //2.读取文件 -- 输入流
        FileInputStream input = new FileInputStream(file);
        //3.写出文件 -- 输入流
        OutputStream out = response.getOutputStream();

        byte[] buff = new byte[1024];
        int index=0;
        //4.执行 写出操作
        while ((index = input.read(buff)) != -1){
            out.write(buff,0,index);
            out.flush();
        }
        out.close();
        input.close();
        return null;
    }
}
