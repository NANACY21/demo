<%@ page contentType="text/html;charset=gbk" language="java" pageEncoding="gbk" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<head>
    <meta charset="gbk" />
</head>

<body>

<h1>����jspʾ��</h1>
<%--allUserΪ��˵ļ�--%>
<c:forEach items="${allUser}" var="str">
    ${str}<br/>
</c:forEach>

</body>

</html>
