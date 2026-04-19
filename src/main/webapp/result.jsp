<!DOCTYPE html>
<html>
<head>
<title>Result</title>
</head>

<body>

<h2>Student Result</h2>

<p>Roll No: <%= request.getAttribute("roll") %></p>
<p>Name: <%= request.getAttribute("name") %></p>

<p>Average: <%= request.getAttribute("avg") %></p>
<p>Status: <%= request.getAttribute("status") %></p>

<br>

<a href="index.jsp">Go Back</a>

</body>
</html>