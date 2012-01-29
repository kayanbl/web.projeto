<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@include file='taglibs/taglibs.jsp' %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<s:head theme="ajax"/>
<body>

		<div id="main" style="padding:50px;border:1px solid;">
					
					<h2>Cadastro Apartamento</h2>
					
					<hr>
					
			<s:form action="saveOrUpdateApartamento">
				<s:actionerror/>
				<s:actionmessage/>
				<s:textfield label="Rua" name="apartamento.endereco.rua"></s:textfield>
				<s:textfield label="Numero" name="apartamento.endereco.numero"></s:textfield>
				<s:textfield label="Complemento" name="apartamento.endereco.complemento"></s:textfield>
				<s:submit value="Cadastrar"></s:submit>
				<a href="/web.projeto/cadastro.jsp">Voltar</a> &nbsp;&nbsp;&nbsp;&nbsp; <a href="/consultaApartamento.jsp">Consultar Apartamentos</a>
			</s:form>
	
		</div>
	
</body>
</html>