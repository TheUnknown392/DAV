<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Form</title>
</head>
<body>
    <form action="" method="post">
        <label for="Name">Name: </label> <br>
        <input type="text" required id="Name" name="Name"><br>
        <label for="Email">Email: </label><br>
        <input type="email" required name="Email" id="Email"><br>
        <label for="Phone">Phone: </label><br>
        <input type="number" name="Phone" required id="Phone"><br>
        <label for="Gender">Gender</label><br>
        <input type="radio" name="Gender" required id="Male" value="Male">
        <label for="Male">Male</label>
        <input type="radio" name="Gender" required id="Female" value="Female">
        <label for="Female">Female</label><br>
        <input type="submit" name="Submit" id="Submit">
    </form>
    <?php
    if(isset($_POST['Submit'])){
        $conn=mysqli_connect("localhost","root","","doit");
        if(!$conn){
            die("Error: ");
        }
        $Name=$_POST['Name'];
        $Email=$_POST['Email'];
        $Phone=$_POST['Phone'];
        $Gender=$_POST['Gender'];
        $sql="INSERT INTO `user_info`(`Name`, `Email`, `Phone`, `Gender`) VALUES ('$Name','$Email','$Phone','$Gender')";
        $result=mysqli_query($conn,$sql);
        if($result){
            echo "<p>Data inserted sucessfully</p>";
            header("location:Display.php");
        }
    }
    ?>
</body>
</html>