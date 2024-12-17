<%-- 
    Document   : doctor_login
    Created on : 11 Nov, 2024, 9:47:10 AM
    Author     : asuto
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>DOCTOR LOGIN</title>
        <jsp:include page="component/styleandcss.jsp"/>
    </head>
    <body>
       
        <jsp:include page="component/navbar.jsp"/>
          <div class="container">
    <div class="row justify-content-center">
        <div class="col-md-6 col-lg-4">
            <div class="card shadow-sm border-0">
                <div class="card-body p-4">
                    <h3 class="card-title text-center mb-4">DOCTOR LOGIN</h3>
                    
                    <!-- Admin Login Form -->
                    <form action="backend/login.jsp" method="post">
                        <!-- Username Field -->
                         <div class="mb-3">
                            <label for="email" class="form-label">Email:</label>
                            <input type="text" class="form-control" id="username" name="email" placeholder="Enter email" required>
                        </div>
                        
                        <!-- Password Field -->
                        <div class="mb-3">
                            <label for="password" class="form-label">Password</label>
                            <input type="password" class="form-control" id="password" name="password" placeholder="Enter password" required>
                        </div>
                        
                        <!-- Login Button -->
                        <button type="submit" class="btn btn-primary w-100">Login</button>
                    </form>
                    
                    <!-- Forgot Password Link -->
                    <div class="text-center mt-3">
                        <a href="forgotPassword.jsp" class="text-decoration-none">Forgot password?</a><br>
                        Don't have an account ?<a href="signup.jsp">Create one</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
        <%@include file="component/footer.jsp" %>
    </body>
</html>
