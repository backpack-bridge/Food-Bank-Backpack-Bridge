<?php

$from = "BackPackBridge@gmail.com";
$email = $_POST['email'];
$subject = $_POST['school_name'];
$start_date = $_POST['start_date'];
$first = $_POST['first'];
$last_name_student = $_POST['last_name_student'];
$Teacher_name = $_POST['Teacher_name'];
$siblings = $_POST['siblings'];
$comments = $_POST['comments'];


mail($email, $subject, $comments,"From:".$from);

print "Thank you for submitting your email address, it has been sent! Isn't this fun!";

?>