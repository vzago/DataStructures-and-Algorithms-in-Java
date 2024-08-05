package org.example;

public class LinkedList<TYPE> {
    private Node<TYPE> first;
    private Node<TYPE> last;
    private int tamanho;

    public LinkedList() {
        this.tamanho = 0;
    }

    public void adicionar(TYPE novoValor){
        Node<TYPE> novoNode = new Node<TYPE>(novoValor);
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

        while(current != null){
            if(current.getValor().equals(valorProcurado)){
                if(current == this.first){
                    this.first = current.getProximo();
                    if(this.first == null){
                        this.last = null;
                    }
                } else if(current == this.last){
                    this.last = previous;
                    if(this.last != null){
                        this.last.setProximo(null);
                    }
                } else {
                    previous.setProximo(current.getProximo());
                }
                this.tamanho--;
                break;
            }
            previous = current;
            current = current.getProximo();
        }
    }

    public Node<TYPE> getPosicao(int posicao){
        Node<TYPE> current = this.first;
        for(int i = 0; i < posicao; i++){
            if(current.getProximo() != null){
                current = current.getProximo();
            }
        }
        return current;
    }

    public void adicionarComeco(TYPE novoValor){
        Node<TYPE> novoElemento = new Node<TYPE>(novoValor);
        if(this.first == null && this.last == null){
            this.first = novoElemento;
            this.last = novoElemento;
        }else{
            novoElemento.setProximo(this.first);
            this.first = novoElemento;
        }
        this.tamanho++;
    }

    public Node<TYPE> getFirst() {
        return first;
    }

    public int getTamanho() {
        return tamanho;
    }

    public Node<TYPE> getLast() {
        return last;
    }

    public IteratorLinkedList<TYPE> getIterator(){
        return new IteratorLinkedList<TYPE>(this.first);
    }
}
