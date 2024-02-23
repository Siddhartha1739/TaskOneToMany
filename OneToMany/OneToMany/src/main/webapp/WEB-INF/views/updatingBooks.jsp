<%@page language="java" %>
<html>
<%--<head> <a href="style.css"/> </head>--%>
<h1>Update Book</h1>
<form action="/updatedBooks"  >
    <%--@declare id="bookid"--%><%--@declare id="bookname"--%><%--@declare id="author"--%><%--@declare id="numberofpages"--%>
        <label for="BookId">Enter Book Id: </label>
        <input type="number"  name="BookId" value="${BookId}"><br>
        <label for="BookName">Enter Book Name : </label>
        <input type="text"  name="BookName" value="${BookName}"><br>
        <label for="Author">Enter Book Author : </label>
        <input type="text"  name="Author" value="${Author}"><br>
        <label for="NumberOfPages">Enter Number of pages : </label>
        <input type="number"  name="NumberOfPages" value="${NumberOfPages}"><br>
        <input type="submit" value="Submit">
</form>
</html>
