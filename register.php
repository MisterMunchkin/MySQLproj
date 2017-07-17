<?php
    require "conn.php";

    $userType = $_POST["userType"];
    $userFirstName = $_POST["fName"];
    $userLastName = $_POST["lName"];
    $userMI = $_POST["mName"];
    $userEmail = $_POST["emailAdd"];
    $userpassword = $_POST["pass"];


    $query = "INSERT INTO account(userType, userFirstName, userLastName, userMI, userpassword, userEmail)
                            VALUES ('$userType','$userFirstName','$userLastName','$userMI','$userpassword','$userEmail')";
    $result = mysqli_query($conn,$query);

    if($result){
        echo "insert success";
    }else{
        echo "Error:" . $query . "<br>" . $conn->error;
    }

    mysqli_close($conn);
?>
