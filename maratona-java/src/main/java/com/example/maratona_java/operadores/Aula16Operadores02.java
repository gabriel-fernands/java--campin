package com.example.maratona_java.operadores;

public class Aula16Operadores02 {
    public static void main(String[] args) {

        // + - / *
        int num01 = 10;
        int num02 = 20;

        Integer in = num01 + num02;
        System.out.println(in);
        System.out.println("Valor: " + (num01 + num02));

      //%
        int resto = 21 % 7;
        System.out.println(resto);

        // <> <= >= == !=
       boolean isDezMaiorqueVinte =  10 > 20;
       boolean isDezMenorqueVinte =  10 < 20;
       boolean isDezIgualVinte =  10 == 20;
       boolean isDezIgualDez =  10 == 10;
       boolean isDezDiferenteDez =  10 != 10.0;

        System.out.println(isDezMaiorqueVinte);
        System.out.println(isDezMenorqueVinte);
        System.out.println(isDezIgualVinte);
        System.out.println(isDezIgualDez);
        System.out.println(isDezDiferenteDez);

        // && (AND) || (or) !

        int idade = 35;
        float salario = 3500;

        var isDentroDaLeiMaiorqueTrinta = idade > 30 && salario >= 4612;
        var isDentroDaLeiMenoorqueTrinta = idade < 30 && salario >= 3381;

    }


}