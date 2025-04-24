<?php
    $host="localhost";
    $username="root";
    $password="";
    $db="bca";
    $conn = mysqli_connect($host,$username,$password,$db);
    if(!$conn){
        echo die("<h1>database is not connected: ".mysqli_connect_error()."</h1><hr>");
    }
    if(isset($_POST['submit'])){
        $query=$_POST['query'];
        if(!mysqli_query($conn,$query)){
            echo "<br>query ' $query ' not sucessfull: ".mysqli_error($conn);
        }else{
            echo "<br>query ' $query ' : sucessfull";
        }
    }
?>