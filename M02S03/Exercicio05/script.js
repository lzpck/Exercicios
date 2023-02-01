const playlist = [{
        nome: "Listen to your heart",
        cantor: "Roxette"
    },
    {
        nome: "Bloody Mary",
        cantor: "Lady Gaga"
    },
    {
        nome: "Bones",
        cantor: "Imagine Dragons"
    },
    {
        nome: "Sugar honey ice and tea",
        cantor: "Bring me the horizon"
    },
    {
        nome: "Rock you like a hurricane",
        cantor: "Scorpions"
    },
    {
        nome: "Pure/Honey",
        cantor: "Beyoncé"
    },
];

const tableBody = document.querySelector("#table-body");

for (let i = 0; i < playlist.length; i++) {
    const music = playlist[i];
    const row = document.createElement("tr");
    const nameColumn = document.createElement("td");
    
    nameColumn.textContent = music.nome;
    const singerColumn = document.createElement("td");
    singerColumn.textContent = music.cantor;
    row.appendChild(nameColumn);
    row.appendChild(singerColumn);
    tableBody.appendChild(row);
}