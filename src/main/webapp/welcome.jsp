<%
String name = request.getParameter("uname");
int time = Integer.parseInt(request.getParameter("time"));

out.print("Hello " + name + " <br>");
out.print("Session started... <br>");

session.setAttribute("user", name);
session.setMaxInactiveInterval(time);

out.print("Session expiry set to " + time + " seconds <br>");
%>

<br>
<a href="check.jsp">Check Session Value</a>