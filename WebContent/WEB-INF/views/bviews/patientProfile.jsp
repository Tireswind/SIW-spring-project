<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Profilo amministratore - Clinica Geeno</title>
<link href="Static/css/bootstrap.min.css" rel="stylesheet">
<link href="Static/css/clinica-geeno.css" rel="stylesheet">
</head>
<body>
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

		<!-- Page Heading/Breadcrumbs -->
		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">Profilo amministratore</h1>
				<ol class="breadcrumb">
					<li><a href="index.jsp">Home</a></li>
					<li class="active">Profilo amministratore</li>
				</ol>
			</div>
		</div>

		<!-- Content Row -->
		<div class="row">
			<!-- Sidebar Column -->
			<div class="col-md-3">
				<div class="list-group">
					<a href="patientProfile.jsp" class="list-group-item">Profilo</a> <a
						href="?????.jsp" class="list-group-item"></a> <a href="?????.jsp"
						class="list-group-item"></a> <a href="?????.jsp"
						class="list-group-item"></a> <a href="?????.jsp"
						class="list-group-item"></a> <a href="logout.jsp"
						class="list-group-item">Disconnetti</a>
				</div>
			</div>
			<!-- Content Column -->
			<div class="col-md-9">
				<h2>Benvenuto ${patient.nome} ${patient.cognome}</h2>
				<hr>
				<h4>Dettagli profilo</h4>
				<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.
					Soluta, et temporibus, facere perferendis veniam beatae non
					debitis, numquam blanditiis necessitatibus vel mollitia dolorum
					laudantium, voluptate dolores iure maxime ducimus fugit.</p>
			</div>
		</div>
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
	<script src="Static/js/jquery.js"></script>
	<!-- Bootstrap Core JavaScript -->
	<script src="Static/js/bootstrap.min.js"></script>
</body>
</html>