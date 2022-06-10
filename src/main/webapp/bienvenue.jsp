<%@page import="models.Enseignant"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%Enseignant u = (Enseignant) session.getAttribute("currentUser"); %>
Bienvenu Mr/Mme : <%=u.getNom() %> <%=u.getPrenom() %>
<br>Vos param�tres sont  : 
<br>&nbsp;&nbsp;&nbsp;Login : <%=u.getLogin() %>
<br>&nbsp;&nbsp;&nbsp;Mot de passe  : <%=u.getMotDePasse() %>
<br>
<h2>Liste des utilisaturs : </h2>
<table>
<tr><th>Nom</th><th>Prenom</th><th>Login</th><th>Mot de pass</th></tr>
<c:forEach items="${listeUsers }" var="user">
<tr><td>${user.nom }</td><td>${user.prenom }</td><td>${user.login }</td><td>${user.pwd }</td></tr>
</c:forEach>
</table>
<br><a href=Disconnect>Disconnect</a> 
</body>
</html>