<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<%--
  Created by IntelliJ IDEA.
  User: SHEEO
  Date: 2018/4/30
  Time: 16:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<body>
<table border="1" style="color: blue">
    <tr>
        <td>账号</td>
        <td>密码</td>
        <td>类型</td>
        <td>头像</td>
    </tr>

    <%--   默认是true所以不能使用el表达式 ,默认是true所以不能使用el表达式 --%>
    <c:forEach items="${userlist}"  var="user">
        <tr>
            <td>${user.emp_no}</td>
            <td>${user.emp_pass}</td>
            <td>${user.type}</td>
            <td>${user.head_path}</td>
            <%--<td>--%>
                <%--<a href="${pageContext.request.contextPath }/rest/user/updateByID/${user.emp_no}">修改</a>--%>
            <%--</td>--%>
        </tr>

    </c:forEach>

</table>
</body>
</html>