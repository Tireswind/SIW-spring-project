<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Creazione tipo esame</title>
<link href="Static/css/bootstrap.min.css" rel="stylesheet">
<link href="Static/css/clinica-geeno.css" rel="stylesheet">
<link href="Static/css/form.selects.curtain.css" rel="stylesheet">
<!-- CHECK -->
<link herf="Static/css/datepicker.css" rel="stylesheet">
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
				<li><a href="amministratore.jsp">Profilo</a></li>
				<li><a href="logout.jsp">Disconnetti</a></li>
			</ul>
		</div>
	</div>
	</nav>
	<div class="container">
		<!-- Page Heading/Breadcrumbs -->
		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">Profilo amministratore</h1>
				<ol class="breadcrumb">
					<li><a href="index.jsp">Home</a></li>
					<li class="active">Aggiungi paziente</li>
				</ol>
			</div>
		</div>

		<!-- Content Row -->
		<div class="row">
			<!-- Sidebar Column -->
			<div class="col-md-3">
				<div class="list-group">
					<a href="adminProfile.jsp" class="list-group-item">Profilo</a> <a
						href="addExamType.jsp" class="list-group-item">Aggiungi
						tipologia di esame</a> <a href="addExam.jsp" class="list-group-item">Aggiungi
						esame</a> <a href="addPatient.jsp" class="list-group-item">Registra
						paziente</a> <a href="addDoctor.jsp" class="list-group-item">Registra
						medico</a> <a href="logout.jsp" class="list-group-item">Disconnetti</a>
				</div>
			</div>
			<!-- Content Column -->
			<div class="col-md-9">
				<!--	<script type="text/javascript">
					
				</script>-->
				<h4>Aggiungi paziente:</h4>
				<hr>
				<div class="panel panel-default">
					<div class="panel-body form-horizontal">
						<form action="ControllerAddPatient" method="post"
							id="patient-creation-form" autocomplete="off">
							<div class="form-group">
								<label for="patientName" class="col-sm-2 control-label">Nome
								</label>
								<div class="col-sm-10">
									<input type="text" class="form-control" id="patientName"
										name="patientName" autocomplete="off">
								</div>
							</div>
							<div class="form-group">
								<label for="patientSurname" class="col-sm-2 control-label">Cognome
								</label>
								<div class="col-sm-10">
									<input type="text" class="form-control" id="patientSurname"
										name="patientSurname" autocomplete="off">
								</div>
							</div>
							<div class="form-group form-group-multiple-selects">
								<label for="patientBDate" class="col-sm-2 control-label">Data
									di nascita</label>
								<div class="col-sm-4">
									<input type="text" class="form-control" id="patientBDate"
										name="patientBDate" autocomplete="off">
								</div>
								<label for="patientSex" class="col-sm-2 control-label">Sesso
								</label>
								<div class="col-sm-4">
									<div class="input-group input-group-multiple-select col-sm-12">
										<select class="form-control" id="patientSex" name="values[]"
											autocomplete="off">
											<option value="" disabled selected>Seleziona
												un'opzione</option>
											<option value="1">Maschio</option>
											<option value="2">Femmina</option>
										</select> <span class="input-group-addon input-group-addon-remove">
											<span class="glyphicon glyphicon-remove"></span>
										</span>
									</div>
								</div>
							</div>
							<div class="form-group">
								<label for="patientID" class="col-sm-2 control-label">Id</label>
								<div class="col-sm-4">
									<input type="text" class="form-control" id="patientID"
										name="patientID" autocomplete="off">
								</div>
								<label for="patientPW" class="col-sm-2 control-label">Password</label>
								<div class="col-sm-4">
									<input type="text" class="form-control" id="patientPW"
										name="patientPW" autocomplete="off">
								</div>
							</div>
							<div class="form-group">
								<div class="col-sm-12 text-right">
									<button type="button"
										class="btn btn-primary preview-add-button">
										<span class="glyphicon glyphicon-plus"></span> Aggiungi
									</button>
								</div>
							</div>

						</form>
					</div>
				</div>
			</div>
		</div>

		<!--<div class="container">
		<!--<div class="row">
			<div class="col-lg-12">
				<h2 class="page-header">Creazione tipologia esame</h2>
			</div>
			<div class="col-md-3">
				<form action="controllerAddExamType" method="post">

					${nomeError}<label for="fname">Nome</label> <input type="text"
						id="fname" name=nome value='${param["nome"] }' />
					${descrizioneError}<label for="fdesc">Descrizione</label> <input
						type="text" id="fdesc" name=descrizione
						value='${param["descrizione"] }' /> ${prezzoError}<label
						for="fprice">Prezzo</label> <input type="text" id="fprice"
						name=prezzo value='${param["prezzo"] }' /> <input type="submit"
						id="but-submit" name="submit" value="Crea" />
				</form>
			</div>
		</div>-->
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
	<!-- Selection JavaScript -->
	<script src="Static/js/form.selects.curtain.js"></script>
	<script src="Static/js/bootstrap-datepicker.js"></script>
</body>
</html>