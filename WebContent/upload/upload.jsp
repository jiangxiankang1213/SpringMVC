<%--
  Created by shenlan
  User: shenlan
  Date: 2020-11-27
  Time: 13:22
  To upload files
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form method="post" action="/file/uploadFile.action" enctype="multipart/form-data">
    <input type="file" name="multipartFile" >
    <input type="submit" value="提交">
</form>
</body>
</html>
