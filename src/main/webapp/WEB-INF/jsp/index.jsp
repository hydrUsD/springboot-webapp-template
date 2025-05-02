<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html lang="en">
<head>
  <meta charset="UTF-8"/>
  <title>Spring Boot JSP Template</title>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css"/>
</head>
<body>
<div class="container">
  <h1>${message}</h1>
  <p>Welcome to your JSP version of the Spring Boot template.</p>
</div>
</body>
</html>