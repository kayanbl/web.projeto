<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%> 
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sistema - Login</title>

<style type="text/css">

#tela_login{
border: solid thin black;
border-radius: 1em;
box-shadow: black 0.5em 0.5em 0.3em;
width: 300px;
height: 235px;
margin: 0 auto;
}


body{
background-color: silver;
}

</style>

</head>
<body>

<div style="width:100%; background-color: silver;">
	<h2 style="text-align:center;"> SCAI - Sistema de controle de aluguéis imobiliários </h2>
	<p>
</div>

<hr>
<p>

<div id="tela_login">

<h4 style="text-align: center;">Identificação do Usuário</h4>
<hr>

<font color="red"><s:actionerror/></font>


<s:form action="logar">

	<s:textfield label="Usuário" name="pessoa.usuario"></s:textfield> <p/>
	<s:password label="Senha" name="pessoa.senha"></s:password>
	<s:submit value="Entrar"></s:submit>
	
</s:form>


</div>

<p/>
<hr>
<p/>
Versão 1.0-beta @ Sistema de Controle de Aluguéis

</body>
</html>