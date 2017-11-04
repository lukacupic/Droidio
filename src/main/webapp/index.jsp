<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%
    String word = (String) request.getSession().getAttribute("word");
%>

<html>
<head>
    <title>Star Wars Word Generator</title>
    <link href="style.css" rel="stylesheet" type="text/css">
</head>
<body>

<div class=container1>
    <p><b>Star Wars Word Generator</b></p>
    <br>
    <% if (word != null) { %>
    <p><%=word%></p>
    <% } %>
    <br>
    <form action="<%=request.getContextPath()%>/servlets/generator" class=container1>
        <button>Make word</button>
    </form>
</div>
</body>
</html>