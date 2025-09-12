<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>PHP lab one question 1-5</title>
    <style>
        p{
            font-weight : bolder;
            font-size : 20px;
        }
        .black{
            background-color : black;
        }
    </style>
</head>
<body>
    <p>Question 1</p>
    <hr>
    <?php
        echo "TheUnknown";
    ?>
    <hr>
    
    <p>Question 2</p>
    <hr>
    <?php
        $a = 24;
        $b = 3;
        echo "$a + $b = ".($a+$b)."<br>";
        echo "$a - $b = ".($a-$b)."<br>";
        echo "$a * $b = ".($a*$b)."<br>";
        echo "$a / $b = ".($a/$b)."<br>";
        echo "$a % $b = ".($a%$b)."<br>";
    ?>
    <hr>
    <p>Question 3</p>
    <hr>
    <?php
        $date = date("d-m-y:s");
        echo "Today's date is: $date";
    ?>
    <hr>
    <p>Question 4</p>
    <hr>
    <?php
        const width = 8;
        echo "<table border=0 cellpadding=10px>";
        for($i =0; $i<width; $i++){
            echo "<tr>";
            for($j =0; $j<width; $j++){
                if(($i%2==0&&$j%2!=0)||($i%2!=0&&$j%2==0)){
                    echo "<td>";
                }else{
                    echo "<td class='black'>";
                }
                echo "</td>";
            }
            echo "</tr>";
        }
        echo "</table>";
    ?>
    <hr>
    <p>Question 5</p>
    <hr>
    <?php
        for($i=0; $i<5; $i++){
            for($j=0; $j<=$i; $j++){
                echo "* ";
            }
            echo "<br>";
        }
    ?>
    <hr>
</body>
</html>