<%@page language="java" %>
<html>
<%--<head> <a href="style.css"/> </head>--%>
<h1>Register Book</h1>
<form action="/addedBooks" modelAttribute="booksModel" >

  <%--@declare id="bookid"--%><%--@declare id="bookname"--%><%--@declare id="author"--%><%--@declare id="numberofpages"--%>
      <label for="BookId">Enter Book Id: </label>
    <input type="number"  name="BookId"><br>
    <label for="BookName">Enter Book Name : </label>
    <input type="text"  name="BookName"><br>
    <label for="Author">Enter Book Author : </label>
    <input type="text"  name="Author"><br>
    <label for="NumberOfPages">Enter Number of pages : </label>
    <input type="number"  name="NumberOfPages"><br>
    <input type="submit" value="Submit">
</form>
</html>
