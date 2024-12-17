<%-- 
    Document   : forgotPassword
    Created on : 16 Nov, 2024, 6:52:13 PM
    Author     : asuto
--%>
<%--<jsp:include page="component/navbar.jsp"></jsp:include>--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%@include file="component/styleandcss.jsp" %>
     <style>
        body, html {
            height: 100%;
            margin: 0;
        }
        .form-container {
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100%;
        }
        form {
            background-color: white;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
            width: 100%;
            max-width: 400px;
        }
        .form-title {
            margin-bottom: 20px;
        }
    </style>
</head>
<body>
    <jsp:include page="component/navbar.jsp"></jsp:include>
    <div class="form-container bg-success">
        <form action="backend/processForgotPassword.jsp" method="post">
            <h3 class="form-title text-center text-success">Reset Password</h3>
            <div class="mb-3">
                <label for="email" class="form-label">Email Address</label>
                <input type="email" class="form-control" id="email" name="email" placeholder="Enter your registered email" required>
            </div>
            <div class="mb-3">
                <label for="newPassword" class="form-label">New Password</label>
                <input type="password" class="form-control" id="newPassword" name="newPassword" placeholder="Enter your new password" required>
            </div>
            <div class="mb-3">
                <label for="confirmPassword" class="form-label">Confirm Password</label>
                <input type="password" class="form-control" id="confirmPassword" name="confirmPassword" placeholder="Confirm your new password" required>
            </div>
            <button type="submit" class="btn btn-success w-100">Update Password</button>
        </form>
    </div>
</body>
</html>
