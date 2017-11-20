<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Number page</title>

</head>
<body>
<div>
    <div>
        <h2>Number:</h2>
        <form action="/number", method="get">
            <div>
                <label for="minnumber">Number from</label>
                <input name="minnumber" id="minnumber" type="number" value="5">
            </div>
            <div>
                <label for="maxnumber">till</label>
                <input name="maxnumber" id="maxnumber" type="number" value="50">
            </div>
            <div>
                <label for="countnumber">How many number?</label>
                <input name="countnumber" id="countnumber" type="number" value="5">
            </div>
            <input type="submit" value="OK">
        </form>
    </div>
    <div>
        <c:forEach var="sortedList" items="${sortedList}">
            ${sortedList}
        </c:forEach>
    </div>
</div>

</body>
</html>
