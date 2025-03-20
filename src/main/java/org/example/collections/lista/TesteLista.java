package org.example.collections.lista;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TesteLista {
    public static void main(String[] args) {
       // List<String> contas = new ArrayList();
        Set<String> contas = new HashSet<String>();
        contas.add("Conta Poupança");
        contas.add("Conta Corrente");
        contas.add("Conta Pagamento");
        contas.add("Conta Poupança");

        //Acessando itens do List

//        System.out.println(contas.get(0));
//        System.out.println(contas.get(1));
//        System.out.println(contas.get(2));
//
//        System.out.println(contas.get(3));

        //uso do lambda
        contas.forEach(conta -> System.out.println("Conta -> " + conta));
    }
}
