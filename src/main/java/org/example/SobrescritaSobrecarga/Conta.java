package org.example.SobrescritaSobrecarga;

//era para usar o @Getter e @Setter para ter os gets e sets automaticamente do lombok

public class Conta {
    protected Double saldo;
    protected Double taxaOperacao;

    public Conta(Double saldo){
        this.saldo = saldo;
        this.taxaOperacao = 0.45;
    }

    public void depositar(Double valor) {
        this.saldo += valor - taxaOperacao;
    }

    public Double getTaxaOperacao() {
        return taxaOperacao;
    }

    public void setTaxaOperacao(Double taxaOperacao) {
        this.taxaOperacao = taxaOperacao;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
