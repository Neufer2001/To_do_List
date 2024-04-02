<%@page import="java.util.Base64"%>
<%@page import="DTO.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%HttpSession s=request.getSession();%>
<%User u=(User)s.getAttribute("user");%>
<h1>Heloo <%=u.getUsername()%></h1>


<%String image=new String(Base64.getEncoder().encode(u.getUserimage())); %>

<img alt="" src="data:image/jpeg;base64,<%=image%>" height="350px" width="350px">

</body>
</html>

 