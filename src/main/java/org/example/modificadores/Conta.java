package org.example.modificadores;

public class Conta {
    private Double saldo;
    private String titular;

    public Conta(Double saldo){
        this.saldo = saldo;
    }

    public Double getSaldo(){
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }
}
