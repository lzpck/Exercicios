const num1 = document.querySelector("#num1");
const num2 = document.querySelector("#num2");
const addBtn = document.querySelector("#add");
const subtractBtn = document.querySelector("#subtract");
const result = document.querySelector("#result");

addBtn.addEventListener("click", function () {
    result.innerHTML = Number(num1.value) + Number(num2.value);
});

subtractBtn.addEventListener("click", function () {
    result.innerHTML = Number(num1.value) - Number(num2.value);
});