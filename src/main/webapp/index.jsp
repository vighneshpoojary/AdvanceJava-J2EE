<!DOCTYPE html>
<html>
<head>
<title>Cookie Management</title>
</head>

<body>

<h2>Cookie Management System</h2>

<form action="addCookie.jsp" method="post">

Name: <input type="text" name="name"><br><br>

Domain: <input type="text" name="domain"><br><br>

Max Age (seconds): <input type="number" name="maxage"><br><br>

<input type="submit" value="Add Cookie">

</form>

<br>

<a href="showCookies.jsp">Go to Active Cookie List</a>

</body>
</html>