<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Student Details</title>
</head>
<body>
<center>
	<font  color="orange"><h2>Welcome to</font>
		<font color="blue">"Student Registration"</font><br><br><br>
<table>
	Delete Student<br><br>
		<form action="del">
			
			<tr>
				<th>Enter Id<br><br></th>
				<td><input type="number" name="Id" required="required"><br><br></td>
			</tr>
			
			</tr>
				<td></td>
				<td align="right"><input type="reset" value="Cancel">&nbsp;&nbsp;&nbsp;<input type="submit" value="Delete"></td>
			</tr>
		</form>
		</table>
		
</center>
</body>
</html>