<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<html>
<head>
    <title>Star Wars Word Generator</title>
    <link href="style.css" rel="stylesheet" type="text/css">
</head>
<body>

<div class=container1>
    <p><b>Star Wars Word Generator</b></p>

    <div id="container2">
        <h2>Hello, there!</h2>
    </div>
    <p><button type="button" onclick="generateWord()">Generate!</button></p>
</div>
<script>
    function generateWord() {
        var xhttp = new XMLHttpRequest();
        xhttp.onreadystatechange = function() {

        if (this.readyState == 4 && this.status == 200) {
                document.getElementById("container2").innerHTML = "<h2>" + this.responseText + "</h2>"
            }
        };
        xhttp.open("GET", "<%=request.getContextPath()%>/servlets/generator", true);
        xhttp.send();
    }
</script>
</body>
</html>