<%@ page import="javax.servlet.http.Cookie" %>

<%
String name = request.getParameter("name");
String domain = request.getParameter("domain");
int maxage = Integer.parseInt(request.getParameter("maxage"));

Cookie c1 = new Cookie("name", name);
Cookie c2 = new Cookie("domain", domain);

c1.setMaxAge(maxage);
c2.setMaxAge(maxage);

response.addCookie(c1);
response.addCookie(c2);
%>

<html>
<body>

<h2>Cookie Added Successfully</h2>

<p>Name: <%= name %></p>
<p>Domain: <%= domain %></p>
<p>Max Age: <%= maxage %> seconds</p>

<br>

<a href="showCookies.jsp">Go to Active Cookie List</a>

</body>
</html>