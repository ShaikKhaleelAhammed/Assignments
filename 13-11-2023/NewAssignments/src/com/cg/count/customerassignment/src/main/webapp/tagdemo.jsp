<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:set var="bookname"></c:set>
<c:out value="${bookname}" /><br>

<c:forEach var="n" begin="5" end="10">
<c:out value="${n}"/>
</c:forEach> 
<br>

<c:set var="count" value="100"/>
<c:if test="${count ==100}">
<c:out value="The count is 100"/>
</c:if>


<c:catch var="catchtheException">
<%int x=2/0; %>
</c:catch>

</body>
</html>