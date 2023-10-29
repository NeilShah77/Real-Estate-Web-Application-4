<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List"%>
<%@ page import="com.bean.Property"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Showing Properties Details</title>
<style>
table {
	border-collapse: collapse;
	width: 100%;
	margin: 20px 0;
}

th, td {
	text-align: left;
	padding: 8px;
}

th {
	background-color: #4CAF50;
	color: white;
}

tr:nth-child(even) {
	background-color: #f2f2f2;
}

a {
	color: #0066cc;
}
</style>
</head>
<body>
	<h2>Property Details</h2>
	<table>
		<thead>
			<tr>
				<th>Property ID</th>
				<th>Property Type</th>
				<th>Booking Status</th>
				<th>Available Date</th>
				<th>Price (per Month)</th>
				<th>Price (for 12 Months)</th>
				<th>Price (for 24 Months)</th>
				<th>Link to Book the Property</th>
			</tr>
		</thead>
		<tbody>
			<% List<Property> properties = (List<Property>) request.getAttribute("properties");
               for (Property property : properties) { %>
			<tr>
				<td><%= property.getPropertyID() %></td>
				<td><%= property.getPropertyType() %></td>
				<td><%= property.getBookStatus() %></td>
				<td><%= property.getAvailableDate() %></td>
				<td>$<%= property.getPrice() %></td>
				<td>$<%= property.getPrice()*12 %></td>
				<td>$<%= property.getPrice()*24 %></td>
				<td><a
					href="book.jsp?propertyId=<%= property.getPropertyID() %>">Book</a></td>
			</tr>
			<% } %>
		</tbody>
	</table>
</body>
</html>
