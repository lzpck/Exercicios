package org.devinhouse.superherois.cli;

import org.devinhouse.superherois.exception.OpcaoInvalidaException;
import org.devinhouse.superherois.model.Heroi;
import org.devinhouse.superherois.model.Personagem;
import org.devinhouse.superherois.model.Vilao;

import java.util.List;
import java.util.Scanner;

public class Display {
    public void exibirMenu() {
        System.out.println();
        System.out.println("=== MENU ===");
        System.out.println("1 - Cadastrar Herói");
        System.out.println("2 - Cadastrar Vilão");
        System.out.println("3 - Listar");
        System.out.println("4 - Sair");
        System.out.println();
    }

    public Menu obterOperacao() throws OpcaoInvalidaException {
        System.out.println("Escolha uma opção: ");
        Scanner teclado = new Scanner(System.in);
        int codigoOpcao = teclado.nextInt();
        if (codigoOpcao < 0 || codigoOpcao > Menu.values().length){
            throw new OpcaoInvalidaException();
        }
        Menu menu = Menu.escolherOpcao(codigoOpcao);
        return menu;
    }

    public void exibirMensagem(String msg) {
        System.out.println(msg);
    }

    public Personagem cadastrar(TipoPersonagem tipo) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o nome: ");
        String nome = teclado.nextLine();
        System.out.println();
        System.out.print("Informe o super-poder: ");
        String poder = teclado.nextLine();
        System.out.println();
        Personagem personagem;
        if (tipo == TipoPersonagem.HEROI) {
            System.out.print("Informe o nome na vida real: ");
            String outroNome = teclado.nextLine();
            System.out.println();
            personagem = new Heroi(nome, poder, outroNome);
        } else {
            System.out.print("Informe o tempo de prisao: ");
            String prisao = teclado.nextLine();
            System.out.println();
            personagem = new Vilao(nome, poder, Integer.valueOf(prisao));
        }
        return personagem;
    }

    public void listar(List<Personagem> personagens){
        for (Personagem personagem : personagens){
            System.out.println(personagem);
        }
    }
}
