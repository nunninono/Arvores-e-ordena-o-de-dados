package filanova;

public class QueueNode<T> {
  QueueNode<T> prox;
  T info;

  Public Queue (T info) {
    this.info = info;
    this.prox = null;
  }

  T getInfo () {
    return info;
  }

  void setProx (QueueNode<T> prox) {
    this.prox = prox;
  }

  QueueNode<T> getProx () {
    return prox;
  }
}
