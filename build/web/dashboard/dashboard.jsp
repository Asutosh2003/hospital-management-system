<%-- 
    Document   : dashboard
    Created on : 13 Nov, 2024, 5:27:16 PM
    Author     : asuto
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Dashboard</title>
        <%@include file="../component/styleandcss.jsp" %>
    </head>
    <body>
        <%@include file="navbar1.jsp" %>
        <h5 class="text-center mt-4"> Doctor : <%= session.getAttribute("name")%></h5>
        <!-- Card Container -->
        <!-- Card Container -->
        <div class="container mt-5 p-4" style="background-color: azure;">
            <div class="row g-4"> <!-- Use row with gap -->
                
                <!-- Doctor Card -->
                <div class="col-md-4">
                    <div class="card text-bg-success" style="height: 15rem;">
                        <div class="card-body d-flex flex-column justify-content-center align-items-center">
                            <i class="fa-solid fa-user-doctor" style="font-size: 3rem; margin-bottom: 10px;"></i>
                            <div class="card-header text-center">Doctor</div>
                            <h5 class="card-title text-center mt-2">Primary card title</h5>
                            <p class="card-text text-center">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                        </div>
                    </div>
                </div>
                
                <!-- Patient Card -->
                <div class="col-md-4">
                    <div class="card text-bg-success" style="height: 15rem;">
                        <div class="card-body d-flex flex-column justify-content-center align-items-center">
                            <i class="fa-solid fa-bed-pulse" style="font-size: 3rem; margin-bottom: 10px;"></i>
                            <div class="card-header text-center">Patient</div>
                            <h5 class="card-title text-center mt-2">Primary card title</h5>
                            <p class="card-text text-center">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                        </div>
                    </div>
                </div>
                
                <!-- Additional Cards -->
                <div class="col-md-4">
                    <div class="card text-bg-success" style="height: 15rem;">
                        <div class="card-body d-flex flex-column justify-content-center align-items-center">
                            <i class="fa-solid fa-user-doctor" style="font-size: 3rem; margin-bottom: 10px;"></i>
                            <div class="card-header text-center">Doctor</div>
                            <h5 class="card-title text-center mt-2">Primary card title</h5>
                            <p class="card-text text-center">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                        </div>
                    </div>
                </div>
                
                <div class="col-md-4">
                    <div class="card text-bg-success" style="height: 15rem;">
                        <div class="card-body d-flex flex-column justify-content-center align-items-center">
                            <i class="fa-solid fa-user-doctor" style="font-size: 3rem; margin-bottom: 10px;"></i>
                            <div class="card-header text-center">Doctor</div>
                            <h5 class="card-title text-center mt-2">Primary card title</h5>
                            <p class="card-text text-center">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                        </div>
                    </div>
                </div>
                
            </div>
        </div>
    </body>
</html>
