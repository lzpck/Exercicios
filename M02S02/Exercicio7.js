let avaliacaoRuim = 0;
let i = 1;
while (i <= 4) {
  let review = prompt("Qual é a sua avaliação para a série 'Stranger Things'? (ruim, bom, excelente)");
  if (review === "ruim") {
    avaliacaoRuim++;
  }
  i++;
}
console.log(`${avaliacaoRuim} pessoas classificaram a série como ruim.`);
