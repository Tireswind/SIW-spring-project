<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="it">

<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>Tipologie Esami - Clinica Geeno</title>
<!-- CSS -->
<link href="Static/css/bootstrap.min.css" rel="stylesheet">
<link href="Static/css/clinica-geeno.css" rel="stylesheet">
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
			<a class="navbar-brand" href="index.jsp">Clinica Geeno - Servizi
				Diagnostici</a>
		</div>
		<div class="collapse navbar-collapse"
			id="bs-example-navbar-collapse-1">
			<ul class="nav navbar-nav navbar-right">
				<li><a href="medici.jsp">Chi siamo</a></li>
				<li class="active"><a href="tipologieEsami.jsp">Servizi</a></li>
				<li><a href="contatti.jsp">Contatti</a></li>
				<li><a href="faq.jsp">FAQ</a></li>
				<li><a href="loginPaziente.jsp">Login Paziente</a></li>
				<li><a href="loginAdmin.jsp">Login Amministratore</a></li>
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
		<%
			for (int i = 0; i < 6; i++) {//for each
		%>
		<div class="col-md-4 text-center">
			<div class="thumbnail">
				<img class="img-responsive"
					src="Static/Imgsrc/blood_transfusion.png" alt="" height="128"
					width="128">
				<div class="caption">
					<h3>Exam type name</h3>
					<div class="panel panel-default">
						<div class="panel-heading">
							<button type="button" class="glyphicon glyphicon-triangle-bottom"
								data-toggle="collapse" data-target="#collapseOne"></button>
						</div>
						<div id="collapseOne" class="collapse">
							<p>Anim pariatur cliche reprehenderit, enim eiusmod high life
								accusamus terry richardson ad squid. 3 wolf moon officia aute,
								non cupidatat skateboard dolor brunch.</p>
						</div>
					</div>

				</div>
			</div>
		</div>
		<%
				}
			%>
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