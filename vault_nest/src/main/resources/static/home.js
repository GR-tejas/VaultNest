const uploadBtn = $("#uploadButton");

uploadBtn.click(function() {

    const fileInput = $("#fileInput");
    const file = fileInput[0].files[0];

    if(!file) {
        console.log("No file selected");
        return;
    }

    console.log(file);
    console.log(file.name);
    console.log(file.size);
    console.log(file.type);

    const formData = new FormData();

    formData.append("file",file);

    fetch("/files/upload", {
        method : "POST",
        body : formData
    })
    .then(response => response.text())
    .then(data => {
        console.log(data);
    })
    .catch(error => {
        console.log(data);
    });

})