package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> lista = new LinkedList<String>();
        lista.adicionar("AC");
        lista.adicionar("BA");
        lista.adicionar("CE");
        lista.adicionar("DF");

        for(int i = 0; i < lista.getTamanho(); i++){
            System.out.println(lista.getPosicao(i).getValor());
        }

        //remover estado CE
        lista.remover("AC");
        System.out.println("REMOVENDO");
        for(int i = 0; i < lista.getTamanho(); i++){
            System.out.println(lista.getPosicao(i).getValor());
        }

        LinkedList<Clientes> cliente = new LinkedList<Clientes>();
        cliente.adicionar(new Clientes("Vitor","123"));
        cliente.adicionar(new Clientes("Zago","456"));
        cliente.adicionar(new Clientes("Davi","789"));

        for(int i = 0; i < cliente.getTamanho(); i++){
            System.out.println(cliente.getPosicao(i).getValor());
        }


    }
}