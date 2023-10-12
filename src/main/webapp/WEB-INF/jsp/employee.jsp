<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>

<html>
    <head>
        <title></title>
    </head>
    <body>
        Employee List

        <br>

        <c:forEach items="${employees}" var="employee">
            ${employee.id} - ${employee.name} - ${employee.dob} - ${employee.salary} <br>
        </c:forEach>
    </body>
</html>