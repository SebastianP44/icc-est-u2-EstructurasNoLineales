import trees.BinaryTree;
import trees.Ejercicio1;
import trees.Ejercicio2;
import trees.Ejercicio3;
import trees.Ejercicio4;
import trees.IntTree;
import trees.Person;

public class App {
    public static void main(String[] args) throws Exception {
        runIntTree();
        System.out.println("\n--- arbol de Personas ---");
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
        System.out.println("\n--- EJERCICIO 1: IMPRIMIR ARBOL ---");
        Ejercicio1 ejercicio = new Ejercicio1();
        ejercicio.printTree(arbolNumbers.getRoot());
        Ejercicio2 ejercicio2 = new Ejercicio2();
        System.out.println("\n--- EJERCICIO 2: INVERTIR ARBOL ---");
        ejercicio2.invert(arbolNumbers.getRoot());
        ejercicio.printTree(arbolNumbers.getRoot());
        Ejercicio3 ejercicio3 = new Ejercicio3();
        System.out.println("\n--- EJERCICIO 3: LISTA DE NIVELES---");
        System.out.println(ejercicio3.listLevels(arbolNumbers.getRoot()));
        Ejercicio4 ejercicio4 = new Ejercicio4();
        System.out.println("\n--- EJERCICIO 4: ALTURA DEL ARBOL ---"); 

        System.out.println(ejercicio4.maxDepth(arbolNumbers.getRoot()));
            }
    

    private static void runPersonTree(){
        BinaryTree<Person> personTree = new BinaryTree<>();
        personTree.insert(new Person("Alice", "30"));
        personTree.insert(new Person("Bob", "25"));
        personTree.insert(new Person("Diego", "35"));
        personTree.insert(new Person("Rafael", "35"));
        
    }
    
    
}