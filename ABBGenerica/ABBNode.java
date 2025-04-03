package ABBGenerica;

// não é public para que haja visibilidade de pacote (visivel apenas pelas classes dentro de ABBGenerica)
// ABBNode é apenas auxiliar
class ABBNode<T extends Comparable<T>> {
    
    private T info;
    private ABBNode <T> left;
    private ABBNode <T> right;

    // inicializa o no com valor info
    ABBNode (T info) {
        this.info = info;
    }

    // GET obtem os filhos da direita e da esquerda
    // SET modifica os filhos da direita e da esquerda
    // Nenhum get e set é publico (removem-se todos)
    T getInfo() {
        return info;
    }

    void setInfo(T info) {
        this.info = info;
    }

    ABBNode <T> getLeft() {
        return left;
    }

    void setLeft(ABBNode <T> left) {
        this.left = left;
    }

    ABBNode <T> getRight() {
        return right;
    }

    void setRight(ABBNode <T> right) {
        this.right = right;
    }
}