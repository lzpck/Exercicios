const jogadoresSelecao94 = [{
        nome: 'Taffarel',
        posicao: 'Goleiro',
    },
    {
        nome: 'Jorginho',
        posicao: 'Lateral Direito',
    },
    {
        nome: 'Ricardo Rocha',
        posicao: 'Zagueiro',
    },
    {
        nome: 'Mauro Silva',
        posicao: 'Volante',
    },
    {
        nome: 'Bebeto',
        posicao: 'Atacante',
    },
    {
        nome: 'Romário',
        posicao: 'Atacante',
    },
    {
        nome: 'Dunga',
        posicao: 'Volante',
    },
];

let tabela = "<table><tr><th>Nome</th><th>Posição</th></tr>";

jogadoresSelecao94.forEach(jogador => {
    tabela += "<tr><td>" + jogador.nome + "</td><td>" + jogador.posicao + "</td></tr>";
});

tabela += "</table>";

console.log(tabela);