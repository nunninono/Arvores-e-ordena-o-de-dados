package QueueGenerica;

class Queue<T> {
    private QueueNode<T> inicio;
    private QueueNode<T> fim;

    Queue() {
        this.inicio = null;
        this.fim = null;
    }

    public boolean isEmpty() {
        return inicio == null;
    }

    public void enqueue(T valor) {
        QueueNode<T> newNode = new QueueNode<>(valor);
        if (isEmpty()) {
            inicio = fim = newNode;
        } else {
            fim.setProx(newNode);
            fim = newNode;
        }
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Fila vazia!");
        }
        T valor = inicio.getInfo();
        inicio = inicio.getProx();
        if (inicio == null) { // Se a fila ficar vazia, rear também deve ser null
            fim = null;
        }
        return valor;
    }

    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Fila vazia!");
        }
        return inicio.getInfo();
    }
}
