<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@include file='taglibs/taglibs.jsp' %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
.texto_cabecalho{
font-family: verdana;
font-size: large;
background-color: silver;
border-width: thin;
}
.texto_links{
font-family: verdana;
font-size: medium;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro</title>
</head>
<body>
<hr>
<table border="0px">

<tr>
<th class="texto_cabecalho">Cadastro</th>
</tr>
<tr>
<td><img src="imagens/cadastro.jpg" width="80%" style="border-top-width: thin;"/></td>
<td>

<div class="texto_links">
<ul>
	<li><a href="cadastroApartamento.jsp">Apartamento</a></li>
	<li><s:a href="preparePessoa.action">Pessoa</s:a></li>
	<li>Aluguel</li>
	<li>Despesa</li>
</ul>
</div>

</td>
</tr>
</table>	
	
</body>
</html>