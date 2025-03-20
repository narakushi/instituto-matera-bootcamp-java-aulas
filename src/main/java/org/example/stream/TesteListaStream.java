package org.example.stream;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TesteListaStream {
    public static void main(String[] args) {
        // List<String> contas = new ArrayList();
        List<String> contas = new ArrayList<String>();
        contas.add("Conta Poupança");
        contas.add("Conta Corrente");
        contas.add("Conta Pagamento");
        contas.add("Conta Poupança");

        // usando stream(), funciona com Set, List
        //FIltrando lista
        //Retornando apenas contas poupança
        contas.stream().filter(
                conta -> filterLista(conta))
                .forEach(conta -> System.out.println("Conta -> " + conta));

        long total = contas.stream().filter(
                conta -> filterLista(conta)).count();
        System.out.println("Total de contas Poupança: " + total);

        //Versão com for ao invés de stream();
        long totalContas = 0l;

        for(int index=0; index < contas.size(); index++){
            String conta = contas.get(index);
            if(filterLista(conta)) {
                totalContas++;
            }
        }

        System.out.println("Total de contas no for: " + totalContas);
    }



    public static Boolean filterLista(String conta){
        return conta.contains("Poupança");
    }
}
