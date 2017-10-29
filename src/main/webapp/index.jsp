<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%
    String word = (String) request.getSession().getAttribute("word");
%>

<html>
<body>

Welcome! Click the button to generate a random Star Wars word :)
<p>
<form action="<%=request.getContextPath()%>/servlets/generator">
    <button>Generate!</button><br>
</form>
<p>

<% if (word != null) { %>
The generated word is: <b><%=word%></b>!
<% } %>
</body>
</html>