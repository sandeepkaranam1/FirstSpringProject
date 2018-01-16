<%@taglib  uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> LinkedHashMap RadioButtons</title>
</head>
<body>
<h1> LinkedHashMap RadioButtons</h1>
<form:form action="processForm4" modelAttribute="radiohash">
	
		
		
		 <form:radiobuttons path="favoriteLanguage" items="${radiohash.favoriteLanguageOptions}"  />
		<br><br>
		
		OperatingSystems:
		Linux<form:checkbox path="operatingSystems" value="Linux" />
		Mac OS <form:checkbox path="operatingSystems" value="Mac OS" />
		Windows<form:checkbox path="operatingSystems" value="Windows" />
		<input type="submit" value="Submit" />
	
	</form:form>

</body>
</html>