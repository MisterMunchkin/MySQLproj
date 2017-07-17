<?php 
    require "conn.php";
    $user_email = $_POST["email"];
    $user_password = $_POST["passwrd"];
   
    $query = "SELECT * FROM `account` WHERE userType = 'guest', userEmail = , userpassword = ";

    $result = mysqli_query($conn,$query);
    if(mysqli_num_rows($result) > 0){
        echo "login success";
    }else{
        echo "login failed";
    }
?>