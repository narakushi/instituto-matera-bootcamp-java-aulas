package org.example.localdate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class ExemploLocalDate {
    public static void main(String[] args) {
        LocalDateTime data = LocalDateTime.now();

        System.out.println("Dia da semana "+data.getDayOfMonth());
        System.out.println("Mês: "+data.getMonthValue());
        System.out.println("Ano:" + data.getYear());
        System.out.println("Hora: "+ data.getHour());
        System.out.println("Minutos: " + data.getMinute());
        System.out.println("Segundos: " + data.getSecond());

        LocalDate outraData = LocalDate.of(2025, Month.MARCH, 10); // define o dia do mes e do ano
        System.out.println(outraData);
        System.out.println(outraData.isLeapYear()); //verifica se é ano bissexto
        System.out.println(outraData.lengthOfMonth()); // retorna o tamanho do mês
    }
}
