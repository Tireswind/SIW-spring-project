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

<title>Contatti - Geeno</title>
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
			<a class="navbar-brand" href="index.jsp">Clinica Geeno - Servizi
				Diagnostici</a>
		</div>
		<div class="collapse navbar-collapse"
			id="bs-example-navbar-collapse-1">
			<ul class="nav navbar-nav navbar-right">
				<li><a href="medici.jsp">Chi siamo</a></li>
				<li><a href="tipologieEsami.jsp">Servizi</a></li>
				<li class="active"><a href="contatti.jsp">Contatti</a></li>
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
					Contatti <small>Come raggiungerci</small>
				</h1>
				<ol class="breadcrumb">
					<li><a href="index.jsp">Home</a></li>
					<li class="active">Contatti</li>
				</ol>
			</div>
		</div>
		<div class="row">
			<!-- Map Column -->
			<div class="col-md-8">
				<!-- Embedded Google Map -->
				<iframe width="100%" height="400px" frameborder="0" scrolling="no"
					marginheight="0" marginwidth="0"
					src="http://maps.google.com/maps?hl=en&amp;ie=UTF8&amp;ll=48.0625,2.677068&amp;spn=48.806174,2.113672&amp;t=m&amp;z=4&amp;output=embed"></iframe>
			</div>
			<!-- Contact Details -->
			<div class="col-md-4">
				<h3>Dettagli di contatto</h3>
				<p>
					Meri Oscar Palace, 79<br>Corte di Versailles, FR 90210<br>
				</p>
				<p>
					<i class="fa fa-phone"></i> <abbr title="Phone">T</abbr>: (123)
					456-7890
				</p>
				<p>
					<i class="fa fa-envelope-o"></i> <abbr title="Email">E</abbr>: <a
						href="mailto:merimeri@geenolab.com">merimeri@geenolab.com</a>
				</p>
				<p>
					<i class="fa fa-clock-o"></i> <abbr title="Orario">O</abbr>: Dal
					lunedì al venerdì: dalle ore 9:00 alle ore 17:00
				</p>
			</div>
		</div>

		<!-- Contact Form -->
		<div class="row">
			<div class="col-md-8">
				<h3>Scrivici un messaggio</h3>
				<form name="sentMessage" id="contactForm" novalidate>
					<div class="control-group form-group">
						<div class="controls">
							<label>Nome completo:</label> <input type="text"
								class="form-control" id="name" required
								data-validation-required-message="Per favore inserisca il suo nome.">
							<p class="help-block"></p>
						</div>
					</div>
					<div class="control-group form-group">
						<div class="controls">
							<label>Numero di telefono:</label> <input type="tel"
								class="form-control" id="phone" required
								data-validation-required-message="Per favore inserisca il suo numero di telefono.">
						</div>
					</div>
					<div class="control-group form-group">
						<div class="controls">
							<label>Indirizzo Email:</label> <input type="email"
								class="form-control" id="email" required
								data-validation-required-message="Per favore inserisca il suo indirizzo email.">
						</div>
					</div>
					<div class="control-group form-group">
						<div class="controls">
							<label>Messaggio:</label>
							<textarea rows="10" cols="100" class="form-control" id="message"
								required
								data-validation-required-message="Per favore inserisca il suo messaggio."
								maxlength="999" style="resize: none"></textarea>
						</div>
					</div>
					<div id="success"></div>
					<button type="submit" class="btn btn-primary">Invia
						Messaggio</button>
				</form>
			</div>

		</div>
		<hr>

		<!-- Footer -->
		<footer>
		<div class="row">
			<div class="col-lg-12">
				<p>Copyright &copy; geenolab 2016</p>
			</div>
		</div>
		</footer>
	</div>
	<!-- jQuery -->
	<script src="resources/js/jquery.js"></script>
	<!-- Bootstrap Core JavaScript -->
	<script src="resources/js/bootstrap.min.js"></script>
	<!-- Contact Form JavaScript -->
	<script src="resources/js/jqBootstrapValidation.js"></script>
	<script src="resources/js/contact_me.js"></script>
</body>

</html>