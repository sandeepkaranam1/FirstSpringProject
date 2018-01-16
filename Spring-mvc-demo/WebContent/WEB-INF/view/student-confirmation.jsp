<%@taglib  uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
p{color:red;font-family:courier;}
</style>
</head>

<body>
<p>
The Student is Confirmed :
${student.firstName}  ${student.lastName}
<br>
<br>

COUNTRY:${student.country}
<br>
FavoriteLanguage: ${student.favoriteLanguage}
</p>
</body>
</html>