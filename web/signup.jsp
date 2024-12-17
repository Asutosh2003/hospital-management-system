<%-- 
    Document   : signup
    Created on : 12 Nov, 2024, 10:37:06 AM
    Author     : asuto
--%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sign up</title>
        <style>
            body{
                background-color: cornsilk;
            }
            form{
                background-color: antiquewhite;
                width: 50%;
                height: 100%;
                margin-top: 50px;
                
            }
            label{
                margin-top: 20px;
               
            }
        </style>
        <jsp:include page="component/styleandcss.jsp"/>
    </head>
    <body>
        <jsp:include page="component/navbar.jsp"/>
    <center>
        <div>
            <form name='f1' method="post" action="backend/regn.jsp">
                <h1>Sign Up</h1><br>
                <label for="name">Name:</label>
                <input type="text" name="name" placeholder="Enter your name">
                <br>
                <label for="email">Email:</label>
                <input type="text" name="email" placeholder="Enter your email">
                <br>
                <label for="password">Password</label>
                <input type="password" name="password" placeholder="Enter your password">
                <br>
                <label for="catagory">Choose a catagory:
                <input type="radio" name="catagory" value="admin">Admin
                <input type="radio" name="catagory" value="user">User
                <input type="radio" name="catagory"  value="doctor">Doctor
                </label>
                <br>
                <input type="submit" value="Register" style="margin-bottom: 20px; margin-top: 10px;">
            </form>
        </div>
    </center>
    </body>
</html>
