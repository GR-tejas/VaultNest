const { use } = require("react");

const lginBtn = $("#lginBtn");
const regBtn = $("#regBtn");
const Username = $("#uname");
const Password = $("#passw");

function AuthenticationRequestDto(username, password) {
    this.username = username;
    this.password = password;
}

lginBtn.click(function() {
    const uname = Username.val();
    const passw = Password.val();

    const req = AuthenticationRequestDto(uname, passw);

    fetch("/")
});