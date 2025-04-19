<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <p>Question 6</p>
    <?php
        echo "square root of 2 is: ".sqrt(2)."<br>";
        echo "power of 2^2 is: ".pow(2,2)."<br>";
        echo "ceil of 2.5 is: ".ceil(2.5)."<br>";
        echo "value of pi is:".pi();
    ?>
    <p>Question 7</p>
    <?php
        echo "Echo outputs strings directly to the browser, while print_r is used to print human-readable information about a variable or expression, including its data eg: <br>";
    ?>
    <p>Question 8</p>
    <?php
        echo "PHP supports for loop, while loop, do while loop, foreach loop eg: <br>";
        echo "for loop";
        for($i=0;$i<10;$i++){
            echo "".($i+1)." ";
        }
        echo "<br>";
        echo "while<br>";
        $i=0;
        while($i<10){
            echo "".($i+1)." ";
            $i++;
        }
        $i=0;
        echo "<br>";
        echo "do while<br>";
        do{
            echo "".($i+1)." ";
            $i++;
        }while($i<10);
        echo "<br>";
        echo "for each<br>";
        $i=array(1,2,3,4,5,6,7,8,9,10);
        foreach($i as $element){
            echo "".($element)." ";
        }
        
        ?>
    <h3>Please input your name:</h3>
    <form method="post">
        <input type="text" name="name" id="name"><input type="submit" value="submit">
    </form>
    <?php
        if(isset($_POST['submit'])){
            echo "Your name is: ".$_POST['name'];
        }
    ?>
</body>
</html>