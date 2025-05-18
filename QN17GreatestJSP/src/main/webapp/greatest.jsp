<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <title>Find Greatest Number</title>
</head>
<body>
    <h2>Enter Three Numbers</h2>
    <form method="post">
        <table>
            <tr><td>Number 1:</td><td><input type="text" name="num1" required></td></tr>
            <tr><td>Number 2:</td><td><input type="text" name="num2" required></td></tr>
            <tr><td>Number 3:</td><td><input type="text" name="num3" required></td></tr>
            <tr><td colspan="2"><input type="submit" value="Find Greatest"></td></tr>
        </table>
    </form>

    <%
        String n1 = request.getParameter("num1");
        String n2 = request.getParameter("num2");
        String n3 = request.getParameter("num3");

        if (n1 != null && n2 != null && n3 != null) {
            try {
                int a = Integer.parseInt(n1);
                int b = Integer.parseInt(n2);
                int c = Integer.parseInt(n3);
                int max = Math.max(a, Math.max(b, c));
    %>
                <h3>The greatest number is: <%= max %></h3>
    <%
            } catch (NumberFormatException e) {
    %>
                <h3>Please enter valid integers.</h3>
    <%
            }
        }
    %>
</body>
</html>
