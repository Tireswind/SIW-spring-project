<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form"
	prefix="springForm"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>


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
<link herf="resources/css/datepicker.css" rel="stylesheet">
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
					<li class="active">Aggiungi esame</li>
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
				<script type="text/javascript">
					
				</script>
				<h4>Aggiungi esame:</h4>
				
				<hr>
				<div class="panel panel-default">
					<div class="panel-body form-horizontal">
				
				<p>
				</p>
				<form action="aggiungiEsame" method="POST">
				<p>Medico</p>
				<p>
				   <select name="medico">
				   <c:forEach items="${dottori}" var="dottore" >
					  <option value="${dottore.codice}">${dottore}</option>
				   </c:forEach>
				   </select>
				</p>
				<p>TipologiaEsame</p>
				<p>
				   <select name="tipologia">
				   <c:forEach items="${tipologie}" var="tipologia" >
					  <option value="${tipologia.codice}">${tipologia}</option>
				   </c:forEach>
				   </select>
				</p>
				<p>Paziente </p>
				<p>
				   <select name="paziente">
				   <c:forEach items="${pazienti}" var="paziente" >
					  <option value="${paziente.codice}">${paziente}</option>
				   </c:forEach>
				   </select>
				</p>
				<p>Data Esecuzione nel formato(dd/MM/yyyy)</p>
				<p style="color: red;">${dateUnvalid}</p>
				<p>
					<input type="text" name="dataE">
				</p>
					<!-- 
					Medico: <input type="text" name="medico">
					<br />
					Tipologia: <input type="text" name="tipologia" />
					 -->
					<input type="submit" value="ConfermaInserimento" />
				</form>
				
				${divina}
				
				
				
				
				<!--
						<div class="form-group">
							<label for="examName" class="col-sm-2 control-label">Nome
								esame</label>
							 
							<div class="col-sm-10">
								<input type="text" class="form-control" id="examName"
									name="examName" autocomplete="off">
							</div>
						</div>
						<div class="form-group">
							<label for="examPatient" class="col-sm-2 control-label">Paziente
								esame</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="examPatient"
									name="examPatient" autocomplete="off">
							</div>
						</div>
						<div class="form-group">
							<label for="examDate" class="col-sm-2 control-label">Data
								esame</label>
							<div class="col-sm-4">
								<input type="text" class="form-control" id="examDate"
									name="examDate" autocomplete="off">
							</div>
							<label for="examTime" class="col-sm-2 control-label">Ora
								esame</label>
							<div class="col-sm-4">
								<input type="text" class="form-control" id="examTime"
									name="examTime" autocomplete="off">
							</div>
						</div>
						<div class="form-group form-group-multiple-selects">
							<label for="examType" class="col-sm-2 control-label">Tipologia
								esame</label>
							<div class="col-sm-10">
								<div class="input-group input-group-multiple-select col-sm-12">
									<select class="form-control" id="examType" name="values[]"
										autocomplete="off">
										<option value="" disabled selected>Seleziona
											un'opzione</option>
										<option value="1">Tipologia 1</option>
										<option value="2">Tipologia 2</option>
										<option value="3">Tipologia 3</option>
										<option value="4">Tipologia 4</option>
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
						-->

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
	<script src="resources/js/jquery.js"></script>
	<!-- Bootstrap Core JavaScript -->
	<script src="resources/js/bootstrap.min.js"></script>
	<!-- Selection JavaScript -->
	<script src="resources/js/form.selects.curtain.js"></script>
	<script src="resources/js/bootstrap-datepicker.js"></script>
</body>
</html>