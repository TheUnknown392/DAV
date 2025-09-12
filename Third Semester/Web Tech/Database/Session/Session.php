<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Session</title>
</head>
<body>
    <?php
        session_start();
        $_SESSION['User']='Admin';
        $_SESSION['Password']='Admin';
        if(isset($_SESSION['User'])){
            echo 'Session is created';
        }else{
            echo 'Session is not created';
        }
    ?>
</body>
</html>