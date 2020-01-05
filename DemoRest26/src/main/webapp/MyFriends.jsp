<!DOCTYPE html>
<html>
<body>

<h2>Rest Friends</h2>

<hr>
<form action="http://localhost:8080/DemoRest26/webapi/aliens/createalien" method="post">
  <p>
    <fieldset>
      <h1>Create Friends</h1>
      <br>
      
       First Name: <INPUT type="text" name="friendfname" tabindex="1">  
       Last Name: <INPUT type="text" name="friendlname" tabindex="2">
       Domain: <INPUT type="text" name="frienddomain" tabindex="3"> 
       City: <INPUT type="text" name="friendcity" tabindex="4"> 
       Points: <INPUT type="number" name="friendpoints" tabindex="5">
    </fieldset>
  </p>
  <br><br>
  <input type="submit" value="Create">
  <p>If you click the "Update" button, the form-data will be sent to a page called "/aliens/createalien" resource.</p>
</form> 


<hr>
<form action="http://localhost:8080/DemoRest26/webapi/aliens/updatecity" method="post">
  <p>
    <fieldset>
      <h1>Update City</h1>
      <br>
      
      Friend Id: <INPUT type="number" name="friendid" tabindex="1">
      Friend First Name: <INPUT type="text" name="friendfname" tabindex="2">  
      Friend Domain: <INPUT type="text" name="frienddomain" tabindex="3"> 
      Friend City: <INPUT type="text" name="friendcity" tabindex="4"> 
    </fieldset>
  </p>
  <br><br>
  <input type="submit" value="Update">
  <p>If you click the "Update" button, the form-data will be sent to a page called "/aliens/updatecity" resource.</p>
</form> 
<hr>

<form action="http://localhost:8080/DemoRest26/webapi/aliens/updatedomain" method="post">
  <p>
    <fieldset>
      <h1>Update Domain</h1>
      <br>
      
      Friend Id: <INPUT type="number" name="friendid" tabindex="1">
      Friend First Name: <INPUT type="text" name="friendfname" tabindex="2">  
      Friend Domain: <INPUT type="text" name="frienddomain" tabindex="3">  
    </fieldset>
  </p>
  <br><br>
  <input type="submit" value="Update">
  <p>If you click the "Update" button, the form-data will be sent to a page called "aliens/updatedomain" resource.</p>
</form>

</body>
</html>