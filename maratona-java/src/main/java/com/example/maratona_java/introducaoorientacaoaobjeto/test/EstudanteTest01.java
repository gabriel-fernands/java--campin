package com.example.maratona_java.introducaoorientacaoaobjeto.test;

import com.example.maratona_java.introducaoorientacaoaobjeto.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
