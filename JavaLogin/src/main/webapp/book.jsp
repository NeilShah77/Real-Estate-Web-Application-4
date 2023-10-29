<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="com.bean.Property"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Book Property</title>
	<style>
		body {
			background-color: #f0f8ea;
			font-family: Arial, sans-serif;
			color: #333;
			margin: 0;
			padding: 0;
		}
		h2 {
			color: #008000;
			margin: 20px 0;
			text-align: center;
		}
		form {
			margin: 20px auto;
			max-width: 500px;
			padding: 20px;
			background-color: #fff;
			border-radius: 10px;
			box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
		}
		label {
			display: block;
			font-weight: bold;
			margin-top: 10px;
		}
		input[type="date"],
		select,
		input[type="text"] {
			border-radius: 5px;
			border: 1px solid #ccc;
			box-sizing: border-box;
			font-size: 16px;
			padding: 10px;
			width: 100%;
		}
		input[type="submit"] {
			background-color: #008000;
			border: none;
			border-radius: 5px;
			color: #fff;
			cursor: pointer;
			font-size: 16px;
			padding: 10px;
			width: 100%;
		}
		input[type="submit"]:hover {
			background-color: #006600;
		}
		#cardNumberInput {
			display: none;
		}
	</style>
</head>
<body>
	<h2>Book Property</h2>
	<form action="Booking" method="post">
		<input type="hidden" name="propertyID" value="<%= request.getParameter("propertyId") %>">
		<label for="startDate">Start Date:</label>
		<input type="date" id="startDate" name="startDate" required>
		<label for="endDate">End Date:</label>
		<input type="date" id="endDate" name="endDate" required>
		<label for="paymentMethodID">Payment Method:</label>
		<select id="paymentMethodID" name="paymentMethodID" required onchange="showCardNumberInput()">
			<option value="">Select a payment method</option>
			<c:forEach var="paymentMethod" items="${renter.getPaymentMethods()}">
				<option value="creditCard">Credit Card</option>
				<option value="debitCard">Debit Card</option>
				<option value="paypal">Paypal</option>
			</c:forEach>
		</select>
		<div id="cardNumberInput">
			<label for="cardNumber">Card Number:</label>
			<input type="text" id="cardNumber" name="cardNumber">
		</div>
		<input type="submit" value="Book">
	</form>
	<script>
		function showCardNumberInput() {
			var paymentMethodID = document.getElementById("paymentMethodID").value;
			var cardNumberInput = document.getElementById("cardNumberInput");
			if (paymentMethodID === "creditCard" || paymentMethodID === "debitCard") {
				cardNumberInput.style.display = "block";
			} else {
				cardNumberInput.style.display = "none";
			}
		}
	</script>
</body>
</html>