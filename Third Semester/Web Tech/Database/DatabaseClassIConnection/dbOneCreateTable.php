<?php
    include 'dbOneConnectDatabase.php';
    $sql = "CREATE table student(
                Id int,
                Name varchar(20),
                Gender varchar(9),
                Marks int
            )
            ";
    if(!mysqli_query($conn,$sql)){
        echo "database is not created: ".mysqli_error($conn);
    }
?>
