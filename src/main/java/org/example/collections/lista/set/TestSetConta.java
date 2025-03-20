package org.example.collections.lista.set;

import java.util.HashSet;
import java.util.Set;

public class TestSetConta {

    public static void main(String[] args) {
        Set<Conta> contas = new HashSet<Conta>();

        contas.add(new Conta(123L, 300.00));
        contas.add(new Conta(1777L, 370.00));

        //Padrões comuns de projetos para inserir valores em um Set
//        contas.add(
//                Conta.builder()
//                        .saldo(258.98)
//                        .numeroConta(101L)
//                        .build()
//        )

        contas.forEach(conta -> System.out.println("Conta -> " + conta.getNumeroConta() + " " + conta.getSaldo()));
    }

}
