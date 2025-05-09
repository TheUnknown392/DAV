<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Destroy</title>
</head>
<body>
    <?php
        session_start();
        session_destroy();
        echo 'session is destroyed';
    ?>
</body>
</html>