<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
	<head>
		<title>Good Buy</title>
		<link href="<c:url value="/voto.css"/>" rel="stylesheet" type="text/css" media="screen" />
		<link href="<c:url value="/javascripts/jquery.autocomplete.css"/>" rel="stylesheet" type="text/css" media="screen" />
		<link href="<c:url value="/pure-min.css"/>" rel="stylesheet" type="text/css" media="screen" />
		<script type="text/javascript" src="<c:url value="/javascripts/jquery-1.3.2.min.js"/>"></script>
		<script type="text/javascript" src="<c:url value="/javascripts/jquery.validate.min.js"/>"></script>
		<script type="text/javascript" src="<c:url value="/javascripts/jquery.autocomplete.min.js"/>"></script>
		<script type="text/javascript" src="<c:url value="/javascripts/jquery.puts.js"/>"></script>
		<fmt:setLocale value="pt_br"/>
	</head>
	
<body>
	<div id="cabecalho">
		<h1>Vote no Filme</h1>
	</div>
	<div id="erros">
		<ul>
		</ul>
	</div>	