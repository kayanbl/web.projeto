<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@include file='taglibs/taglibs.jsp' %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SCAI - Cadastro Apartamento</title>
</head>
<body>

<div>
	<%@include file='template/header.html' %>
		
		<div id="main" style="padding:50px;border:1px solid;">
					
					<h2>Cadastro Apartamento</h2>
					
					<hr>
					
			<s:form action="saveOrUpdateApartamento">
				<s:actionerror/>
				<s:actionmessage/>
				<s:textfield label="Rua" name="apartamento.rua"></s:textfield>
				<s:textfield label="Numero" name="apartamento.numero"></s:textfield>
				<s:textfield label="Complemento" name="apartamento.complemento"></s:textfield>
				<s:textfield label="Valor Diaria" name="apartamento.valorDiaria"></s:textfield>
				<s:submit value="Cadastrar"></s:submit>
				<a href="/web.projeto/home.jsp">Página Principal</a> &nbsp;&nbsp;&nbsp;&nbsp; <a href="/consultaApartamento.jsp">Consultar Apartamentos</a>
			</s:form>
	
		</div>
	
	<%@include file='template/footer.html' %>
	</div>

</body>
</html>