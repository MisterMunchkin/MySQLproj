<?php
    $servername = "localhost";
    $username = "root";
    $password = "";
    $db = "android demo";

    $conn = mysqli_connect($servername,$username,$password,$db);

	if(!$conn){
		echo "Connection Error...".mysqli_connect_error();
	}else{
		echo "<h3>Database connection Success....</h3>";
	}
?>
