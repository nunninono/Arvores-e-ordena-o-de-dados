package QueueGenerica;

class QueueNode<T> {
    private T info;
    private QueueNode<T> prox;

    QueueNode(T info) {
        this.info = info;
        this.prox = null;
    }

    T getInfo() {
        return info;
    }

    QueueNode<T> getProx() {
        return prox;
    }

    void setProx(QueueNode<T> prox) {
        this.prox = prox;
    }
}