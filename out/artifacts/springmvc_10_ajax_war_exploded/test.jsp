<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/12/14
  Time: 19:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="static/js/jquery-3.6.0.js"></script>
</head>
<body>
    <input type="button" id="btn" value="加载数据">
    <table>
        <thead>
            <tr>
                <td>id</td>
                <td>姓名</td>
                <td>密码</td>
            </tr>
        </thead>
        <tbody id="tbody">

        </tbody>
    </table>
</body>
</html>
<script>
        $("#btn").click(function () {
            $.post("/getUser",function (data) {
                var html = "";
                for (let i = 0;i<data.length;i++){
                    html += "<tr>"+
                        "<td>"+data[i].id+"</td>" +
                        "<td>"+data[i].name+"</td>" +
                        "<td>"+data[i].pwd+"</td>" +
                        "</tr>"
                }
                $("#tbody").html(html);
            })
        });
</script>
