package org.example.TratamentoExcecoes;

public class TesteExcecao {
    public static void main(String[] args) throws Exception{
        Conta conta = new Conta();

        conta.setSaldo(1000.00);
        conta.setTaxaOperacao(0.5);

        // o tratamento ocorre no main

        try {
            System.out.println("Saldo inicial: " + conta.getSaldo());
            conta.sacar(0.00);
        } catch (ExcecaoValorParaSaqueZerado e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Saldo da conta: " + conta.getSaldo());
        }
    }

}
