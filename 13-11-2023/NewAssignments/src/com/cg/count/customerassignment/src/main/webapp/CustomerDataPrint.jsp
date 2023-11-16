<%@page import="javax.websocket.Session"%>
<%@page import="java.beans.Customizer"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.PreparedStatement" %>
      <%@page import="java.util.*" %>
    
    
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/bootstrap.css">

<meta charset="ISO-8859-1">
<title> Customer Print Data Here</title>



</head>
<body>

<%   


String name= request.getParameter("name");  
int id = Integer.parseInt(request.getParameter("customerid"));
String email= request.getParameter("email");  
String phonenumber = request.getParameter("phonenumber");
String address = request.getParameter("address");

session.setAttribute("user",name);
out.print("<BR>"+session.getCreationTime());
out.print("<BR>"+session.getAttribute("user"));

{
out.println("welcome "+name);  
out.print("<BR>");
out.println(id);
out.print("<BR>");

out.println(email);
out.print("<BR>");

out.println(phonenumber);

}

%>  

</body>
		<script type="text/javascript" src="js/bootstrap.js"></script>

</html>