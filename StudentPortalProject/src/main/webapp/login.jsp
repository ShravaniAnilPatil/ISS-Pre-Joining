<html>
<head>
<title>Login Page</title>

<script>

function validateForm() {

    let username =
    document.getElementById("username").value;

    let password =
    document.getElementById("password").value;

    if(username == "") {
        alert("Username cannot be empty");
        return false;
    }

    if(password == "") {
        alert("Password cannot be empty");
        return false;
    }

    if(password.length < 4) {
        alert("Password must contain at least 4 characters");
        return false;
    }

    return true;
}

</script>

</head>

<body>

<h2>Login Page</h2>

<form action="LoginServlet"
      method="post"
      onsubmit="return validateForm()">

    Username:
    <input type="text"
           id="username"
           name="username">

    <br><br>

    Password:
    <input type="password"
           id="password"
           name="password">

    <br><br>

    <input type="submit" value="Login">

</form>

</body>
</html>