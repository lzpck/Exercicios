package Exercicio1;

public class ContaCorrente extends Conta implements Operavel{
    private double saldo;

    @Override
    protected double ObterSaldoAtual() {
        return saldo;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public double sacar(double valor) {
        saldo -= valor;
        return saldo;
    }
}
