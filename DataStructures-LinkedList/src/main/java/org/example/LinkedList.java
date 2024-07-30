package org.example;

public class LinkedList <TYPE>{
    private Node<TYPE> first;
    private Node<TYPE> last;
    private int tamanho;

    public LinkedList() {
        this.tamanho = 0;
    }

    public void adicionar (TYPE novoValor){
        Node<TYPE> novoNode = new Node<TYPE> (novoValor);
        if(this.first == null && this.last == null){
            this.first = novoNode;
            this.last = novoNode;
        }else{
            this.last.setProximo(novoNode);
            this.last = novoNode;
        }
        this.tamanho++;
    }

    public void remover(TYPE valorProcurado){
        Node<TYPE> current = this.first;
        Node<TYPE> previous = null;

        if(this.tamanho == 1){
            this.first = null;
            this.last = null;
        }

        for(int i = 0; i < this.getTamanho(); i++){
            if(current.getValor().equals(valorProcurado)){
                if(current == this.first){
                    this.first = current.getProximo();
                    current.setProximo(null);
                }else if(current == this.last){
                    this.last = previous;
                    previous.setProximo(null);
                }else{
                    previous.setProximo(current.getProximo());
                    current = null;

                }
                this.tamanho--;
                break;
            }
            previous = current;
            current = current.getProximo();
        }
    }

    public Node getposicao(int posicao){
        Node current = this.first;
        for(int i = 0; i < posicao; i++){
            if(current.getProximo()!= null){
                current = current.getProximo();
            }
        }
        return current;
    }

    public Node<TYPE> getFirst() {
        return first;
    }

    public void setFirst(Node<TYPE> first) {
        this.first = first;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public Node<TYPE> getLast() {
        return last;
    }

    public void setLast(Node<TYPE> last) {
        this.last = last;
    }

    public IteratorLinkedList<TYPE> getIterator(){
        return new IteratorLinkedList<TYPE>(this.first);
    }
}
