<html>
<head>
	<title>php select</title>
</head>
<body>
<table border = 1>
	<tr>
		<td>Id</td>
		<td>Name</td>
		<td>Gender</td>
		<td>Marks</td>
	</tr>
<?php
	include "dbOneConnectDatabase.php";
	$sql = "select * from student";
	$result = mysqli_query($conn,$sql);
	$num=mysqli_num_rows($result);
	if($num>0){
		while($row=mysqli_fetch_assoc($result)){
			echo "<tr>";
			echo "<td>".$row['Id']."</td>";
			echo "<td>".$row['Name']."</td>";
			echo "<td>".$row['Gender']."</td>";
			echo "<td>".$row['Marks']."</td>";
			echo "</tr>";
		}
	}
?>
</table>
</body>
</html>