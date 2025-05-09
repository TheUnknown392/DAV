<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cookie</title>
</head>
<body>
    <?php
        echo time();
        $name ='theunknown';
        $pass = 'unknown';
        setcookie($name,$pass,time()+86400,'/');
    ?>
</body>
</html>