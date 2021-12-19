<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
   <script src="static/js/jquery-3.6.0.js"></script>
  </head>
  <body>
    用户名：<input type="text" id="username" onblur="a()">
  </body>
  <script>
      function a() {
          $.post({
              url:"/a1",
              data:{"name":$("#username").val()},
              success:function (data) {
                  alert(data);
              }
          })
      }
  </script>
</html>
