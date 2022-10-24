package org.devinhouse.superherois.cli;

public enum Menu {
    CADASTRAR_HEROI,
    CADASTRAR_VILAO,
    LISTAR,
    SAIR;

    public static Menu escolherOpcao(int codigo){
        Menu[] opcao = Menu.values();
        return opcao[codigo-1];
    }
}
