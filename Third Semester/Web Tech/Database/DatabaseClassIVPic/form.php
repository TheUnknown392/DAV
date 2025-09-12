<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Form Submission</title>
</head>
<body>
    <form action="" method="POST" enctype="multipart/form-data">
        Name:
        <br>
        <input type="text" name="Name" required>
        <br>
        Email:
        <br>
        <input type="email" name="Email" required>
        <br>
        Gender:
        <input type="radio" name="gender" value="Male" required> Male
        <input type="radio" name="gender" value="Female" required> Female
        <br>
        Hobby:
        <br>
        <input type="checkbox" name="Hobby[]" value="Singing"> Singing
        <input type="checkbox" name="Hobby[]" value="Dancing"> Dancing
        <input type="checkbox" name="Hobby[]" value="Cricket"> Cricket
        <br>
        Address:
        <br>
        <select name="Address" required>
            <option value="Kathmandu">Kathmandu</option>
            <option value="Pokhara">Pokhara</option>
            <option value="Chitwan">Chitwan</option>
        </select>
        <br>
        Date of Birth:
        <input type="date" name="Dob" required>
        <br>
        Picture: 
        <input type="file" name="Image" required>
        <br>
        CV:
        <input type="file" name="Cv" required>
        <br>
        <input type="submit" value="Submit" name="Submit">
    </form>
    <br>
    <button>
        <a href="view.php">see records</a>
    </button>
    
    <?php
    include 'connect.php';

    if (isset($_POST['Submit'])) {
        $name =  $_POST['Name'];
        $Email = $_POST['Email'];
        $Gender = $_POST['gender'];
        $Hobbies = isset($_POST['Hobby']) ? implode(",", $_POST['Hobby']) : '';
        $Address = $_POST['Address'];
        $Dob = $_POST['Dob'];


        $Pic = $_FILES['Image']['name'];
        $temp1 = $_FILES['Image']['tmp_name'];
        $folder1 = 'Pic/' . $Pic;
        move_uploaded_file($temp1, $folder1);


        $Cv = $_FILES['Cv']['name'];
        $temp2 = $_FILES['Cv']['tmp_name'];
        $folder2 = 'Cv/' . $Cv;
        move_uploaded_file($temp2, $folder2);

        $sql = "INSERT INTO students (Name, Email, Gender, Hobby, Address, Dob, Picture, Cv) 
                VALUES ('$name', '$Email', '$Gender', '$Hobbies', '$Address', '$Dob', '$folder1', '$folder2')";
        $result = mysqli_query($conn, $sql);

        if ($result) {
            echo "<br>Records were inserted successfully.";
        } else {
            echo "<br>Records were not inserted.";
        }
    }
    ?>
</body>
</html>
