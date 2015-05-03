<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search Country Info</title>
</head>
<body>
	<form action="countryinfo" method="POST">
		<label for="countryName">Enter the Name of country: </label>
        <input type="text" name="countryName">
        <!-- <p> OR </p>
        <label for="countryCode">Enter the country code: </label>
        <input type="text" id="countryCode" name="countryCode"><br /> -->
        <input type="submit" value="Submit"><br/>
	</form>
</body>
</html>