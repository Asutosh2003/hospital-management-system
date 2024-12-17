<%-- 
    Document   : processForgotPassword
    Created on : 16 Nov, 2024, 7:02:51 PM
    Author     : asuto
--%>
<%@ page import="java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
<%
    // Database connection details
    String dbURL = "jdbc:mysql://localhost:3306/hms"; // Replace with your database details
    String dbUser = "root"; // Replace with your database username
    String dbPassword = ""; // Replace with your database password

    // Get form parameters
    String email = request.getParameter("email");
    String newPassword = request.getParameter("newPassword");
    String confirmPassword = request.getParameter("confirmPassword");

    Connection conn = null;
    PreparedStatement pstmt = null;

    try {
        if (!newPassword.equals(confirmPassword)) {
            out.println("<h1>Error</h1>");
            out.println("<p>Passwords do not match. Please try again.</p>");
        } else {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            conn = DriverManager.getConnection(dbURL, dbUser, dbPassword);

            // Check if the email exists in the database
            String checkQuery = "SELECT id FROM users WHERE email = ?";
            pstmt = conn.prepareStatement(checkQuery);
            pstmt.setString(1, email);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                // Update the password in the database
                String updateQuery = "UPDATE users SET password = ? WHERE email = ?";
                pstmt = conn.prepareStatement(updateQuery);
                pstmt.setString(1, newPassword); // Use proper hashing in real applications
                pstmt.setString(2, email);
                int rowsUpdated = pstmt.executeUpdate();

                if (rowsUpdated > 0) {
                    out.println("<h1>Success</h1>");
                    out.println("<p>Your password has been successfully updated.</p>");
                } else {
                    out.println("<h1>Error</h1>");
                    out.println("<p>Could not update the password. Please try again.</p>");
                }
            } else {
                out.println("<h1>Error</h1>");
                out.println("<p>Email address not found. Please check and try again.</p>");
            }
        }
    } catch (Exception e) {
        out.println("<h1>Error occurred:</h1>");
        out.println("<p>" + e.getMessage() + "</p>");
    }
%>

    </body>
</html>
