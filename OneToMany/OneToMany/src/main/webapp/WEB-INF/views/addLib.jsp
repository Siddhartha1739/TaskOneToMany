<%@page language="java" %>
<html>
<%--<head> <a href="style.css"/> </head>--%>
<h1>Register Library</h1>
<form action="/addedLib" modelAttribute="libraryModel" >
   <%--@declare id="libraryid"--%><%--@declare id="name"--%><%--@declare id="location"--%><%--@declare id="contactinformation"--%>
    <label for="LibraryID">Enter Library Id: </label>
    <input type="number"  name="LibraryID"><br>
    <label for="Name">Enter Library Name : </label>
    <input type="text"  name="Name"><br>
    <label for="Location">Enter Library Location : </label>
    <input type="text"  name="Location"><br>
    <label for="ContactInformation">Enter Contact Number : </label>
    <input type="number"  name="ContactInformation"><br>
       <input type="submit" value="Submit">
</form>
</html>
