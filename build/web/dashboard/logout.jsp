<%-- 
    Document   : logout
    Created on : 13 Nov, 2024, 5:51:33 PM
    Author     : asuto
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Logout</title>
    </head>
    <body>
        <%
            HttpSession session1=request.getSession();
                session1.invalidate();
                response.sendRedirect("../Index.jsp");
                %>
    </body>
</html>
