package com.student;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/ResultServlet")
public class ResultServlet extends HttpServlet {

protected void doPost(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {

int s1 = Integer.parseInt(request.getParameter("s1"));
int s2 = Integer.parseInt(request.getParameter("s2"));
int s3 = Integer.parseInt(request.getParameter("s3"));
int s4 = Integer.parseInt(request.getParameter("s4"));
int s5 = Integer.parseInt(request.getParameter("s5"));

String roll = request.getParameter("roll");
String name = request.getParameter("sname");

// server-side validation
String status;

if (s1 < 0 || s2 < 0 || s3 < 0 || s4 < 0 || s5 < 0) {
    status = "Invalid Marks";
} else {

    int total = s1 + s2 + s3 + s4 + s5;
    double avg = total / 5.0;

    if (s1 >= 40 && s2 >= 40 && s3 >= 40 && s4 >= 40 && s5 >= 40) {
        status = "PASS";
    } else {
        status = "FAIL";
    }

    request.setAttribute("avg", avg);
    request.setAttribute("status", status);
}

request.setAttribute("roll", roll);
request.setAttribute("name", name);

RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
rd.forward(request, response);
}
}