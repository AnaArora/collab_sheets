<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<meta http-equiv="X-UA-Compatible" content="ie=edge">
		<title>Mission Master Page</title>
			<link rel="icon"  href="favicon.ico" />
		<link rel="stylesheet" href="style/mission_master.css">
		
</head>


<body>
        <div class="header">
        		<img src=" emblem.png" alt="India Emblem" style="float:left;width:100px;height:100px;">
				<img src="nic.png" alt="NIC Logo" style="float:left;width:100px;height:100px;">
                <!-- <a href="#default" class="logo">CompanyLogo</a> -->
                <div class="header-right">
                    <a class="active" href="login.jsp">Home</a>
                    <a href="#contact">Contact</a>
                    <a href="#about">About</a>
                </div>
        </div>
        <br><br>
        <br><br>
        <br><br>
        <br><br>
        <div class="heading">
            <h1>Master Mission Page</h1>
        </div>
        <br><br>
        <div class="container">
            <form action="/FormHandlerServlet" method="get">
                <label for="first-dropdown">Select Country:</label>
                <select id="first-dropdown" onchange="populateSecondDropdown()">
                    <option value="">--Select Country--</option>
                    <option value="usa">USA</option>
                    <option value="canada">Canada</option>
                    <option value="uk">UK</option>
                </select>
                <br><br>

                <label for="second-dropdown">Select City:</label>
                <select id="second-dropdown">
                    <option value="">--Select City--</option>
                </select>
                <br><br>
                <label for="user">No. of Allowed Users</label>
                <input type="number" id="user" name="tuser" placeholder="Allowed Users">
                <br><br>
                <label for="loginacc">Login Account</label>
                <input type="text" id="loginacc" name="loginacc" placeholder="Login Account">
                <br><br>
                <p>Account Activate/Deactivate:</p>
                <input type="radio" id="active" name="Activate" value="Activate">
                <label for="html">Activate</label><br>
                <input type="radio" id="deactive" name="Deactivate" value="Deactivate">
                <label for="css">Deactivate</label><br>

                <br><br>
                <input type="submit" value="Submit" name="submit"/>
            
            </form>
        </div>

        <div class="footer">
            <p>&copy;Copyright 2023 Government of India</p>
        </div>


        <!-- Load external JavaScript -->
        <script src="scripts.js"></script>
        
    </body>


</html>