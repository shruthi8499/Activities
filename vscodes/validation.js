function validateForm() {
    const fullName = document.getElementById("fullName").value;
    const email = document.getElementById("email").value;
    const password = document.getElementById("password").value;
    const confirmPassword = document.getElementById("confirmPassword").value;
    const errorMessages = document.getElementById("errorMessages");

    errorMessages.innerHTML = ""; // Clear previous error messages

    if (!fullName) {
        errorMessages.innerHTML += "Full Name cannot be empty<br>";
    }
    if (fullName.length > 10) {
        errorMessages.innerHTML += "Full Name should not exceed 10 characters<br>";
    }
    if (!email) {
        errorMessages.innerHTML += "Email cannot be empty<br>";
    }
    if (email.length > 10) {
        errorMessages.innerHTML += "Email should not exceed 10 characters<br>";
    }
    if (!password) {
        errorMessages.innerHTML += "Password cannot be empty<br>";
    }
    if (password.length > 10) {
        errorMessages.innerHTML += "Password should not exceed 10 characters<br>";
    }
    if (password !== confirmPassword) {
        errorMessages.innerHTML += "Passwords do not match<br>";
    }

    if (errorMessages.innerHTML !== "") {
        return false; // Prevent form submission if there are errors
    }

    return true;
}