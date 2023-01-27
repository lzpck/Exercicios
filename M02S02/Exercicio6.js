let peso = parseFloat(prompt("Digite seu peso:"));
let altura = parseFloat(prompt("Digite sua altura:"));

let imc = peso / (altura * altura);

if (imc >= 25) {
    alert("Você está acima do peso, procure um médico");
} else if (imc >= 18.5 && imc <= 24.9) {
    document.getElementById("result").innerHTML = "<h3>PARABÉNS!! Você está no peso ideal</h3>";
} else {
    document.getElementById("result").innerHTML = "<h3>Você está abaixo do peso, procure um médico</h3>";
}
