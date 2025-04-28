<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Table</title>
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
	$sql = "select * from student";
	$result = mysqli_query($conn,$sql);
	$num=mysqli_num_rows($result);
	if($num>0){
        echo "<table border=1>";
        echo "<tr>";
        echo "<th>Name</th>";
        echo "<th>Email</th>";
        echo "<th>Phone</th>";
        echo "<th>Gender</th>";
        echo "<th>Address</th>";
        echo "<tr>";
        while($row=mysqli_fetch_assoc($result)){
            echo "<tr>";
			echo "<td>".$row['Name']."</td>";
			echo "<td>".$row['email']."</td>";
			echo "<td>".$row['phone']."</td>";
			echo "<td>".$row['Gender']."</td>";
			echo "<td>".$row['address']."</td>";
			echo "</tr>";
		}
        echo "</table>";
	}
    ?>
</body>
</html>
