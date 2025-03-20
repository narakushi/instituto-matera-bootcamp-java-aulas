package org.example.collections.lista.map;

import java.util.HashMap;
import java.util.Map;

public class TesteMapNumeros {
    public static void main(String[] args) {
        //Map<String, List<String>> contas = new HashMap<>(); //com o list cria uma colletction internamente

        Map<String, Integer> contas = new HashMap<>();
        //No map a chave é unica

        contas.put("Conta Corrente", 1);
        contas.put("Conta Pagamento", 2);
        contas.put("Conta Poupanca", 3);
        contas.put("Conta Corrente", 4);

        System.out.println(contas);
        System.out.println(contas.get("Conta Corrente")); //acesso individual

        System.out.println(contas.keySet()); // quando não se sabe as chaves do elemento, lista suas chavesok
    }
}
