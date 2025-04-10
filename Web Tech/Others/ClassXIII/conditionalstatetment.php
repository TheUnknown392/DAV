<?php
	$a = 4;
	if($a%2==0){
		echo "$a is even";
	}else{
		echo "$a is odd";
	}
	echo "<hr>";
	$age = 18;
	if($age >=18){
		echo "You are eligble to vote";
	}else{
		echo "You are not eligble to vote";
	}
	echo "<hr>";
	$color="blue";
	switch($color){
		case "red":
			echo "color is red";
			break;
		case "blue":
			echo "color is blue";
			break;
		case "purple":
			echo "color is purple";
			break;
		default:
			echo "You have selected color other than red, blue and purple";
	}
	echo "<hr>";
	$name = ['b','a','n','a','n','a'];
	foreach ($name as $char){
		echo "$char";
	}
	echo "<hr>";
	$mul = 2;
	echo "<table border = 1>";
	for($i=1;$i<=10;$i++){
		echo "<tr>";
		echo "<td>$mul*$i</td><td>".($mul*$i)."</td>";
		echo "</tr>";
	}
	echo "</table><hr>";
	echo "<table> ";
	$height = "50px";
	$width = "50px";
	for($r=1;$r<=8;$r++){
		echo "<tr>";
		for($c=1;$c<=8;$c++){
			$total= $r+$c;
			if($total%2==0){
				echo "<td height = '$height' width = '$width' bgcolor='black'></td>";
			}else{
				echo "<td height = '$height' width = '$width' bgcolor='white'></td>";
			}
		}
	}
	echo "</table><hr>";
	$number = 12356;
	$temp=$number;
	$count=0;
	while($temp!=0){
		$temp =(int) ($temp/10);
		$count=$count+1;
	}
	echo "number has $count digits";
	echo "<hr>";
?>