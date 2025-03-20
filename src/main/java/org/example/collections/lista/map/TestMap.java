package org.example.collections.lista.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {
        //Map<String, List<String>> contas = new HashMap<>(); //com o list cria uma colletction internamente

        Map<String, String> contas = new HashMap<>();
        //No map a chave é unica

        contas.put("Conta Corrente", "Samuel");
        contas.put("Conta Pagamento", "Karyn");
        contas.put("Conta Poupanca", "Paula");

        System.out.println(contas);
        System.out.println(contas.get("Conta Corrente")); //acesso individual

        System.out.println(contas.keySet()); // quando não se sabe as chaves do elemento, lista suas chavesok
    }
}
