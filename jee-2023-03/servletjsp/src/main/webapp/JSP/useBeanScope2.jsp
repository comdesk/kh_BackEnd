<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<jsp:useBean id="myBean" class="org.zerock.myapp.domain.LoginBean" scope="session" />

<!DOCTYPE html>
<html lang="ko">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>useBeanScope2.jsp</title>
</head>

<body>
    <h1>/JSP/useBeanScope2.jsp</h1>
    <hr>

    <h1>useBean 사용실습</h1>

    <ol>
        <li>userid: <%= myBean.getUserid() %></li>
        <li>passwd: <%= myBean.getPasswd() %></li>
    </ol>
</body>

</html>
