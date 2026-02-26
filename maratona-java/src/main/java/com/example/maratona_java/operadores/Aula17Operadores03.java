package com.example.maratona_java.operadores;

public class Aula17Operadores03 {
    public static void main(String[] args) {

        double valorContaCorrente = 200;
        double valorContaPoupanca = 1000;
        float valorPlastaty = 5000F;

        boolean isPlaystatiCompravel = valorContaCorrente > valorPlastaty || valorContaPoupanca > valorPlastaty;
        System.out.println("isPlaystatiCompravel" + isPlaystatiCompravel);




    }


}