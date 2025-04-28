<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form action="" method="post">
        <label for="Name">Name:</label><br>
        <input type="text" name="Name" id="Name" required><br>
        
        <label for="Email">Email:</label><br>
        <input type="Email" name="Email" id="Email" required><br>
        
        <label for="Phone">Phone: </label><br>
        <input type="number" name="Phone" id="Phone" required><br>
        Gender: 
        <input type="radio" name="Gender" id="Male" value="Male">
        Male
        <input type="radio" name="Gender" id="Female" value="Female">
        Female
        <input type="radio" name="Gender" id="Others" value="Others">
        Others
        <br>
        Address:
        <select name="Address" id="Address" required>
            <option value="Kathmandu">Kathmandu</option>
            <option value="Bhaktapur">Bhaktapur</option>
            <option value="Lalitpur">Lalitpur</option>
            <option value="Biratnagar">Biratnagar</option>
            <option value="Janakpur">Janakpur</option>
            <option value="Gorkha">Gorkha</option>
        </select><br>
        <input type="Submit" value="Submit" name="Submit">
        <button>
            <a href="see.php">See records</a>
        </button>
        <button>
            <a href="update.php">Update</a>
        </button>
    </form>
    <?php
        $host="localhost";
        $username="root";
        $password="";
        $db="bca";
        $conn = mysqli_connect($host,$username,$password,$db);
        if(!$conn){
            echo die("<h1>database is not connected: ".mysqli_connect_error()."</h1><hr>");
        }
        if(isset($_POST['Submit'])){
            $Name=$_POST['Name'];
            $Email=$_POST['Email'];
            $Phone=$_POST['Phone'];
            $Gender=$_POST['Gender'];
            $Address=$_POST['Address'];
            $sql="insert into student (Name, Email, Phone, Gender,Address)values('$Name', '$Email', '$Phone', '$Gender','$Address');";
            $result=mysqli_query($conn,$sql);
            echo "<br>";
            if($result){
                echo "inserting sucessfull";
            }else{
                echo "inserting unsucessfull";
            }
        }
    ?>
</body>
</html>