package org.example.SobrescritaSobrecarga;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(Double saldo){
        super(saldo);
    }

    @Override //momento de sobrescrita do método
    public void depositar(Double valor){
        this.saldo += valor;
    };
}
