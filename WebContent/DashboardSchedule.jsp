<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="com.simpleschedule.model.Schedule"%>
<%@page import="java.util.ArrayList" %>

<%
  ArrayList<Schedule> list = (ArrayList<Schedule>) request.getAttribute("contactList");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dashboard</title>
<link rel="icon" href="images/phone.png" >
<link rel="stylesheet" href="css/style.css" >
</head>
<body>
	<h1>Contact Book</h1>
	<a href="NewContact.jsp" class="AcessButton"> New Contact </a>
	
	<table id="table">
		<thead>
			<tr>
				<th>Id</th>
				<th>Firstname</th>
				<th>Lastname</th>
				<th>Principal Phone</th>
				<th>Other Phone</th>
				<th>E-mail</th>
				<th>Actions</th>
			</tr>		
		</thead>
		<tbody>
			<%for (int i = 0; i < list.size(); i++){ %>
				<tr>
					<td><%=list.get(i).getUsercode()%></td>
					<td><%=list.get(i).getFirstname()%></td>
					<td><%=list.get(i).getLastname()%></td>
					<td><%=list.get(i).getPrincipalphonenumber()%></td>
					<td><%=list.get(i).getOtherphonenumber()%></td>
					<td><%=list.get(i).getEmail()%></td>	
					<td><a href="Select?usercode=<%=list.get(i).getUsercode()%>" class="AcessButton">Editar</a></td>			
				</tr>						  				
			<%}%>				
		</tbody>
	</table>
</body>
</html>