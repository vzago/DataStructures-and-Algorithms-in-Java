package org.example;

public class Folha<TYPE> {
    private TYPE valor;
    private Folha <TYPE> esquerda;
    private Folha <TYPE> direita;

    public Folha(TYPE novoValor){
        this.valor = novoValor;
        this.esquerda = null;
        this.direita = null;
    }

    public void adicionar(TYPE valor){
        Folha<TYPE> novoelemento = new Folha<TYPE>(valor);
    }

    public Folha<TYPE> getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(Folha<TYPE> esquerda) {
        this.esquerda = esquerda;
    }

    public Folha<TYPE> getDireita() {
        return direita;
    }

    public void setDireita(Folha<TYPE> direita) {
        this.direita = direita;
    }

    public TYPE getValor() {
        return valor;
    }

    public void setValor(TYPE valor) {
        this.valor = valor;
    }
}
