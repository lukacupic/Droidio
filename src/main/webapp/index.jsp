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
    <p>Welcome! Click the button to generate a random Star Wars word :)</p>
    <br><br><br>

    <form action="<%=request.getContextPath()%>/servlets/generator" class=container1>
        <button>Generate!</button>
    </form>

    <% if (word != null) { %>
        <p>The generated word is: <b><%=word%></b></p>
    <% } %>
</div>
</body>
</html>