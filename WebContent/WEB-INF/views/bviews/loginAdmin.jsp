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

<title>Login Amministratore - Clinica Geeno</title>
<!-- CSS -->
<link href="resources/css/bootstrap.min.css" rel="stylesheet">
<link href="resources/css/login.css" rel="stylesheet">
<link href="resources/css/clinica-geeno.css" rel="stylesheet">
</head>

<body>
	<%
		Boolean isLoggedIn = (Boolean) request.getSession().getAttribute("isLoggedIn");
		if (isLoggedIn != null && isLoggedIn) {
			response.sendRedirect("adminProfile.jsp");
		}
	%>
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
		<div class="collapse navbar-collapse"
			id="bs-example-navbar-collapse-1">
			<ul class="nav navbar-nav navbar-right">
				<li><a href="${contextPath}/medici">Medici</a></li>
				<li><a href="${contextPath}/tipologieEsami">Servizi</a></li>
				
				<li><a href="${contextPath}/contatti">Contatti</a></li>
				<li><a href="${contextPath}/faq">FAQ</a></li>
				<li><a href="${contextPath}/loginPaziente">Login Paziente</a></li>
				<li><a href="${contextPath}/loginAdmin">Login Amministratore</a></li>
			</ul>
		</div>
	</div>
	</nav>

	<!-- Page Content -->
	<div class="container">
		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">Login amministratore</h1>
				<ol class="breadcrumb">
					<li><a href="index.jsp">Home</a></li>
					<li class="active">Login amministratore</li>
				</ol>
			</div>
		</div>
		<!-- Login panel -->
		<section id="login">
		<div class="container">
			<div class="row">
				<div class="col-xs-12">
					<div class="form-wrap">
						<h1>Effettua l'accesso tramite il tuo id</h1>
						<form action="ControllerLoginAdmin" method="post" id="login-form"
							autocomplete="off">
							<div class="form-group">
								<label for="id" class="sr-only">Id</label> <input type="text"
									name="id" id="id" class="form-control" placeholder="Id">
							</div>
							<div class="form-group">
								<label for="password" class="sr-only">Password</label> <input
									type="password" name="password" id="password"
									class="form-control" placeholder="Password">
							</div>
							<div class="checkbox">
								<span class="character-checkbox" onclick="showPassword()"></span>
								<span class="label">Mostra password</span>
							</div>
							<input type="submit" id="btn-login"
								class="btn btn-custom btn-lg btn-block" value="Accedi">
						</form>
						<a href="javascript:;" class="forget" data-toggle="modal"
							data-target=".forget-modal">Password dimenticata?</a>
					</div>
				</div>
			</div>
		</div>
		</section>

		<div class="modal fade forget-modal" tabindex="-1" role="dialog"
			aria-labelledby="myForgetModalLabel" aria-hidden="true">
			<div class="modal-dialog modal-sm">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal">
							<span aria-hidden="true">×</span> <span class="sr-only">Chiudi</span>
						</button>
						<h4 class="modal-title">Recupera password</h4>
					</div>
					<div class="modal-body">
						<p>Scrivi il tuo id</p>
						<input type="text" name="recovery-id" id="recovery-id"
							class="form-control" autocomplete="off">
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">Annulla</button>
						<button type="button" class="btn btn-custom">Recupera</button>
					</div>
				</div>
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
	<script src="resources/js/jquery.js"></script>
	<!-- Bootstrap Core JavaScript -->
	<script src="resources/js/bootstrap.min.js"></script>
	<!-- Login JavaScript -->
	<script src="resources/js/login.js"></script>
</body>
</html>