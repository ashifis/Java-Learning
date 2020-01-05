<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Rest Hibernate
</title>
</head>
<body>
<h2>Rest Friends</h2>
<form action="http://localhost:8080/DemoRest26/webapi/customers/createcustomer" method="post">
  <p>
    <fieldset>
      <h1>Create Customer</h1>
      <br>
      Customer Id: <INPUT type="number" name="customerid" tabindex="1">
      First Name: <INPUT type="text" name="customername" tabindex="2">  
      Age : <INPUT type="number" name="customerage" tabindex="3">  
    </fieldset>
  </p>
  <br><br>
  <input type="submit" value="Submit">
  <p>If you click the "Age" button, the form-data will be sent to a page called "aliens/updatedomain" resource.</p>
</form>


</body>
</html>