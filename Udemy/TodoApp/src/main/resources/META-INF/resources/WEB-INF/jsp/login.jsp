<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login Page</title>
</head>
<body>

    <!-- Here we can access the name attribute like this which is passed to the jsp page! -->
    <h1><center>Login Form</center></h1>
    
    <form method="post">
        Name : <input type="text" name="name"/><br/>
        Password : <input type="password" name="password"/><br/>
        <span>${ErrorMessage}</span>
        <input type="submit">
        
    </form>
</body>
</html>