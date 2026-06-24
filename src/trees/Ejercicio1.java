package trees;

import structures.node.Node;

public class Ejercicio1 {

    public Node<Integer> insert(int[] numeros) {
        if (numeros == null || numeros.length == 0) {
            return null;
        }

        Node<Integer> root = new Node<>(numeros[0]);

        for (int i = 1; i < numeros.length; i++) {
            insertarRecursivo(root, numeros[i]);
        }

        return root;
    }

    private void insertarRecursivo(Node<Integer> actual, int valor) {
        if (valor < actual.getValue()) {
            if (actual.getLeft() == null) {
                actual.setLeft(new Node<>(valor));
            } else {
                insertarRecursivo(actual.getLeft(), valor);
            }
        } else if (valor > actual.getValue()) {
            if (actual.getRight() == null) {
                actual.setRight(new Node<>(valor));
            } else {
                insertarRecursivo(actual.getRight(), valor);
            }
        }
    }

    public void printTree(Node<Integer> root) {
        System.out.println("Imprimiendo el arbol:");
        printTreeRecursivo(root, 0);
    }

    private void printTreeRecursivo(Node<Integer> actual, int nivel) {
        if (actual == null) {
            return;
        }

        printTreeRecursivo(actual.getRight(), nivel + 1);

        for (int i = 0; i < nivel; i++) {
            System.out.print("    ");
        }

        System.out.println(actual.getValue());

        printTreeRecursivo(actual.getLeft(), nivel + 1);
    }
}