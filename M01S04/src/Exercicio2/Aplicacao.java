package Exercicio2;

public class Aplicacao {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        Funcionario funcionario = new Funcionario();

        String result = funcionario.obterCargo();
        System.out.println(result);
    }
}
