<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Data</title>
<link rel="stylesheet" href="css/bootstrap.css">
</head>

<body>
<jsp:include page="Header.jsp"></jsp:include>
<h1>Customer Data Registration</h1>
<form  action="CustomerDataPrint.jsp">
<div class="mb-3">
  <label for="customerid" class="form-label">Customer ID</label>
  <input type="text" required  class="form-control" id="customerid" name="customerid" placeholder="874758IUNS">
</div>

<div class="mb-3">
  <label for="name" class="form-label">Name</label>
  <input type="text" class="form-control" required id="name" name="name" placeholder="Rahul Varma">
</div>
<div class="mb-3">
  <label for="emailaddress" class="form-label">Email address</label>
  <input type="email" class="form-control" required id="emailaddress" name="email" placeholder="name@example.com">
</div>


<div class="mb-3">
  <label for="phonenumber" class="form-label">Phone Number</label>
  <input type="number" class="form-control" required id="phonenumber" name="phonenumber" placeholder="+919093490343">
</div>
<div class="mb-3">
  <label for="address" class="form-label">Address</label>
  <input type="text" class="form-control" required id="address" name="address" placeholder="H.no area city state">
</div>



<button type="submit" class="btn btn-success">Register</button>
</form>

<form action="validInput.jsp">
   <buttontype="submit" class="btn " >IsValid</button>
</form>
<div>
<br>
<p>
<% String com = application.getInitParameter("company");
out.print("<BR> Company is "+com);%>
</p>
</div>
</body>
		<script type="text/javascript" src="js/bootstrap.js"></script>
</html>