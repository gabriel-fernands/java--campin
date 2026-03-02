package com.example.maratona_java.introducaoorientacaoaobjeto.test;

import com.example.maratona_java.introducaoorientacaoaobjeto.dominio.Carro;
import com.example.maratona_java.introducaoorientacaoaobjeto.dominio.Estudante;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro1 = new Carro();

        System.out.println(carro.nome);
        System.out.println(carro.ano);
        System.out.println(carro.modelo);

        System.out.println("****************************");

        System.out.println(carro.nome);
        System.out.println(carro.ano);
        System.out.println(carro.modelo);
    }
}
