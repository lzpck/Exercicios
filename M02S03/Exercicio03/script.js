const colorPicker = document.querySelector("#color-picker");
const box = document.querySelector("#box");
const selectedColor = document.querySelector("#selected-color");

colorPicker.addEventListener("change", function () {
    box.style.backgroundColor = colorPicker.value;
    selectedColor.style.backgroundColor = colorPicker.value;
});