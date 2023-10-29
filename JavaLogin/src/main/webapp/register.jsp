<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Registration Form</title>
    <style>
        body {
            background-color: #F5F5F5;
            font-family: Arial, sans-serif;
        }

        form {
            max-width: 600px;
            margin: 0 auto;
            background-color: #FFFFFF;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
        }

        h2 {
            text-align: center;
        }

        input[type=text], input[type=password], textarea {
            width: 100%;
            padding: 12px 20px;
            margin: 8px 0;
            display: inline-block;
            border: 1px solid #ccc;
            border-radius: 4px;
            box-sizing: border-box;
        }

        input[type=radio] {
            display: inline-block;
            margin: 8px 0;
        }

        label {
            margin-left: 5px;
        }

        input[type=submit], input[type=reset] {
            background-color: #4CAF50;
            color: white;
            padding: 12px 20px;
            margin: 8px 0;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            float: right;
        }

        input[type=submit]:hover, input[type=reset]:hover {
            background-color: #3E8E41;
        }

        .clearfix::after {
            content: "";
            clear: both;
            display: table;
        }
    </style>
</head>
<body>
    <form action="Register" method="post">
        <h2>Registration Form</h2>
        <input type="text" name="name" placeholder="Name">
        <br>
        <input type="text" name="email" placeholder="E-mail">
        <br>
        <textarea name="address" placeholder="Address"></textarea>
        <br>
        <div class="clearfix">
            <input type="radio" name="role" value="Agent" id="agent">
            <label for="agent">Agent</label>
            <input type="radio" name="role" value="Renter" id="renter">
            <label for="renter">Renter</label>
        </div>
        <input type="password" name="pass" placeholder="Password">
        <br>
        <input type="password" name="cpass" placeholder="Confirm Password">
        <br>
        <div class="clearfix">
            <input type="submit" value="Register">
            <input type="reset" value="Reset">
        </div>
    </form>
</body>
</html>
