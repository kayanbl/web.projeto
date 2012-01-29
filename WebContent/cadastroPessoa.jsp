<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@include file='taglibs/taglibs.jsp' %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<s:head theme="ajax"/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SCAI - Cadastro Pessoa</title>
</head>
<body>

		<div id="main" style="padding:50px;border:1px solid;">
					
					<h2>Cadastro Pessoa</h2>
					
					<hr>
					
					<s:form action="saveOrUpdatePessoa">
					
						<!-- DADOS PESSOAIS -->
						
						<s:textfield label="Nome" name="pessoa.nome"/>
						<s:datetimepicker label="Data de Nascimento" name="pessoa.dataNascimento" />
						<s:radio list="sexo" label="Sexo" name="pessoa.sexo"/>
						<s:textfield label="CPF" name="pessoa.cpf"/>
						<s:textfield label="E-mail" name="pessoa.email"/>
						
						
						<!--  SUBMIT -->
						<s:submit value="Cadastrar"></s:submit>
						<a href="/web.projeto/cadastro.jsp">Voltar</a> &nbsp;&nbsp;&nbsp;&nbsp; 
						<a href="/consultaPessoa.jsp">Consultar Pessoas</a>
					</s:form>	
		</div>
	
</body>
</html>