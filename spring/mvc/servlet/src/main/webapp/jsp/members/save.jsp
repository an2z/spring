<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="mvc.servlet.domain.member.MemberRepository" %>
<%@ page import="mvc.servlet.domain.member.Member" %>

<%
    MemberRepository memberRepository = MemberRepository.getInstance();

    // JSP가 서블릿으로 변환되어 request, response 사용 가능
    String username = request.getParameter("username");
    int age = Integer.parseInt(request.getParameter("age"));

    Member member = new Member(username, age);
    memberRepository.save(member);
%>

<html lang="en">
<head>
    <meta charset="UTF-8">
</head>
<body>
성공
<ul>
    <li>id=<%=member.getId()%></li>
    <li>username=<%=member.getName()%></li>
    <li>age=<%=member.getAge()%></li>
</ul>
<a href="/index.html">메인</a>
</body>
</html>
