package org.example;

public abstract class Conta {
    private Double saldo;


    // criação de métodos acessores pois o atributo saldo é privado

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double valor){
        this.saldo = valor;
    }
}
