<?php

   $usuario = $_GET["usuario"];

	header('Content-type: text/xml');

   if ($usuario != "victor") {
     echo("<?xml version=\"1.0\" ?><existe>true</existe>");
   } else {
     echo("<?xml version=\"1.0\" ?><existe>false</existe>");
   }
   
?>