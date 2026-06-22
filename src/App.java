import trees.BinaryTree;
import trees.IntTree;
import trees.Person;

public class App {
    public static void main(String[] args) throws Exception {
        runIntTree();
        System.out.println("\n--- Árbol de Personas ---");
        runPersonTree();
    }

    private static void runIntTree() {
        IntTree arbolNumbers = new IntTree();

        arbolNumbers.insert(10);
        arbolNumbers.insert(5);
        arbolNumbers.insert(3);
        arbolNumbers.insert(8); 
        arbolNumbers.insert(20); 
        arbolNumbers.insert(15); 

        System.out.println("pre Order");
        arbolNumbers.preOrder();
        System.out.println("\nPos Order");
        arbolNumbers.posOrder();
        System.out.println("\nIn Order");
        arbolNumbers.inOrder();
        System.out.println("\nPor Niveles");
        arbolNumbers.imprimirPorNiveles();
        System.out.println("Altura del árbol: " + arbolNumbers.getAltura());
    }

    private static void runPersonTree(){
        BinaryTree<Person> personTree = new BinaryTree<>();
        personTree.insert(new Person("Alice", "30"));
        personTree.insert(new Person("Bob", "25"));
        personTree.insert(new Person("Diego", "35"));
        personTree.insert(new Person("Rafael", "35"));
    }
}