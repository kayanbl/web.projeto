<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@include file='/taglibs/taglibs.jsp' %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>

<style type="text/css">
body{
}
.menu_scai{
text-align: center;
word-spacing: 50px;
padding:10px;
background-color: #A1A1A1;
font-family: verdana;
font-size: small;
} 

a:hover{
font-weight: bold;
}

a:link{
text-decoration: none;
color: black;
}

</style>
  <title><decorator:title default="SCAI - " /></title>
  <decorator:head />
</head>
  
<body>

<table>
	<tr><td><img alt="scai" src="imagens/banner_scai.jpg"></td></tr>
	<tr><td>
	<div class="menu_scai">
	<a href="home.jsp">Home</a> <a href="cadastro.jsp">Cadastrar</a> <a href="#">Consultar</a> <a href="#">Relatório</a> <a href="#">Sair</a>
	</div>
	</td></tr>
	<tr><td><decorator:body/></td></tr>
	<tr><td><hr>SCAI v1.0-beta @ Developed by Kayan B. Lira</td></tr>
</table>

</body>
  
</html>