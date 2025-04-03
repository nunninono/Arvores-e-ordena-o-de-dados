package StackGenerica;

class StackNode<T> {
    private T info;
    private StackNode<T> prox;

    StackNode(T info) {
        this.info = info;
        this.prox = null;
    }

    T getInfo() {
        return info;
    }

    StackNode<T> getProx() {
        return prox;
    }

    void setProx(StackNode<T> prox) {
        this.prox = prox;
    }
}