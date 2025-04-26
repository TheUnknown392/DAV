<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>login</title>
</head>
<body>
<form action="" method="post">
        <label for="email">Email:</label><br>
        <input type="email" name="email" id="email" required><br>
        
        <label for="password">password</label><br>
        <input type="password" name="password" id="password" required><br>

        <input type="submit" name="Submit" value="Sign in">
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
            $Email = $_POST['email'];
            $Password = md5($_POST['password']);
            $cheakQuery = "Select * from users where email='$Email' and password='$Password'";
            $result=mysqli_query($conn,$cheakQuery);
            $num=mysqli_num_rows($result);
            if($num>0){
                echo "welcome $Email";
            }else{
                echo "not found or password or username incorrect";
            }


        }
    ?>
</body>
</html>