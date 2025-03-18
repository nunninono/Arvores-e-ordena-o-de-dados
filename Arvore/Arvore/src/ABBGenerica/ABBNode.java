package ABBGenerica;

class ABBNodepublic <T extends Comparable<T>>{

    // Atributos
    private T info;
    private ABBNode <T> left;
    private ABBNode <T> right;

    // Construtor
    ABBNode (T info) {
        this.info = info;
    }

    // gets and sets
    T getInfo() {
        return info;
    }

    void setInfo(T info) {
        this.info = info;
    }

    ABBNode<T> getLeft() {
        return left;
    }

    void setLeft(ABBNode<T> left) {
        this.left = left;
    }

    ABBNode<T> getRight() {
        return right;
    }

    void setRight(ABBNode<T> right) {
        this.right = right;
    }
    
}
