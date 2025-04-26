<?php
    include 'dbOneConnectDatabase.php';
    $sql = "insert into student(Id, Name,Gender,Marks)VALUES(1,'TheUnknown','others',100);";
    if(!mysqli_query($conn,$sql)){
        echo "<br>query ' $sql ' not sucessfull: ".mysqli_error($conn);
    }else{
        echo "<br>query ' $sql ' : sucessfull";
    }
?>
