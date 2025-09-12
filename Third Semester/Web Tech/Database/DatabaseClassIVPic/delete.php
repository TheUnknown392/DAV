<?php
include 'connect.php';
$Id=$_GET['Id'];
$sql="select * from students where Id='$Id'";
$result=mysqli_query($conn,$sql);
$row=mysqli_fetch_assoc($result);
$del="delete from students where Id=$Id";
$res=mysqli_query($conn,$del);
if($res)
{
    ?>
    <script>
        alert("do you really want to delete");
        alert("Deleted sucessfully");
        window.location.href='view.php';
    </script>
<?php
}
else{
    echo "error";
}


?>