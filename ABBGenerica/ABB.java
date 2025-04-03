package ABBGenerica;

public class ABB<T extends Comparable<T>> {
    private ABBNode <T> root;

    // Se a raiz for null, a arvore está vazia
    public boolean isEmpty() {
        if (this.root == null) {
            return true;
        }
        else {
            return false;
        }
    }

    public void insert (T valor) {
        // Se vazia, adiciona um nó com "valor" e a define como raiz
        if (this.isEmpty() == true) {
            this.root = new ABBNode <T>(valor);
        }
        else {
            // chama a função de inserir caso ja haja nós na arvore
            inserir(this.root, valor);
        }
    }

    // recursivo
    public void inserir (ABBNode <T> node, T valor) {
        int retorno;

        // node != null garante que o nó acessado vai possuir valores como info, direita e esquerda
        if (node != null) { 
            // compara valor com node.getInfo()
            // retorno = 0, valor igual
            // retorno > 0, vai para direita
            // retorno < 0, vai para esquerda
            retorno = valor.compareTo(node.getInfo());
            if (retorno == 0) {     // valor repetido
                System.out.println("Valor repetido!!");
                return;
            }
            else if (retorno < 0) {     // valor menor
                // Chama a função inserir recursivamente até achar o lugar de inserção
                if (node.getLeft() != null) {
                    inserir(node.getLeft(), valor);
                }
                else {
                    ABBNode <T> novo = new ABBNode <T> (valor);
                    node.setLeft(novo);
                }
            }
            else {     // valor maior
                // Chama a função inserir recursivamente até achar o lugar de inserção
                if (node.getRight() != null) {
                    inserir(node.getRight(), valor);
                }
                else {
                    ABBNode <T> novo = new ABBNode <T> (valor);
                    node.setRight(novo);
                }
            }
        }
    }

    // recursivo
    private ABBNode<T> findNode (ABBNode <T> node, T value) {

        // Se r for null, o valor nao esta na arvore
        if (node == null) {
            return null;
        }

        // armazena em "result" a comparação de value e r.getInfo()
        // result igual a zero, encontrou o valor
        // result negativo, busca na esquerda
        // result positivo, busca na direita
        int result = value.compareTo(node.getInfo());

        if (result == 0) {      // Achou o valor
            return node;
        }
        else if (result < 0) {      // Busca na esquerda
            return findNode(node.getLeft(), value);
        }
        else {      // Busca na direita
            return findNode(node.getRight(), value);
        }
    }

    // Chamada da inserção sem recursão
    public void insertWithOut (T valor) {
        // Se vazia, adiciona um nó com "valor" e a define como raiz
        if (this.isEmpty() == true) {
            this.root = new ABBNode <T>(valor);
        }
        else {
            // chama a função de inserir caso ja haja nós na arvore
            inserirSemRecursao(root, valor);
        }
    }

    // Codido de inserção sem recursão
    private void inserirSemRecursao(ABBNode <T> node, T valor){ 
        int retorno;

        while (true) {
            retorno = valor.compareTo(node.getInfo());
            if (retorno == 0){
                System.out.println("Valor repetido.");
                return;
            }
            else if(retorno < 0){
                if(node.getLeft() != null){
                    node = node.getLeft();
                } else {
                    ABBNode <T> novo = new ABBNode<T>(valor);
                    node.setLeft(novo);
                    return;
                }
            }
            else {
                if(node.getRight() != null){
                    node = node.getRight();
                } else {
                    ABBNode <T> novo = new ABBNode<T>(valor);
                    node.setRight(novo);
                    return;
                }
            }
        }
    }

    private int buscar() {
        return nodeCount(this.root, T valor);
    }
    private int nodeCount(ABBNode <T> node, T valor) {
        int qtd = 0;
        while (node != null) {
            int result = valor.compareTo(node.getInfo());
            if (result == 0) {
                qtd++;
                node = node.getRight();
            }
            else if (result < 0) {
                node = node.getLeft();
            }
            else {
                node = node.getRight();
            }
        }
        return qtd;
    }

}