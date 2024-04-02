<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Signup</title>
<style type="text/css">
.l1
{
display:inline-block;
width:120px;
margin-left: 10px;
}
#f1
{
width: 350px;
height: 440px;
line-height: 30px;
padding: 30px;
border-radius: 12px;
}
.inputfd
{
border:1px solid black;
border-radius:5px;
background-color: #F4EBDA;
}
form{
height:97vh;
display: flex;
justify-content: center;
align-items: center;
font-family: sans-serif;
}
#usernm
{
margin-top: 10px;
}
h1
{
text-align: center;
}
body
{
background-image: url("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRqFUoOzaBd_QpPk6HpTIOZZYXdqVUQJur72g&usqp=CAU");
background-repeat: no-repeat;
background-size: cover;
color: white;

}
</style>
</head>
<body>
<form action="saveuser" enctype="multipart/form-data" method="post">
<fieldset id="f1">
<h1>Sign up</h1>
<label class="l1" id="usernm">User Id :</label><input class="inputfd" type="text" name="userid"> <br><br>
<label class="l1" >Username :</label><input class="inputfd" type="text" name="username"> <br><br>
<label class="l1">Email :</label><input class="inputfd" type="email" name="useremail"><br><br>
<label class="l1">Contact :</label><input class="inputfd" type="text" name="usercontact"><br><br>
<label class="l1">Password :</label><input class="inputfd" type="password" name="cfpassword"><br><br>
<label class="l1">Image:</label><input type="file" name="userimg">
<button>Submit</button>
</fieldset>
</form>

</body>
</html>