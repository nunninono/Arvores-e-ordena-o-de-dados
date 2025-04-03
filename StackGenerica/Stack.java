package StackGenerica;

class Stack<T> {
    private StackNode<T> topo;

    Stack() {
        this.topo = null;
    }

    public boolean isEmpty() {
        return topo == null;
    }

    public void push(T valor) {
        StackNode<T> newNode = new StackNode<>(valor);
        newNode.setProx(topo);
        topo = newNode;
    }

    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Pilha vazia!");
        }
        T valor = topo.getInfo();
        topo = topo.getProx();
        return valor;
    }

    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Pilha vazia!");
        }
        return topo.getInfo();
    }
}