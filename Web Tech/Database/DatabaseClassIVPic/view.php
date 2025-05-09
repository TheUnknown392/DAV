<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=, initial-scale=1.0">
    <title>Document</title>
</head>

<style>
a {
    color: black;
    text-decoration: none;
}
</style>
<body>
    <table border=1>
    <tr>
        <td>Id</td>
        <td>Name</td>
        <td>Email</td>
        <td>Gender</td>
        <td>Hobby</td>
        <td>Address</td>
        <td>Dob</td>
        <td>Picture</td>
        <td>Cv</td>
        <td colspan="2">Action</td>

    </tr>
    <?php
    include 'connect.php';
    $sql="select * from students";
    $result=mysqli_query($conn,$sql);
    $num=mysqli_num_rows($result);
    if($num>0)
    {
        while($row=mysqli_fetch_assoc($result))
        {
            ?>

            <tr>
                <td> <?php echo $row['Id'];?></td>
                <td> <?php echo $row['Name'];?></td>
                <td> <?php echo $row['Email'];?></td>
                <td> <?php echo $row['Gender'];?></td>
                <td> <?php echo $row['Hobby'];?></td>
                <td> <?php echo $row['Address'];?></td>
                <td> <?php echo $row['Dob'];?></td>
                <td>
                    <img src="<?php echo $row['Picture'];?>" alt="" height="100px" width="100px">
                </td>
                <td>
                    <a href="<?php echo $row['Cv'];?>" >View Cv</a>
                </td>

                <td>
                    <button>
                    <a href="update.php?Id=<?php echo $row['Id']; ?>">update</a>
                    </button>
                </td>

                <td>
                    <button>
                    <a href="delete.php?Id=<?php echo $row['Id']; ?>">delete</a>
                    </button>
                </td>

        </tr>
        <?php

        }
    }
?>
</table>
</body>
</html>