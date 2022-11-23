<%@ page import="java.util.List" %>
<%@ page import= "member.MemberRepository" %>
<%@ page import= "member.MemberDAO" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
 MemberRepository memberRepository = MemberRepository.getInstance();
 List<MemberDAO> members = memberRepository.findAll();
%>


<html>
<head>
 <meta charset="UTF-8">
 <title>Title</title>
</head>
<body>
<a href="/index.html">메인</a>
<table>
 <thead>
 <th>id</th>
 <th>username</th>
 <th>age</th>
 </thead>
 <tbody>
<%
 for (MemberDAO member : members) {
    out.write(" <tr>");
    out.write(" <td>" + member.getId() + "</td>");
    out.write(" <td>" + member.getUsername() + "</td>");
    out.write(" <td>" + member.getAge() + "</td>");
    out.write(" </tr>");
 }
%>
 </tbody>
</table>
</body>
</html>