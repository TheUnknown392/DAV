<?php
    include 'dbOneConnectDatabase.php';
    $sql = "UPDATE 'student' SET 'Marks'=100 WHERE Id is 1";
    if(!mysqli_query($conn,$sql)){
        echo "<br>query ' $sql ' not sucessfull: ".mysqli_error($conn);
    }else{
        echo "<br>query ' $sql ' : sucessfull";
    }
?>
