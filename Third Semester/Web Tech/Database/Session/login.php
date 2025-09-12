<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>locale_get_display_name</title>
</head>
<body>
    <form action="" method="POST">
        names
        <input type="text" name="name"> <br>
        password
        <input type="password" name="password"> <br>
        <input type="submit" name="submit">
    </form>
    <?php   include 'connect.php';
    session_start();
        if(isset($_POST['submit'])){
         
            $Name = $_POST['name'];
            $password = $_POST['password'];
            $sql= "select * from dav where Name='$Name' and Password='$password' limit 1;";
            $result = mysqli_query($conn,$sql);
            $num = mysqli_num_rows($result);
            if($num == 1){
                $_SESSION['Profile']=$Name;
                header('location:welcome.php');
            }else{
                echo 'error';
            }
        }
    ?>
</body>
</html>