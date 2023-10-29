<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<style>
    body {
        background-color: #f1f1f1;
    }
    form {
        background-color: #fff;
        border-radius: 5px;
        width: 300px;
        padding: 20px;
        margin: 0 auto;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.3);
    }
    h2 {
        text-align: center;
    }
    input[type=text], input[type=password] {
        width: 100%;
        padding: 12px 20px;
        margin: 8px 0;
        display: inline-block;
        border: 1px solid #ccc;
        border-radius: 4px;
        box-sizing: border-box;
    }
    input[type=submit], input[type=reset] {
        width: 100%;
        background-color: #4CAF50;
        color: white;
        padding: 14px 20px;
        margin: 8px 0;
        border: none;
        border-radius: 4px;
        cursor: pointer;
    }
    input[type=submit]:hover, input[type=reset]:hover {
        background-color: #45a049;
    }
</style>
</head>
<body>
    <form action="Login" method="post">
        <h2>Login</h2>
        <input type="text" name="email" placeholder="Username">
        <br>
        <input type="password" name="pass" placeholder="Password">
        <br>
        <input type="submit" value="Login">
        <input type="reset" value="Reset">
    </form>
</body>
</html>
