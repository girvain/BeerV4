<%@ page import="java.util.*" %>
<%@ page import="javax.swing.text.html.HTMLDocument" %>
<%--
  Created by IntelliJ IDEA.
  User: gavin
  Date: 15/02/19
  Time: 20:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1 align="center">Beer Recommendations JSP</h1>
    <p></p>

    <%
        List styles = (List)request.getAttribute("styles");
        Iterator it = styles.iterator();
        while(it.hasNext()) {
            out.print("<br>try: " + it.next());
        }
    %>

</body>
</html>
