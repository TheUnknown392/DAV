<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php
        $host="localhost";
        $username="root";
        $password="";
        $db="bca";
        $conn = mysqli_connect($host,$username,$password,$db);
        if(!$conn){
            echo die("<h1>database is not connected: ".mysqli_connect_error()."</h1><hr>");
        }
    ?>
</body>
</html>