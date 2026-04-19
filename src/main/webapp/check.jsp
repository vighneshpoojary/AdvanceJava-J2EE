<%
String name = (String) session.getAttribute("user");

if (name == null) {
    out.print("Session Expired");
} else {
    out.print("Hello " + name);
}
%>