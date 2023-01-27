let num = parseFloat(prompt("Digite um número:"));

if (num % 2 == 0) {
    document.getElementById("result").innerHTML = "<h3> O número digitado é par </h3>";
} else {
    document.getElementById("result").innerHTML = "<h3> O número digitado é ímpar </h3>";
}