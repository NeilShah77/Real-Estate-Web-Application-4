<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Hey Agent</title>
	<link rel="stylesheet"
		href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
	<style>
		body {
    background-color: #f2f2f2;
  }
  
  .form-container {
    max-width: 700px;
    margin: 0 auto;
    padding: 20px;
    border: 1px solid #ccc;
    background-color: #fff;
    box-shadow: 0 0 10px #ccc;
  }
  
  h2 {
    color: #00cc00;
  }
  
  label {
    font-weight: bold;
  }
  
  input[type=text],
  input[type=password],
  textarea {
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    box-sizing: border-box;
    border-radius: 4px;
    background-color: #f8f8f8;
    resize: none;
  }
  
  input[type=submit],
  input[type=reset] {
    background-color: #007bff;
    color: #fff;
    padding: 12px 20px;
    border: none;
    border-radius: 4px;
    cursor: pointer;
  }
  
  input[type=submit]:hover,
  input[type=reset]:hover {
    background-color: #0056b3;
  }
  
  .form-control-label {
    display: block;
    margin-bottom: 10px;
  }
  
  .form-control-group {
    margin-bottom: 20px;
  }
  
  .form-control-group:last-child {
    margin-bottom: 0;
  }
  
  .form-control-radio {
    display: inline-block;
    margin-right: 10px;
    margin-bottom: 10px;
  }
  
  .form-control-radio-label {
    display: inline-block;
    margin-right: 20px;
  }
  
  .form-control-radio-input {
    display: inline-block;
    margin-right: 5px;
  }
	</style>
</head>
<body>
	<div class="container">
		<form action="Agent" method="post">
			<h2 class="text-center" >Adding Property</h2>
			<div class="form-group">
				<label for="PropertyID">Property ID:</label>
				<input type="number" class="form-control" id="PropertyID"
					name="PropertyID" value="${PropertyID}" placeholder="Property ID">
			</div>
			<div class="form-group">
				<label for="PropertyType">Property Type:</label>
				<div class="radio">
					<label><input type="radio" name="PropertyType" value="House">House</label>
				</div>
				<div class="radio">
					<label><input type="radio" name="PropertyType" value="Appartment">Apartment</label>
				</div>
				<div class="radio">
					<label><input type="radio" name="PropertyType" value="CommercialBuilding">Commercial Building</label>
				</div>
			</div>
			<div class="form-group">
				<label for="City">City:</label>
				<input type="text" class="form-control" id="City" name="City" placeholder="City">
			</div>
			<div class="form-group">
				<label for="AvailableDate">Date of Availability:</label>
				<input type="text" class="form-control" id="AvailableDate" name="AvailableDate"
					placeholder="Date of Availability">
			</div>
			<div class="form-group">
				<label for="Rooms">Number of Rooms:</label>
				<input type="text" class="form-control" id="Rooms" name="Rooms" placeholder="Number of Rooms">
			</div>
			<div class="form-group">
				<label for="Address">Address:</label>
				<textarea class="form-control" id="Address" name="Address" placeholder="Address"></textarea>
			</div>
			<div class="form-group">
				<label for="CrimeRate">Rate of Crime:</label>
				<input type="text" class="form-control" id="CrimeRate" name="CrimeRate" placeholder="Rate of Crime">
			</div>
			<div class="form-group">
				<label for="Neighbourhood">Neighbourhood:</label>
				<input type="text" class="form-control" id="Neighbourhood" name="Neighbourhood" placeholder="Neighbourhood">
			</div>
			<div class="form-group">
				<label for="Price">Price:</label>
				<input type="text" class="form-control" id="Price" name="Price" placeholder="Price">
			</div>
			<div class="form-group">
				<label for="NearBySchool">Near By School:</label>
				<input type="text" class="form-control" id="NearBySchool" name="NearBySchool" placeholder="Near By Schools">
			</div>
			<div class="form-group">
				<label for="ExtraFeature">Extra Features:</label>
				<input type="text" class="form-control" id="ExtraFeature" name="ExtraFeature" placeholder="Extra Features">
			</div>
			<div class="form-group">
				<label for="BookStatus">Booking Status:</label>
				<input type="text" class="form-control" id="BookStatus" name="BookStatus" placeholder="Booking Status">
			</div>
			<div class="form-group">
				<label for="BookID">Booking ID:</label>
				<input type="text" class="form-control" id="BookID" name="BookID" placeholder="Booking ID">
				<input type="submit" class="btn btn-success" value="Register"> <input type="reset"
			class="btn btn-success" value="Reset">
			</div>
		</form>
	</div>
</body>
</html>

		