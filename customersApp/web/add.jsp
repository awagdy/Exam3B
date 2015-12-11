<!DOCTYPE html>
<link rel="stylesheet" type="text/css" href="./style.css" /> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add a new Customer</title>
    </head>
    <body>
        <div class="wrap">
            <div class="header">
                <h1>Add a new Customer</h1>
                <p1>
                    <div> 
                        <ul class="navlist">
                            <li><a href="index.jsp">Home</a></li>
                            <li><a href="read">List All Records </a></li>
                            <li><a href="add">Add a new Customer</a></li>
                        </ul>
                    </div>
                    <form name="searchForm" action="search" method="get">

                        <input type="text" name="searchVal" value=""/>

                        <br>

                        <input type="submit" name="submit" value="Search"/>

                    </form>
                </p1>
            </div>


            <div class="main">
                <form name="addForm" action="addcustomer" method="get"/>
                <p>
                    <label>First Name</label>
                    <input type="text" name="firstName" value=""  required/>
                    <br>
                </p>
                <p>

                    <label>Last Name</label>
                    <input type="text" name="lastName" value=""  required/>
                    <br>
                </p>
                <p>
                    <label>Address 1</label>
                    <input type="text" name="addr1" value=""  required/>
                    <br>
                </p>
                <p>
                    <label>Address 2</label>
                    <input type="text" name="addr2" value=""  required/>
                    <br>
                </p>
                <p>
                    <label>City</label>
                    <input type="text" name="city" value=""  required/>
                    <br>
                </p>
                <p>
                    <label>State</label>
                    <input type="text" name="state" value="" maxlength="2"  required/>
                    <br>
                </p>
                <p>
                    <label>Zip</label>
                    <input type="number" name="zip" value="" maxlength="5"  required/>
                    <br>
                </p>
                <p>
                    <label>Email Address</label>
                    <input type="email" name="emailAddr" value=""  required/>
                    <br>
                </p>
                <p>
                    <label>Age</label>
                    <input type="number" name="age" value="" required/>
                    <br>
                </p>
                <p>

                    <input type="submit"  name="submit" value="Submit"/>
                </p>
                </form>
            </div>
            <div class="footer">
                <h2>
                    Software Development and Design. Ahmad Wagdy
                </h2>
            </div>
        </div>

    </body>
</html>
