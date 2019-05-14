<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Student Details</title>
</head>
<body>
<center>
		<font  color="orange"><h2>Welcome to</font>
		<font color="blue">"Student Registration"</font>
		<!-- <font color="green"><marquee direction="right" behavior="alternate">Welcome</marquee></font> -->
		<br><br><br><br>
		Update Student Details</h2>
		<table>
		<form action="update" method="post">
			
			<tr>
				<th>Id<br><br></th>
				<td><input type="number" name="Id" required="required"><br><br></td>
			</tr>
			
			<tr>
				<th>Name<br><br></th>
				<td><input type="text" name="Name" required="required"><br><br></td>
			</tr>
			
			<tr>
				<th>Address<br><br></th>
				<td><input type="text" name="Address" required="required"><br><br></td>
			</tr>
			
			<tr>
				<th>Technology<br><br></th>
				<td><input type="text" name="Tech" required="required"><br><br></td>
			</tr>
			
			<tr>
				<th>E-mail<br><br></th>
				<td><input type="text" name="Mail" required="required"><br><br></td>
			</tr>
			
			</tr>
				<td></td>
				<td align="right"><input type="reset" value="Cancel">&nbsp;&nbsp;&nbsp;<input type="submit" value="Update"></td>
			</tr>
</form>

		
</body>
</html>