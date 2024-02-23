<%@ page import="com.example.OneToMany.Models.LibraryModel" %>
<%@ page import="java.util.List" %>
<%@ page import="com.example.OneToMany.Models.BooksModel" %>
<%@ page language="java" %>
<h2>Books List</h2>
<table border="1">
    <tr>
        <th>Book ID</th>
        <th>Book Name</th>
        <th>Book Author</th>
        <th>Number of Pages</th>
        <th>Update</th>
        <th>Delete</th>
    </tr>
    <%
        List<BooksModel> booksList = (List<BooksModel>) request.getAttribute("booksList");
        for (BooksModel books : booksList) {
    %>
    <tr>
        <td><%= books.getBookId() %></td>
        <td><%= books.getBookName() %></td>
        <td><%= books.getAuthor() %></td>
        <td><%= books.getNumberOfPages()%></td>
        <td>
            <a href="updateBooks?BookId=<%=books.getBookId()%>"> Edit</a>
        </td>
        <td>
            <a href="deleteBooks?BookId=<%=books.getBookId()%>"> Delete </a>
        </td>
    </tr>
    <% } %>
</table>
<a href="viewLib">View Library</a>


