<!DOCTYPE html>
<link rel="stylesheet" type="text/css" href="./style.css" /> 

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customer Database</title>
    </head>
    <body>
        <div class="wrap">
            <div class="header"> 
                <h1>Customer Database</h1>
                <p1>
                    <form name="searchForm" action="search" method="get">

                        <input type="text" name="searchVal" value="Search by Last Name"/>

                        <br>

                        <input type="submit" name="submit" value="Search"/>

                    </form>
                </p1>
            </div>
            <div class="main">

                <a href="read">View All Customers</a>
                <br> <br>
                <a href="search.jsp">Search Customers</a>
            </div>
            <div class="footer">

                <h2>
                    Software Development and Design. Ahmad Wagdy
                </h2>
            </div>




        </div>
    </body>
</html>
