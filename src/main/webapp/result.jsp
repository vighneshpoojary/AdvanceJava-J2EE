<!DOCTYPE html>
<html>
<head>
<title>Result Page</title>
</head>

<body>

<h2>Processing Result</h2>

<p>
<%= request.getAttribute("message") %>
</p>

<%
if (request.getAttribute("username") != null) {
%>

<h3>Submitted Data:</h3>

<p>Username: <%= request.getAttribute("username") %></p>
<p>Email: <%= request.getAttribute("email") %></p>
<p>Designation: <%= request.getAttribute("designation") %></p>

<%
}
%>

<a href="index.jsp">Back</a>

</body>
</html>