package Exercicio4;

import java.util.Scanner;

public class Aplicacao {

    public static void main(String[] args) {

        boolean idadeValida = false;
        Integer idade = null;

        while (!idadeValida){
            System.out.println("Qual é a sua idade?");
            Scanner teclado = new Scanner(System.in);
            String resposta = teclado.next();
            try {
                idade = Integer.valueOf(resposta);
                if (idade <= 0 || idade > 100){
                    throw new IdadeInvalida();
                }
                idadeValida = true;
            } catch (NumberFormatException e){
                System.out.println("O valor informado é inválido por não ser um número!");
            } catch (IdadeInvalida e){
                System.out.println("Idade é inválida por estar fora do intervalo necessário!");
            }
        }
        System.out.println("Sua idade é" +
                idade);
    }
}
