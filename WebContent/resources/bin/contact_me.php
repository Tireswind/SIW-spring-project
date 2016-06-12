<?php
// check if fields passed are empty
if(empty($_POST['name'])  		||
   empty($_POST['phone']) 		||
   empty($_POST['email']) 		||
   empty($_POST['message'])	||
   !filter_var($_POST['email'],FILTER_VALIDATE_EMAIL))
   {
	echo "No arguments Provided!";
	return false;
   }
	
$name = $_POST['name'];
$phone = $_POST['phone'];
$email_address = $_POST['email'];
$message = $_POST['message'];
	
// create email body and send it	
$to = 'akali24@rocketmail.com'; // PUT YOUR EMAIL ADDRESS HERE
$email_subject = "Clinica Geeno Contact Form:  $name"; // EDIT THE EMAIL SUBJECT LINE HERE
$email_body = "Hai ricevuto un nuovo messaggio dalla form della Clinica Geeno.\n\n"."Ecco i dettagli:\n\nNome: $name\n\nTelefono: $phone\n\nEmail: $email_address\n\nMessaggio:\n$message";
$headers = "From: noreply@geenolab.com\n";
$headers .= "Reply-To: $email_address";	
mail($to,$email_subject,$email_body,$headers);
return true;			
?>