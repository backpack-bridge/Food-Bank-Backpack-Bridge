<?php

$from = "BackPackBridge@gmail.com";
$subject = "Email from Back Pack Food Bridge";
$email = $_POST['email'];
$message = $_POST['message'];


mail($email, $subject, $message,"From:".$from);

print "Thank you for submitting your email address, it has been sent! Isn't this fun!";

?>