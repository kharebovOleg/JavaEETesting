<%@ page import="logic.Cart" %><%--
  Created by IntelliJ IDEA.
  User: 313
  Date: 25.12.2022
  Time: 16:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show cart</title>
</head>
<body>
<% Cart cart = (Cart) session.getAttribute("cart");%>

<p> Наименование: <%=cart.getName()%>
</p>
<p> Количество: <%=cart.getQuantity()%>
</p>
</body>
</html>
