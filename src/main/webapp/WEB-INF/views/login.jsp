<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login Page</title>
</head>
<body>
  <center>  <h2>Login</h2>
    <form action="/authenticate" method="post">
        <label for="id">ID:</label>
        <input type="text" id="id" name="id" required><br>
        
        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required><br>
        
        <button type="submit">Login</button>
    </form>
    </center>
    <p>${error}</p>
</body>
</html>
