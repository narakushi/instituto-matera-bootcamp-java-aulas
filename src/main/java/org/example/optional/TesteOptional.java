package org.example.optional;

import org.example.abstratas.Conta;

import java.util.Optional;

public class TesteOptional {

    public static void main(String[] args) {
        /*Conta conta = obtemConta();

        System.out.println("Saldo: "+ conta.getSaldo());*/

        Optional<Conta> optionalConta = obtemContaSemErro();

        if(optionalConta.isPresent()){
            System.out.println("Saldo: " + optionalConta.get().getSaldo());
        } else {
            System.out.println("Não foi localizado na Conta.");
        }
    }

    public static Conta obtemConta(){
        return null;
    };

    public static Optional<Conta> obtemContaSemErro(){
        return Optional.of(null);
    };

}
