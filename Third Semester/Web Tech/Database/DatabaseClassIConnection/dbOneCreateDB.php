<?php
    include 'dbOneConnectDatabase.php';
    $sql = "CREATE database bca;";
    if(!mysqli_query($conn,$sql)){
        echo "database is not created: ".mysqli_error($conn);
    }

?>