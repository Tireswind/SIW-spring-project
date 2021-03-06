<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Creazione tipo esame</title>
<link href="resources/css/bootstrap.min.css" rel="stylesheet">
<link href="resources/css/clinica-geeno.css" rel="stylesheet">
<link href="resources/css/form.selects.curtain.css" rel="stylesheet">
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
			<c:set var="contextPath" value="${pageContext.request.contextPath}" />
			<a class="navbar-brand" href="${contextPath}/index">Clinica Geeno
				- Servizi Diagnostici</a>
		</div>
		<div class="collapse navbar-collapse"
			id="bs-example-navbar-collapse-1">
			<ul class="nav navbar-nav navbar-right">
				<li><a href="${contextPath}/adminProfile">Profilo</a></li>
				<li><a href="${contextPath}/logout">Disconnetti</a></li>
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
					<li><a href="${contextPath}/index">Home</a></li>
					<li class="active">Aggiungi tipologia di esame</li>
				</ol>
			</div>
		</div>

		<!-- Content Row -->
		<div class="row">
			<!-- Sidebar Column -->
			<div class="col-md-3">
				<div class="list-group">
					<a href="${contextPath}/adminProfile" class="list-group-item">Profilo</a>
					<a href="${contextPath}/addExamType" class="list-group-item">Aggiungi
						tipologia di esame</a> <a href="${contextPath}/addExam"
						class="list-group-item">Aggiungi esame</a> <a
						href="${contextPath}/addPatient" class="list-group-item">Registra
						paziente</a> <a href="${contextPath}/addDoctor"
						class="list-group-item">Registra medico</a> <a
						href="${contextPath}/logout" class="list-group-item">Disconnetti</a>
				</div>
			</div>
			<!-- Content Column -->
			<div class="col-md-9">
				<script type="text/javascript">
					
				</script>
				<h4>Aggiungi tipologia di esame:</h4>
				<hr>
				<div class="panel panel-default">
					<div class="panel-body form-horizontal">
						<div class="form-group">
							<label for="examName" class="col-sm-2 control-label">Nome
								esame</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="examName"
									name="examName" autocomplete="off">
							</div>
						</div>
						<div class="form-group">
							<label for="examPrice" class="col-sm-2 control-label">Prezzo
								esame</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="examPrice"
									name="examPrice" autocomplete="off">
							</div>
						</div>
						<div class="form-group form-group-multiple-selects">
							<label for="examRequirements" class="col-sm-2 control-label">Prerequisito</label>
							<div class="col-sm-10">
								<div class="input-group input-group-multiple-select col-sm-12">
									<select class="form-control" id="examRequirements"
										name="values[]" autocomplete="off">
										<option value="" disabled selected>Seleziona
											un'opzione</option>
										<option value="1">Opzione 1</option>
										<option value="2">Option 2</option>
										<option value="3">Option 3</option>
										<option value="4">Option 4</option>
									</select> <span class="input-group-addon input-group-addon-remove">
										<span class="glyphicon glyphicon-remove"></span>
									</span>
								</div>
							</div>
						</div>
						<div class="form-group">
							<label for="examDescription" class="col-sm-2 control-label">Descrizione</label>
							<div class="col-sm-10">
								<textarea rows="5" cols="100" class="form-control"
									id="examDescription" name="examDescription" required
									data-validation-required-message="Descrizione obbligatoria."
									maxlength="999" style="resize: none" autocomplete="off"></textarea>
							</div>
						</div>
						<div class="form-group">
							<div class="col-sm-12 text-right">
								<button type="button" class="btn btn-primary preview-add-button">
									<span class="glyphicon glyphicon-plus"></span> Aggiungi
								</button>
							</div>
						</div>

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
	<!-- Selection JavaScript -->
	<script src="resources/js/form.selects.curtain.js"></script>
</body>
</html>