<%--
  Created by IntelliJ IDEA.
  User: chencong
  Date: 2017/9/11
  Time: 21:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>首页</title>
</head>
<body>

<table>
    <c:forEach items="${sessionScope.accountLists}" var="account">
        <tr>
            <td>${account.accountId}</td>
            <td>${account.accountName}</td>
            <td>${account.code}</td>
            <td>${account.openTime}</td>
        </tr>
    </c:forEach>
</table>
<s:debug/>

</body>
</html>
