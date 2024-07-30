package org.example;

public class Node <TYPE>{
    private TYPE valor;
    private Node<TYPE> proximo;

    public Node(TYPE novoValor){
        this.valor = novoValor;
    }

    public TYPE getValor() {
        return valor;
        }

    public void setValor(TYPE valor) {
        this.valor = valor;
    }

    public Node<TYPE> getProximo() {
        return proximo;
    }

    public void setProximo(Node<TYPE> proximo) {
        this.proximo = proximo;
    }
}
