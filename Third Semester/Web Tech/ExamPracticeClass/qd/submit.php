<?php
include 'db_config.php';

if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $name = $_POST['name'];
    $email = $_POST['email'];
    $hobby = $_POST['hobby'];
    $occupation = $_POST['occupation'];

    $sql = "INSERT INTO users (name, email, hobby, occupation) 
            VALUES (:name, :email, :hobby, :occupation)";

    $stmt = mysqli_query($conn,$sql);
    if(!$stmt){
        die("Error stmt");
    }

    echo "<h2>Data Saved Successfully!</h2>";
}

echo "<h2>All Users' Information:</h2>";
echo "<table border='1'>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Email</th>
            <th>Hobby</th>
            <th>Occupation</th>
        </tr>";

$sql = "SELECT * FROM users";
$stmt = $pdo->query($sql);
while ($row = $stmt->fetch()) {
    echo "<tr>
            <td>" . $row['id'] . "</td>
            <td>" . $row['name'] . "</td>
            <td>" . $row['email'] . "</td>
            <td>" . $row['hobby'] . "</td>
            <td>" . $row['occupation'] . "</td>
          </tr>";
}

echo "</table>";
?>
