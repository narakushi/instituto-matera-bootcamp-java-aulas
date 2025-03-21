package org.example.TratamentoExcecoes;

//criando nossa propria execption
public class ExcecaoValorParaSaqueZerado extends Exception {
    public String getMessage() {
      return "Valor para saque não pode ser Zero.";
    };
}
