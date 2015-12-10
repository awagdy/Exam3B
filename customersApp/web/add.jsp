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
                    <form name="searchForm" action="search" method="get">

                        <input type="text" name="searchVal" value="Search by Last Name"/>

                        <br>

                        <input type="submit" name="submit" value="Search"/>

                    </form>
                </p1>
            </div>


            <div class="main">
                <form name="addForm" action="addcustomer" method="get"/>
                <p>
                    <label>First Name</label>
                    <input type="text" name="firstName" value=""/>
                    <br>
                </p>
                <p>

                    <label>Last Name</label>
                    <input type="text" name="lastName" value=""/>
                    <br>
                </p>
                <p>
                    <label>Address 1</label>
                    <input type="text" name="addr1" value=""/>
                    <br>
                </p>
                <p>
                    <label>Address 2</label>
                    <input type="text" name="addr2" value=""/>
                    <br>
                </p>
                <p>
                    <label>City</label>
                    <input type="text" name="city" value=""/>
                    <br>
                </p>
                <p>
                    <label>State</label>
                    <input type="text" name="state" value=""/>
                    <br>
                </p>
                <p>
                    <label>Zip</label>
                    <input type="text" name="zip" value=""/>
                    <br>
                </p>
                <p>
                    <label>Email Address</label>
                    <input type="text" name="emailAddr" value=""/>
                    <br>
                </p>
                <p>
                    <label>Age</label>
                    <input type="text" name="age" value=""/>
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
