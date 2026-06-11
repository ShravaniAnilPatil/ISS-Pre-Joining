document.getElementById("myForm").addEventListener("submit", function(event){

    event.preventDefault();

    let name = document.getElementById("name").value.trim();
    let email = document.getElementById("email").value.trim();
    let password = document.getElementById("password").value.trim();
    let age = document.getElementById("age").value;
    let phone = document.getElementById("phone").value.trim();

    let message = document.getElementById("message");

    if(name === ""){
        message.innerHTML = "Name cannot be empty";
        return;
    }

    if(!email.includes("@")){
        message.innerHTML = "Enter valid email";
        return;
    }

    if(password.length < 8){
        message.innerHTML = "Password must contain at least 8 characters";
        return;
    }

    if(age < 18){
        message.innerHTML = "Age must be 18 or above";
        return;
    }

    if(phone.length !== 10){
        message.innerHTML = "Phone number must be 10 digits";
        return;
    }

    message.innerHTML = "Registration Successful!";
});