<%@ page import="javax.servlet.http.Cookie" %>

<html>
<body>

<h2>Active Cookie List</h2>

<%
Cookie[] cookies = request.getCookies();

if (cookies != null) {
    for (Cookie c : cookies) {
        out.println("<p>" + c.getName() + " = " + c.getValue() + "</p>");
    }
} else {
    out.println("No cookies available");
}
%>

<br>

<a href="index.jsp">Back</a>

</body>
</html>