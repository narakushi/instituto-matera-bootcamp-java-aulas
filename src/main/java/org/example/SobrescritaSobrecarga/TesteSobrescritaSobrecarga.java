package org.example.SobrescritaSobrecarga;

public class TesteSobrescritaSobrecarga {
    public static void main(String[] args) {
        Conta contaPoupanca = new ContaPoupanca(6000.00);
        contaPoupanca.depositar(500.00);

        ContaCorrente contaCorrenteSemTaxa = new ContaCorrente(9000.00);
        contaCorrenteSemTaxa.sacar(1000.00);

        ContaCorrente contaCorrenteComTaxa = new ContaCorrente(9000.00);
        contaCorrenteComTaxa.sacar(1000.00, 0.50);

        System.out.println("Saldo da conta poupança: " + contaPoupanca.getSaldo());
        System.out.println("Saldo da conta corrente sem taxa: " + contaCorrenteSemTaxa.getSaldo());
        System.out.println("Saldo da COnta Corrente com taxa: " + contaCorrenteComTaxa.getSaldo());
    }
}
