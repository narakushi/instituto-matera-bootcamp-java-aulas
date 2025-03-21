package org.example.TratamentoExcecoes;

public class Conta {
    private String  tipoConta;
    private Double saldo;
    private Double taxaOperacao;

    // como tratar exceções
    public void sacar(Double valor) throws Exception{
        Double valorADescontar = valor + this.taxaOperacao;

        if(this.saldo <= 0 || saldo < valorADescontar){
            throw new Exception("Saldo insuficiente");
        }

        if(valor == 0){
            throw new ExcecaoValorParaSaqueZerado();
        }

        this.saldo -= valorADescontar;
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

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }
}
