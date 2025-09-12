<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Introducition to PHP</title>
</head>
<body>
    <?php
        $title = "Introduction to PHP";
        echo "<h1>".$title."</h1><hr>";
        $name = "TheUnknown";
        $age = 100;
        $salary = 11.2;
        $gender = "Male";
        echo "Name : $name";
        echo "<br>";
        echo "Age : $age";
        echo "<br>";
        echo "Salary : $salary";
        echo "<br>";
        echo "Gender : $gender";
        echo "<hr>";
        $arr=array("1",2,true,"false",3.35);
        var_dump($arr);
        echo "<br>";
        var_dump($name);
        echo "<br>";
        var_dump($age);
        echo "<br>";
        var_dump($salary);
        echo "<br>";
        var_dump($gender);
        echo "<hr>";
        $a = 2;
        $b = 4;
        echo "SUM: ".($a+$b);
        echo "<br>";
        echo "SUB: ".($a-$b);
        echo "<br>";
        echo "MUL: ".($a*$b);
        echo "<br>";
        echo "DIV: ".($a/$b);
        echo "<br>";
        echo "MOD: ".($a%$b);
        echo "<br>";
        echo "preincrement: ".(++$a);
        echo "<br>";
        echo "predecrement: ".(--$a);
        echo "<br>";
        echo "postincrement: ".($b++);
        echo "<br>";
        echo "postdecrement: ".($b--);
        echo "<br>";
        echo "exponent: ".($a**$b);
        echo "<hr>";
        if($a==2){
            echo "a is 2";
        }else{
            echo "a is not 2";
        }
        echo "<br>";
        $c='2';
        if($a==$c){
            echo "a is 2";
        }else{
            echo "a is not 2";
        }
        echo "<br>";
        if($a===$c){
            echo "a is 2";
        }else{
            echo "a is not exactly 2";
        }
        echo "<hr>";
    ?>
</body>
</html>