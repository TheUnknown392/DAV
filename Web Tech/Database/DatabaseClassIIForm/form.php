<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Form</title>
</head>
<body>
    <button>
        <a href="login.php">Login</a>
    </button>
    <br>
    <br>
    <form action="" method="post">
        <label for="email">Email:</label><br>
        <input type="email" name="email" id="email" required><br>
        
        <label for="password">password</label><br>
        <input type="password" name="password" id="password" required><br>

        <input type="submit" name="Submit" value="Signup">
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

            $cheakQuery = "Select * from users where email='$Email'";
            $result=mysqli_query($conn,$cheakQuery);
            $num=mysqli_num_rows($result);
            if($num>0){
                echo "Email already exists";
            }else{
                $sql="insert into users(Email,Password) values('$Email','$Password')";
                $result=mysqli_query($conn,$sql);
                if($result){
                    echo "Signup sucssfull";
                }else{
                    echo "error in signup";
                }
            }
        }
    ?>
</body>
</html>