package org.example;

public class Stack {
    private LinkedList<String> stack;

    public Stack(){
        this.stack = new LinkedList<>();
    }

    public void push(String novoValor){
        this.stack.adicionarComeco(novoValor);
    }

    public void pop(){
        if (this.stack.getFirst() != null) {
            this.stack.remover(this.stack.getFirst().getValor());
        }
    }

    public String get_position(){
        if (this.stack.getFirst() != null) {
            return this.stack.getFirst().getValor();
        }
        return null;
    }

    public LinkedList<String> getStack() {
        return stack;
    }

    public void setStack(LinkedList<String> stack) {
        this.stack = stack;
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push("Vitor");
        s.push("rafael");
        s.push("Olivia");
        s.push("Davi");
        s.push("Daiane");

        System.out.println("Topo da pilha antes do pop: " + s.get_position());
        s.pop();
        System.out.println("Topo da pilha depois do pop: " + s.get_position());
    }
}
