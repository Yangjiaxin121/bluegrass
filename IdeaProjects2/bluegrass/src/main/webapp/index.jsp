<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<html>
<body>
<h2>Hello World!</h2>

spring mvc上传文件
<form name="form1" action="/article/upload.do" method="post" enctype="multipart/form-data" >

    <<input type="file" name="upload_file">
    <<input type="submit" value="spring mvc上传文件">

</form>
富文本图片上传文件
<form name="form2" action="/article/richtext_img_upload.do" method="post" enctype="multipart/form-data" >

    <<input type="file" name="upload_file">
    <<input type="submit" value="spring mvc上传文件">

</form>
</body>
</html>
