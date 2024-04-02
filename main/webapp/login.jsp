<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
form 
{
display: flex;
justify-content: center;
align-items: center;
height: 97vh;
font-family: sans-serif;
font-size: large;
}
#fd1
{
display: inline-block;
height:350px;
width: 300px;
border-radius: 20px;
}
.label
{
display: inline-block;
/* width: 120px; */
margin-left: 55px;
}
#label1
{
line-height:38px;
margin-top: 20px;
}
h1
{
text-align:center;
}
.input
{
border:1px solid black;
border-radius: 3px;
margin-left: 55px;
margin-top: 10px;
}
body {
	background-image: url("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTCzj29Ir56qXm8cwV9j1RSIbqVVtJx6aljdA&s");
	background-repeat: no-repeat;
	background-size: cover;
	color: white;

}
button 
{
margin-left: 40px;
margin-top: 45px;
width: 220px;	
height: 28px;
border-style:none;
border-radius: 20px;
background-color:#E0E0E0;
}
button:hover
{
background-color:#0DC043;
color: white;
	
}
</style>
</head>
<body>
<form action="loginuser" method="post">
<fieldset id=fd1>
<h1>Login</h1>
<label class="label" id="label1">Email :</label> <br> <input class="input" type="email" name="loginemail"><br><br>
<label class="label">Password :</label> <br> <input class="input" type="password" name="loginpassword">
<br><button>Login</button>
</fieldset>

</form>
</body>
</html>