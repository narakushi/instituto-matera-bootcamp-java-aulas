package org.example.collections.lista.set;

//import lombok.Builder;
//import lombok.Data;

//@Data possui o getter e o setter imbutido para cada atributo
//@Builder;

public class Conta {
    private Long numeroConta = 100L;
    private Double saldo;

    public Conta(Long numeroConta, Double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    @Override
    //Define o hash da classe
    public int hashCode() {
        return numeroConta.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        Conta conta = (Conta) obj; //faz um cache
        return this.numeroConta.equals(conta.getNumeroConta());
    }

    public Long getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(Long numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
