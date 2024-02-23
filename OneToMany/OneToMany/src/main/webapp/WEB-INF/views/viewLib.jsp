<%@ page import="com.example.OneToMany.Models.LibraryModel" %>
<%@ page import="java.util.List" %>
<%@ page language="java" %>
<h2>Library List</h2>
<table border="1">
    <tr>
        <th>Library ID</th>
        <th>Library Name</th>
        <th>Library Location</th>
        <th>Library Contact Information</th>
        <th>Books</th>
        <th>View Books</th>
        <th>Delete</th>
        <th>Update</th>
    </tr>
    <%
        List<LibraryModel> libraryList = (List<LibraryModel>) request.getAttribute("libraryList");
        for (LibraryModel library : libraryList) {
    %>
    <tr>
        <td><%= library.getLibraryID() %></td>
        <td><%= library.getName() %></td>
        <td><%= library.getLocation() %></td>
        <td><%= library.getContactInformation() %></td>
        <td>
            <a href="addBooks?LibraryID=<%=library.getLibraryID()%>" style="background-color: lightcoral"> Add Books </a>
        </td>
        <td>
            <a href="viewBooks?LibraryID=<%=library.getLibraryID()%>" style="background-color: lightyellow"> View Books</a>
        </td>
        <td>
            <a href="deleteLib?LibraryID=<%=library.getLibraryID()%>" style="background-color: lightgreen"> Delete </a>
        </td>
        <td>
            <a href="updateLibrary?LibraryID=<%=library.getLibraryID()%>" style="background-color: lightsteelblue"> Edit </a>
        </td>
    </tr>
    <% } %>
</table>
<a href="first">First Page</a>


