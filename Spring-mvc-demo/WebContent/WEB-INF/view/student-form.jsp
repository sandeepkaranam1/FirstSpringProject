
<%@taglib  uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
</head>

<body>

<form:form action="processForm" modelAttribute="student">

First Name: <form:input path="firstName" />
<br>

Last Name : <form:input path="lastName"/>

<br>
<center>
<form:select path="country">
 <form:options items="${theCountryOptions}"/>
</form:select>
</center>
<br><br>
Favorite Language:
Java <form:radiobutton path="favoriteLanguage" value="Java"/>
C# <form:radiobutton path="favoriteLanguage" value="C#"/>
PHP<form:radiobutton path="favoriteLanguage" value="PHP"/>
Ruby<form:radiobutton path="favoriteLanguage" value="Ruby"/>
<input type="submit" value="SUBMIT"/>

</form:form>

</body>
</html>