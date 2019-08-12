<%@ page import="main.org.itstep.bibliy.AnswerList" %>
<%@ page import="main.org.itstep.bibliy.Answer" %>
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Answer List</title>

    <h1>Answers</h1>
    <%! AnswerList answerList = AnswerList.getInstance();%>
    <table border="1px"width="900px">
        <tr>
            <td>Date</td>
            <td>Name</td>
            <td>Surname</td>
            <td>Age</td>
            <td>Gender</td>
            <td>2+2</td>
        </tr>
        <% for (int i = 0; i < answerList.list.size(); i++) { %>
        <%
        Answer answer = answerList.list.get(i);%>
        <tr>
            <td><%= answer.getDate()%> </td>
            <td><%= answer.getName()%> </td>
            <td><%= answer.getSurname()%> </td>
            <td><%= answer.getAge()%> </td>
            <td><%= answer.getGender()%> </td>
            <td><span style="color: <%=(answer.getAnswer()== 4) ? "green" : "red"%>;"> <%=answer.getAnswer()%> </td>
        </tr>

        <%}%>

    </table>
</head>
<body>

</body>
</html>