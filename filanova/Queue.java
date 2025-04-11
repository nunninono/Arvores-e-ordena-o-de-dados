package filanova;

public class Queue<T> {
  QueueNode<T> inicio;
  QueueNode<T> fim;

  public boolean isEmpty() {
    return inicio == null;
  }

  public void enQueue (T valor) {
    QueueNode<T> novo = new QueueNode<T> (valor);
    if (isEmpty() == true) {
      inicio = novo;
      fim = novo;
    }
    else {
      fim.setProx(novo);
      fim = novo;
    }
  }

  public T deQueue () {
    if (isEmpty() == true) {
      return null;
    }
    T valor = inicio.getInfo();
    inicio.setProx(inicio.getProx());
    if (inicio == null) {
      fim = null;
    }
    return valor;
  }
}
