// Capturando o nome do aluno
let nome = prompt("Digite o nome do aluno:");

// Criando o array para armazenar as notas
let notas = [];

// Laço para capturar as notas
while (true) {
    let nota = prompt("Digite a nota do aluno:");
    if (nota === "") {
        break;
    }
    notas.push(parseFloat(nota));
    if(notas.length >= 4) break;
}

// Variável para armazenar a soma das notas
let soma = 0;

// Laço para calcular a soma das notas
for (let i = 0; i < notas.length; i++) {
    soma += notas[i];
}

// Calculando a média
let media = soma / notas.length;

// Verificando se o aluno foi aprovado
if (media >= 7) {
    console.log(nome + " foi aprovado com média " + media);
} else {
    console.log(nome + " foi reprovado com média " + media);
}
