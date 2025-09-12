<?php
$host = 'localhost';
$dbname = 'user_data';
$username = 'root';  
$password = ""; 

$conn= mysqli_connect($host,$dbname, $username,$password);
if(!$conn){
    die("Error");
}
?>
