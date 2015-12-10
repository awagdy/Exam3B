<!DOCTYPE html>
<link rel="stylesheet" type="text/css" href="./style.css" /> 

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.customers"%>
<% customers customer = (customers) request.getAttribute("customer"); %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update a Customer</title>
    </head>
    <body>
        <h1>Update a Customer</h1>
        <form name="updateForm" action="updateCar" method="get"/>
        
        <p>
            <label>Customer ID ID</label>
            <input readonly type="text" name="ID" value="<%= customer.getCustID()%>" />
            <br>
        </p>
    
        <p>
            <label>First Name</label>
            <input type="text" name="Make" value="<%= customer.getFirstName() %>"/>
            <br>
        </p>
        <p>

            <label>Last Name</label>
            <input type="text" name="Model" value="<%= customer.getLastName() %>"/>
            <br>
        </p>
        <p>
            <label>Address 1</label>
            <input type="text" name="Year" value="<%= customer.getAddr1() %>"/>
            <br>
        </p>
        <p>
            <label>Address 2</label>
            <input type="text" name="Color" value="<%= customer.getAddr2() %>"/>
            <br>
        </p>
        <p>
            <label>City</label>
            <input type="text" name="Color" value="<%= customer.getCity() %>"/>
            <br>
        </p>
        <p>
            <label>State</label>
            <input type="text" name="Color" value="<%= customer.getState() %>"/>
            <br>
        </p>
        <p>
            <label>Zip</label>
            <input type="text" name="Color" value="<%= customer.getZip() %>"/>
            <br>
        </p>
        <p>
            <label>Email Address</label>
            <input type="text" name="Color" value="<%= customer.getEmailAddr() %>"/>
            <br>
        </p>
        <p>
            <label>Age</label>
            <input type="text" name="Color" value="<%= customer.getAge() %>"/>
            <br>
        </p>
        <p>

            <input type="submit"  name="submit" value="Update"/>
        </p>
    </form>
    </body>
</html>
