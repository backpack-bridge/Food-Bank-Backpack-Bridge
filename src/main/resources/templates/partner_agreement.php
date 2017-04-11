<?php

$from = "BackPackBridge@gmail.com";
$email = $_POST['email'];
$program_name = $_POST['program_name'];
$site_coordinator = $_POST['site_coordinator_name2'];
$date = $_POST['date'];
$comments = $_POST['comments'];


mail($email, $subject, $comments,"From:".$from);

print "Thank you for submitting your email address, it has been sent!";

?>