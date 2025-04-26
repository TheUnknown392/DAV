<?php
    include 'dbOneConnectDatabase.php';
    $sql = "delete from student";
    if(!mysqli_query($conn,$sql)){
        echo "<br>query ' $sql ' not sucessfull: ".mysqli_error($conn);
    }else{
        echo "<br>query ' $sql ' : sucessfull";
    }
?>
