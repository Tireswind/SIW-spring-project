<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="it">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Home - Clinica Geeno</title>
<link href="resources/css/bootstrap.min.css" rel="stylesheet">
<link href="resources/css/clinica-geeno.css" rel="stylesheet">
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
			<a class="navbar-brand" href="index.jsp">Clinica Geeno - Servizi
				Diagnostici</a>
		</div>
		<div class="collapse navbar-collapse"
			id="bs-example-navbar-collapse-1">
			<ul class="nav navbar-nav navbar-right">
				<li><a href="medici.jsp">Chi siamo</a></li>
				<li><a href="tipologieEsami.jsp">Servizi</a></li>
				<li><a href="contatti.jsp">Contatti</a></li>
				<li><a href="faq.jsp">FAQ</a></li>
				<li><a href="loginPaziente.jsp">Login Paziente</a></li>
				<li><a href="loginAdmin.jsp">Login Amministratore</a></li>
			</ul>
		</div>
	</div>
	</nav>

	<!-- Header Carousel -->
	<header id="myCarousel" class="carousel slide"> <!-- Indicators -->
	<ol class="carousel-indicators">
		<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
		<li data-target="#myCarousel" data-slide-to="1"></li>
		<li data-target="#myCarousel" data-slide-to="2"></li>
	</ol>

	<!-- Wrapper for slides -->
	<div class="carousel-inner">
		<div class="item active">
			<div class="fill"
				style="background-image: url('resources/Imgsrc/Slide1.png');"></div>
			<div class="carousel-caption">
				<h3 style="color: grey">Un grande network al servizio della
					vostra salute</h3>
			</div>
		</div>
		<div class="item">
			<div class="fill"
				style="background-image: url('resources/Imgsrc/Slide2.jpg');"></div>
			<div class="carousel-caption">
				<h3 style="color: white">Medici e tecnologia al vostro servizio</h3>
			</div>
		</div>
		<div class="item">
			<div class="fill"
				style="background-image: url('resources/Imgsrc/Slide3.jpg');"></div>
			<div class="carousel-caption">
				<h3 style="color: black">Basta un click!</h3>
			</div>
		</div>
	</div>

	<!-- Controls --> <a class="left carousel-control" href="#myCarousel"
		data-slide="prev"> <span class="icon-prev"></span>
	</a> <a class="right carousel-control" href="#myCarousel" data-slide="next">
		<span class="icon-next"></span>
	</a> </header>

	<!-- Page Content -->
	<div class="container">

		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">Clinica Geeno</h1>
			</div>
			<div class="col-md-4">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h4>
							<i class="fa fa-fw fa-check"></i> Tipologie di esami
						</h4>
					</div>
					<div class="panel-body">
						<p>Oltre alle analisi di laboratorio, la clinica Geeno eroga
							diagnostica clinico-sperimentale, per immagini e fisioterapia.</p>
						<a href="tipologieEsami.jsp" class="btn btn-default">Scopri di
							più</a>
					</div>
				</div>
			</div>
			<div class="col-md-4">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h4>
							<i class="fa fa-fw fa-gift"></i> Medici
						</h4>
					</div>
					<div class="panel-body">
						<p>La clinica Geeno vanta medici e specialisti di fama
							internazionale, a vostra completa disposizione anche per consulti
							senza appuntamento.</p>
						<a href="medici.jsp" class="btn btn-default">Scopri di più</a>
					</div>
				</div>
			</div>
			<div class="col-md-4">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h4>
							<i class="fa fa-fw fa-compass"></i> Referti Online
						</h4>
					</div>
					<div class="panel-body">
						<p>I nostri pazienti hanno la possibilità di consultare i
							risultati dei loro esami e di confrontarli con quelli che hanno
							eseguito precedentemente.</p>
						<a href="loginPaziente.jsp" class="btn btn-default">Accedi</a>
					</div>
				</div>
			</div>
		</div>

		<div class="row">
			<div class="col-lg-12">
				<h2 class="page-header">Geeno in breve</h2>
			</div>
			<div class="col-md-6">
				<p>La clinica "Geeno" nasce per offrire ai suoi pazienti la
					qualità della medicina di laboratorio più avanzata. I nostri tratti
					distintivi sono:</p>
				<ul>
					<li>Competenza</li>
					<li>Affidabilità</li>
					<li>Efficienza</li>
				</ul>
				<p>Il nostro laboratorio vanta una capacità analitica unica, sia
					per la vasta gamma di esami offerti che per l'organizzazione
					logistica. Tutto ciò è possibile grazie alle nostre strutture
					all'avanguardia e grazie all'esperienza dei nostri medici e
					specialisti.</p>
			</div>
			<div class="col-md-6">
				<img class="img-responsive" src="Static/Imgsrc/In_breve2.jpg"
					alt="Clinica">
			</div>
		</div>

		<hr>

		<!-- Call to Action -->
		<div class="well">
			<div class="row">
				<div class="col-md-8">
					<p>Se non sei ancora uno dei nostri pazienti e hai bisogno di
						noi, puoi richiedere la registrazione ad un amministratore.</p>
				</div>
				<div class="col-md-4">
					<a class="btn btn-lg btn-default btn-block" href="faq.jsp">Scopri
						come registrarti</a>
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

	<!-- Script to Activate the Carousel -->
	<script>
		$('.carousel').carousel({
			interval : 7000
		})
	</script>

</body>


</html>