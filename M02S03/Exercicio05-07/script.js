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

localStorage.setItem("playlist", JSON.stringify(playlist));

const tableBody = document.querySelector("#table-body");

const savedPlaylist = JSON.parse(localStorage.getItem("playlist"));

for (let i = 0; i < savedPlaylist.length; i++) {
    const music = savedPlaylist[i];
    const row = document.createElement("tr");
    const nameColumn = document.createElement("td");

    nameColumn.textContent = music.nome;
    const singerColumn = document.createElement("td");
    singerColumn.textContent = music.cantor;

    const actionColumn = document.createElement("td");
    const deleteButton = document.createElement("button");
    deleteButton.textContent = "Excluir";
    deleteButton.style.backgroundColor = "red";
    deleteButton.style.color = "white";
    deleteButton.style.padding = "5px 5px";
    deleteButton.style.borderRadius = "5px";
    deleteButton.style.cursor = "pointer";
    deleteButton.addEventListener("click", function () {
        if (confirm("Você deseja realmente excluir a música " + music.nome + "?")) {
            savedPlaylist.splice(i, 1);
            localStorage.setItem("playlist", JSON.stringify(savedPlaylist));
            row.remove();
        }
    });
    actionColumn.appendChild(deleteButton);

    row.appendChild(nameColumn);
    row.appendChild(singerColumn);
    row.appendChild(actionColumn);
    tableBody.appendChild(row);
}