<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form"
	prefix="springForm"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	/*ritorno dei parametri inseriti precedentemente per la creazione dell esame*/
	<p>Medico: ${esame.esaminatore}</p>
	<p>TipologiaEsame: ${esame.tipologiaEsame}</p>
	<p>Paziente: ${esame.paziente}</p>
	<p>Data Prenotazione: ${esame.dataPrenotazione }</p>
	<p>Data Esecuzione>: ${esame.dataEsecuzione }</p>
	

</body>
</html>