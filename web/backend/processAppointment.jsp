<%-- 
    Document   : processAppointment
    Created on : 16 Nov, 2024, 6:44:21 PM
    Author     : asuto
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
 <%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       
<%
    // Database connection details
    String dbURL = "jdbc:mysql://localhost:3306/hms"; // Replace `localhost` and `3306` with your database host and port if different
    String dbUser = "root"; // Replace with your database username
    String dbPassword = ""; // Replace with your database password

    // Retrieve form parameters
    String name = request.getParameter("name");
    String email = request.getParameter("email");
    String contact = request.getParameter("contact");
    String date = request.getParameter("date");
    String time = request.getParameter("time");
    String comments = request.getParameter("comments");

    Connection conn = null;
    PreparedStatement pstmt = null;

    try {
        // Load MySQL JDBC Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Establish connection
        conn = DriverManager.getConnection(dbURL, dbUser, dbPassword);

        // Insert form data into the appointments table
        String insertSQL = "INSERT INTO appointments (name, email, contact, appointment_date, appointment_time, comments) " +
                           "VALUES (?, ?, ?, ?, ?, ?)";
        pstmt = conn.prepareStatement(insertSQL);
        pstmt.setString(1, name);
        pstmt.setString(2, email);
        pstmt.setString(3, contact);
        pstmt.setString(4, date);
        pstmt.setString(5, time);
        pstmt.setString(6, comments);

        int rowsInserted = pstmt.executeUpdate();
        if (rowsInserted > 0) {
            out.println("<h1>Appointment booked successfully!</h1>");
            out.println("<p>Thank you, " + name + ". Your appointment details have been saved.</p>");
        } else {
            out.println("<h1>Error: Could not book the appointment.</h1>");
        }
    } catch (Exception e) {
        out.println("<h1>Error occurred while processing the appointment:</h1>");
        out.println("<p>" + e.getMessage() + "</p>");
        e.printStackTrace();
    }
%>

    </body>
</html>
