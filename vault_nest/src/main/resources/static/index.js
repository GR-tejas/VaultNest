const uploadBtn = $("#uploadButton");

uploadBtn.click(function() {
    const fileInput = $("#fileInput");
    const file = fileInput[0];
    console.log(file);
    console.log(file.name);
    console.log(file.size);
    console.log(file.type);
})