<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Appointment Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <style>
        * {
            padding: 0%;
        }

        html, body {
            height: 100%;
            width: 100%;
        }

        form {
            width: 50%;
            border: 2px solid rgb(0, 0, 0);
            padding: 20px;
            border-radius: 10px;
        }

        input, textarea {
            height: 40px;
            width: 90%;
            margin-bottom: 20px;
        }

        textarea {
            height: 100px;
        }

        @keyframes colorChange {
            0% {
                color: red;
            }
            25% {
                color: green;
            }
            50% {
                color: blue;
            }
            75% {
                color: rgb(0, 255, 136);
            }
            100% {
                color: red;
            }
        }

        #h1 {
            font-size: xx-large;
            font-weight: bolder;
            animation: colorChange 5s infinite;
        }

        #submit:hover {
            background-color: aqua;
        }
    </style>
</head>
<body class="bg-light">
    <center>
        <form action="backend/processAppointment.jsp" method="post" name="appointmentForm" class="bg-success">

            <h1 id="h1">Book an Appointment</h1>
            <input type="text" placeholder="Enter your name" name="name" style="margin-top: 20px;" required>
            <br>
            <input type="email" placeholder="Enter your email" name="email" required>
            <br>
            <input type="tel" placeholder="Enter your contact number" name="contact" required>
            <br>
            <label for="date">Preferred Date:</label>
            <input type="date" id="date" name="date" required>
            <br>
            <label for="time">Preferred Time:</label>
            <input type="time" id="time" name="time" required>
            <br>
            <textarea placeholder="Additional Comments" name="comments"></textarea>
            <br>
            <input type="submit" value="Book Appointment" id="submit" style="margin-bottom: 20px;">
        </form>
    </center>
</body>
</html>
