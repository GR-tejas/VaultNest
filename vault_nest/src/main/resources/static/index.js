const { use } = require("react");

const lginBtn = $("#lginBtn");
const regBtn = $("#regBtn");
const Username = $("#uname");
const Password = $("#passw");

function AuthenticationRequestDto() {
    this.username = Username.val();
    this.password = Password.val();
}

lginBtn.click(function() {
    AuthenticateUser("login");
});

regBtn.click(function() {
    AuthenticateUser("register");
});

function AuthenticateUser(action) {

    const req = AuthenticationRequestDto();

    fetch("/" + action, {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(req)
    });
}