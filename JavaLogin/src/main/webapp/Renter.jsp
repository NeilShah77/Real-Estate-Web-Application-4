<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Hey Renter</title>
	<style>
		body {
			background-color: #f1f1f1;
			font-family: Arial, sans-serif;
		}
		form {
			background-color: #fff;
			padding: 20px;
			margin: 0 auto;
			max-width: 500px;
			border-radius: 5px;
			box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
		}
		input[type="text"], input[type="submit"] {
			display: block;
			margin: 10px 0;
			padding: 10px;
			border-radius: 5px;
			border: 1px solid #ccc;
			width: 100%;
			box-sizing: border-box;
			font-size: 16px;
			font-family: inherit;
		}
		input[type="submit"] {
			background-color: #4CAF50;
			color: #fff;
			cursor: pointer;
		}
		input[type="submit"]:hover {
			background-color: #3e8e41;
		}
		h2 {
			text-align: center;
			margin-top: 0;
		}
	</style>
</head>
<body>
	<form action="Renter" method="get">
		<h2>Property Details</h2>
		<label for="AvailableDate">Enter the available date:</label>
		<input type="text" id="AvailableDate" name="AvailableDate" placeholder="Date of Availability">
		<label for="Neighbourhood">Enter the location:</label>
		<input type="text" id="Neighbourhood" name="Neighbourhood" placeholder="Location">
		<input type="submit" value="Submit">
	</form>
</body>
</html>
