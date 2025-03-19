package org.example.lombok;

public class TestePessoa {
    public static void main(String[] args) {
        Pessoa pessoaJulia = new Pessoa();

        pessoaJulia.setId(1L);
        pessoaJulia.setNome("Julia");
        pessoaJulia.setIdade(24);

        System.out.println("Id: "+pessoaJulia.getId());
        System.out.println("Nome: "+pessoaJulia.getNome());
        System.out.println("Idade: "+pessoaJulia.getIdade());
    }
}
