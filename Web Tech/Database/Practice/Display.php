<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Table</title>
</head>
<body>
    <?php
    $conn=mysqli_connect("localhost","root","","doit");
    if(!$conn){
        die("Error: ");
    }
    $sql="select * from user_info order by created_at DESC";
    $result=mysqli_query($conn,$sql);
    $row=mysqli_num_rows($result);
    if($row>0){
        echo "<table border='1'>";
        echo "<tr>";
            echo "<td>";
                echo "Name";
            echo "</td>";
            echo "<td>";
                echo "Email";
            echo "</td>";
            echo "<td>";
                echo "Phone";
            echo "</td>";
            echo "<td>";
                echo "Gender";
            echo "</td>";
            echo "<td>";
                echo "Created_at";
            echo "</td>";
        echo "</tr>";
        $temp = 1;
        while($row=mysqli_fetch_assoc($result)){
            if($temp==1){
                echo "<tr style='background-color:pink'>";
                $temp = 0;
            }else{
                echo "<tr>";
            }
                echo "<td>".$row['Name']."</td>";
                echo "<td>".$row['Email']."</td>";
                echo "<td>".$row['Phone']."</td>";
                echo "<td>".$row['Gender']."</td>";
                echo "<td>".$row['Created_at']."</td>";
            echo "</tr>";
        }
        echo "</table>";
    }else{
        echo "<p>Table is empty</p>";
    }
?>
</body>
</html>

