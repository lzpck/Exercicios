const escolherCor = document.querySelector("#escolherCor");
const box = document.querySelector("#box");
const corSelecionada = document.querySelector("#corSelecionada");

escolherCor.addEventListener("change", function () {
    box.style.backgroundColor = escolherCor.value;
    corSelecionada.style.backgroundColor = escolherCor.value;
});