const lginBtn = $("#lginBtn");
const regBtn = $("#regBtn");
const Username = $("#uname");
const Password = $("#passw");
const msgDiv = $("#message");

function AuthenticationRequestDto() {
    this.username = Username.val();
    this.password = Password.val();
}

function AuthenticationResponseDto(_message, _isError) {
    this.message = _message;
    this.isError = _isError;
}

lginBtn.click(function() {
    AuthenticateUser("login");
});

regBtn.click(function() {
    AuthenticateUser("register");
});

function AuthenticateUser(action) {

    const req = new AuthenticationRequestDto();

    fetch("/" + action, {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(req)
    })
    .then((res) => res.json())
    .then((data) => {
        console.log(action + "\n" + data.isError + "\n" + data.message)
        let message = document.createElement("p");
        message.textContent = data.message;
        message.style.color = (data.isError ?  "red" : "blue");
        if(action === "register") {
            
        } 
        msgDiv.empty();
        msgDiv.append(message);
    });
}