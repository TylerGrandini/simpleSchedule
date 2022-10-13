<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Contact</title>
<link rel="icon" href="images/diary1.png" >
<script src="scripts/validator.js" defer></script>
<link rel="stylesheet" href="css/style.css" >
</head>
<body>
	<h1>New Contact</h1>
	<form name="formContact" action="formContact">
		<table>
			<tr>
				<td><input type="text" name="firstname" class="box" placeholder="Enter the name of the new contact"></td>
			</tr>
			
			<tr>
				<td><input type="text" name="lastname" class="box" placeholder="Enter your lastname"></td>
			</tr>
			
			<tr>
				<td><input type="text" name="principalphonenumber" class="box" placeholder="Enter your principal phone number"></td>
			</tr>
			
			<tr>
				<td><input type="text" name="otherphonenumber" class="box" placeholder="Enter your other phone number"></td>
			</tr>
			
			<tr>
				<td><input type="text" name="email" class="box" placeholder="Enter your email"></td>
			</tr>	
		 </table>	
		 
		 <input type="button" class="AcessButton" onclick="formValidation()" value="Add" >	
	 </form>
</body>
</html>