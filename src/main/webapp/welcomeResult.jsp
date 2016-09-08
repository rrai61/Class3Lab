<%-- 
    Document   : welcomeResult
    Created on : Sep 7, 2016, 7:15:24 PM
    Author     : ritu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome Result Page</title>
    </head>
    <body>
                <%
            Object obj = request.getAttribute("msg");
            String msg = "Unknown";
            if(obj != null) {
                msg = obj.toString();
            }

            out.println("<p style='color:blue;font-weight:bold;'>" + msg + "</p>");

        %>
        <p><a href="welcome.html">Back to Welcome</a></p>
    </body>
</html>
