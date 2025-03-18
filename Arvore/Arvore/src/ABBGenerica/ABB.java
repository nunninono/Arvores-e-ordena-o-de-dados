package ABBGenerica;

public class ABB <T extends Comparable<T>>{
    private ABBNode<T> root;

    public boolean isEmpty() {
        if (this.root == null) {
            return true;
        }
        else {
            return false;
        }
    }

    public void insert (T valor) {
        if (this.isEmpty() == true) {
            this.root = new ABBNode<T> (valor);
        }
        else {
            inserir(this.root, valor);
        }
    }

    public void inserir (ABBNode<T> node, T valor) { // VERSÃO RECURSIVA
        int retorno;

        if (node != null) {
            retorno = valor.compareTo(node.getInfo());
            if (retorno == 0) {
                System.out.println("Valor repetido!!");
            }
        }
    }
}
