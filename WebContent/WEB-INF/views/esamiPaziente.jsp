<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="it">

<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>Esami Paziente - Clinica Geeno</title>
<!-- CSS -->
<link href="resources/css/bootstrap.min.css" rel="stylesheet">
<link href="resources/css/clinica-geeno.css" rel="stylesheet">
</head>

<body>

	<!-- Navigation -->
	<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
	<div class="container">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target="#bs-example-navbar-collapse-1">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
				<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
			<a class="navbar-brand" href="${contextPath}/index">Clinica Geeno - Servizi
				Diagnostici</a>
		</div>
				<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
			<a class="navbar-brand" href="${contextPath}/index">Clinica Geeno - Servizi
				Diagnostici</a>
		</div>
		<div class="collapse navbar-collapse"
			id="bs-example-navbar-collapse-1">
			<ul class="nav navbar-nav navbar-right">
				<li class="active"><a href="patientProfile.jsp">Profilo</a></li>
				<li><a href="logout.jsp">Disconnetti</a></li>
				<li><a href="${contextPath}/visualizzaEsami">Visualizza Esiti</a></li>
				
			</ul>
		</div>
	</div>
	</nav>

	<!-- Page Content -->
	<div class="container">
		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">
					Servizi <small>Tipologie di esami</small>
				</h1>
				<ol class="breadcrumb">
					<li><a href="index.jsp">Home</a></li>
					<li class="active">Servizi</li>
				</ol>
			</div>
		</div>
		<!-- Exam Types -->	
		<p>${vuota}</p>	
		<c:forEach var="esame" items="${esami}">
		<div class="col-md-4 text-center">
			<div class="thumbnail">
				<img class="img-responsive"
					src="resources/Imgsrc/blood_transfusion.png" alt="" height="128"
					width="128">
				<div class="caption">
					<h5>${esame.tipologiaEsame} del ${esame.dataEsecuzione}</h5>
					<form action="visualizzaEsitiEsame" method="GET">
										<input type="hidden" name="esameScelto" value="${esame.codice}">
										<input type="submit" value="VisualizzaEsiti" />
				</div>
			</div>
		</div>
		</c:forEach>
		<hr>
		<!-- Footer -->
		<footer>
		<div class="row">
			<div class="col-lg-12">
				<p>Copyright &copy; geenolab.com 2016</p>
			</div>
		</div>
		</footer>
	</div>
	<!-- jQuery -->
	<script src="resources/js/jquery.js"></script>
	<!-- Bootstrap Core JavaScript -->
	<script src="resources/js/bootstrap.min.js"></script>
</body>
</html>