package org.example;

public class Queue {
    private LinkedList queue;

    public Queue(){
        this.queue = new LinkedList();
    }

    public void add(String novoValor){
        this.queue.adicionar(novoValor);
    }

    public void remove(){
        this.queue.remover(this.get_posicao());
    }

    public String get_posicao(){
        return (String) this.queue.getFirst().getValor();
    }

    public LinkedList getQueue() {
        return queue;
    }

    public void setQueue(LinkedList queue) {
        this.queue = queue;
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add("Jao");
        q.add("Jose");
        q.add("Vitor");
        q.add("Olavo");
        q.add("Davi");
        q.add("Otario");

        System.out.println(q.get_posicao());
        q.remove();
        System.out.println(q.get_posicao());
    }
}
