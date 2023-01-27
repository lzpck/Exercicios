let produtos = {};
let selecionado;

while (selecionado !== "6") {
    selecionado = prompt("Qual produto deseja comprar?\n(1) Hortifruti\n(2) Laticínios\n(3) Carnes\n(4) Peixes\n(5) Aves\n(6) Fechar pedido");
    if (selecionado === "6") {
        break;
    }
    let quantidade = prompt("Quantidade de itens que deseja comprar?");
    produtos[selecionado] = (produtos[selecionado] || 0) + parseInt(quantidade);
}

let maior = 0;
let maiorProduto;
for (let produto in produtos) {
    if (produtos[produto] > maior) {
        maior = produtos[produto];
        maiorProduto = produto;
    }
}
console.log(`O produto selecionado em maior quantidade foi: ${maiorProduto} com ${maior} itens`);
