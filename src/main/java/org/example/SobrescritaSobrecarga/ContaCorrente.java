package org.example.SobrescritaSobrecarga;

public class ContaCorrente extends Conta{
    public ContaCorrente(Double saldo) {
        super(saldo);
    }

    public void sacar(Double valor) {
        this.saldo -= valor;
    }

    // realizando sobrecarga
    public void sacar(Double valor, Double taxaOperacao) {
        this.saldo -= (valor + taxaOperacao);
    }
}
