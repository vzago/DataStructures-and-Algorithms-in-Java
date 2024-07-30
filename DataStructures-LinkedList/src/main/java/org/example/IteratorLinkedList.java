package org.example;

public class IteratorLinkedList<TYPE> {
    private Node <TYPE> elemento;

    public IteratorLinkedList(Node <TYPE> atual){
        this.elemento = atual;
    }

    public boolean temProximo(){
        if(this.elemento.getProximo() == null){
            return false;
        }else{
            return true;
        }
    }

    public Node<TYPE> getProximo(){
        this.elemento = this.elemento.getProximo();
        return this.elemento;
    }
}
