<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <table border='1'>
        <?php
            $mul = 5;
            $till = 10;
            for($i=1;$i<=$till;$i++){
                echo "<tr>";
                    echo "<td>";
                        echo "$mul * $i = ".($mul*$i);
                    echo "</td>";
                echo "</tr>";
            }
        ?>
    </table>
</body>
</html>