<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Form</title>
</head>
<body>
    <form action="" method="post" enctype="multipart/form-data">
        <label for="name">Name:</label><br>
            <input required type="text" name="name"  id="name"><br>
        <label for="email">Email:</label><br>
            <input required type="email" name="email"  id="email"><br>
        <label for="phone">Phone:</label><br>
            <input required type="number" name="phone"  id="phone"><br>
        <label for="address">Address:</label><br>
            <select name="address" id="Address">
                <option value="Kathmandu">Kathmandu</option>
                <option value="Pokhara">Pokhara</option>
                <option value="Janakpur">Janakpur</option>
            </select><br>
        <label for="Food">Favriout Food:</label><br>
            <label for="chocolate">Chocolate:</label>
                <input type="checkbox" name="Food[]" id="chocolate" value="chocolate">
            <label for="rice">Rice:</label>
                <input type="checkbox" name="Food[]" id="rice" value="rice">
            <label for="momo">Momo:</label>
                <input  type="checkbox" name="Food[]" id="momo" value="momo">
            <label for="chowmine">chowmine:</label>
                <input  type="checkbox" name="Food[]" id="chowmine" value="chowmine">
        <br>

        <label for="gender">Gender:</label><br>
            <label for="male">Male:</label>
                <input required type="radio" name="gender" id="male" value="male">
            <label for="female">Female:</label>
                <input required type="radio" name="gender" id="female" value="female">
            <label for="Others">Others:</label>
                <input required type="radio" name="gender" id="Others" value="Others"><br>

        <label for="picture">Profile Picture: </label><br>
            <input type="file" name="picture" id="picture">

        <input required type="submit" name="submit" id="">
    </form>
    <?php
        if(isset($_POST['submit'])){
            $name=$_POST['name'];
            $email=$_POST['email'];
            $phone=$_POST['phone'];
            if(isset($_POST['Food'])){
                $food=$_POST['Food'];
            }
            $address=$_POST['address'];
            $photo=$_FILES['picture']['name'];
            $temp=$_FILES['picture']['tmp_name'];
            $folder='image/'.$photo;
            move_uploaded_file($temp,$folder);
            echo "<hr>";
            echo "your name is $name <br>";
            echo "your email is $email <br>";
            echo "your phone is $phone <br>";
            if(isset($_POST['Food'])){
                echo "Favriout Food: ";
                echo "<ul type='disc'>";
                foreach($food as $dishes){
                    echo "<li>your fav dishes are $dishes </li>";
                }
                echo "</ul>";
            }
            echo "your address is $address <br>";
            echo "your profile picture: <br>";
            echo "<img src='$folder' height='100px' width='100px'>";
        }
    ?>
</body>
</html>