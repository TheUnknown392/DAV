<?php
include 'connect.php';
$Id=$_GET['Id'];
$sql="select * from students where Id='$Id'";
$result=mysqli_query($conn,$sql);
$row=mysqli_fetch_assoc($result);
$Hobby = $row['Hobby'];
$Hobby = explode(',',$Hobby);
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
<form action="" method="POST" enctype="multipart/form-data">

Name:
<input type="text" name="Name" Id="" value="<?php echo $row['Name'];?>">

Email:
<input type="email" name="Email" Id="" value="<?php echo $row['Email'];?>">
<br>

Gender:
<br>
<input type="radio" name="Gender" Id="genderMale" value="Male" 
<?php
if (trim(strtolower($row['Gender'])) == 'male') {
    echo "checked";
}
?>>
Male

<input type="radio" name="Gender" Id="genderFemale" value="Female" 
<?php
if (trim(strtolower($row['Gender'])) == 'female') {
    echo "checked";
}
?>>
Female

<br>

Hobby:
<br>
<input type="checkbox" name="Hobby[]" Id="" value="Singing"
<?php if(in_array('Singing',$Hobby))
echo "checked";
?>>
Singing


<input type="checkbox" name="Hobby[]" Id="" value="Dancing" 
<?php if(in_array('Dancing',$Hobby))
echo "checked";
?>>
Dancing

<input type="checkbox" name="Hobby[]" Id="" value="Cricket" 
<?php if(in_array('Cricket',$Hobby))
echo "checked";
?>>
Cricket
<br>

Address:
<select name="Address" Id="">

    <option value="Kathmandu"
    <?php
if($row['Address']=='Kathmandu')
echo "selected";
    ?>
    >Kathmandu</option>


    <option value="Pokhara"
    <?php
if($row['Address']=='Pokhara')
echo "selected";
    ?>>Pokhara</option>


    <option value="Chitwan"
    <?php
if($row['Address']=='Chitwan')
echo "selected";
    ?>>Chitwan</option>
</select>

Dob:
<input type="date" name="Dob" Id="" value="<?php echo $row['Dob'];?>">
<br>

Picture:
<input type="file" name="Image" Id="">
<img src="<?php echo $row['Picture']?>" alt="" height="100px" width="100px">
<br>

Cv:
<input type="file" name="Cv" Id="">
<a href="<?php echo $row['Cv']?>"></a>
<img src="<?php echo $row['Cv']?>" alt="" height="100px" width="100px">

<br>
<br>
<input type="submit" name="Submit" Id="">
<button>
    <a href="view.php">view records</a>
</button>
<?php
include 'connect.php';
if(isset($_POST['Submit']))
{
    $Name=$_POST['Name'];
    $Email=$_POST['Email'];
    $Gender=$_POST['Gender'];
    $Hob=$_POST['Hobby'];
    $Hobby=implode(',',$Hob);
    $Address=$_POST['Address'];
    $Dob=$_POST['Dob'];
    $Pic=$_FILES['Image']['name'];
    $temp1=$_FILES['Image']['tmp_name'];
    $folder1='Pic/'.$Pic;
    move_uploaded_file($temp1,$folder1);
    $Cv=$_FILES['Cv']['name'];
    $temp2=$_FILES['Cv']['tmp_name'];
    $folder2='Cv/'.$Cv;
    move_uploaded_file($temp2,$folder2);
    $sql="Update student set Name='$Name', Email='$Email', Gender='$Gender', 
    Hobby=' $Hobby', Address=' $Address',Dob= ' $Dob',
    Picture=' $folder1',Cv='$folder2' where Id='$Id'";
    

    $result=mysqli_query($conn,$sql);
    if($result)
    {
        echo "records were updated succesfully";
    }
    else{
        echo "error in ipdating records";
    }
}
?>
    </form>
</body>
</html>