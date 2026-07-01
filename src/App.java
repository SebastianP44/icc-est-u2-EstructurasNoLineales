import java.util.LinkedHashSet;
import java.util.Set;

import collections.maps.Maps;
import collections.sets.Sets;
import models.Contacto;
import structures.graphs.Graph;
import trees.BinaryTree;
import trees.Ejercicio1;
import trees.Ejercicio2;
import trees.Ejercicio3;
import trees.Ejercicio4;
import trees.IntTree;

public class App {
    public static void main(String[] args) throws Exception {
        // runIntTree();
        System.out.println("\n--- arbol de Personas ---");
        // runPersonTree();

        // runSets();
        // runMaps();
        runGraph();
    }

    private static void runSets() {
        Sets sets = new Sets();
        // Primera implemetacion de Set
        System.out.println("Primera implemetacion de Set");
        Set<String> hashSet = sets.construirHashSet();
        System.out.println(hashSet);
        System.out.println("Tamaño del HashSet: " + hashSet.size());
        System.out.println("Contiene 'f': " + hashSet.contains("f"));
        // Segunda implemetacion de Set LinkedHashSet
        System.out.println("\nSegunda implemetacion de Set");
        Set<String> linkedHashSet = sets.construirLinekdHashSets();
        System.out.println(linkedHashSet);
        System.out.println("Tamaño del LinkedHashSet: " + linkedHashSet.size());
        System.out.println("Contiene 'A': " + linkedHashSet.contains("A"));
        // Tercera implemetacion de Set TreeSet
        System.out.println("\nTercera implemetacion de TreeSet");
        Set<String> treeSet = sets.construirTreeSets();
        System.out.println(treeSet);
        System.out.println("Tamaño del TreeSet: " + treeSet.size());
        System.out.println("Contiene 'A': " + treeSet.contains("A"));

        System.out.println("TreSet");
        Set<Contacto> treeSetConComparador = sets.construirTreesetConComparador();
        System.out.println(treeSetConComparador);
        System.out.println("Tamaño del TreeSet con comparador: " + treeSetConComparador.size());

        System.out.println("");
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

    private static void runMaps() {
        Maps maps = new Maps();
        maps.construirHashMap();
        maps.coLinkedHashMap();
        maps.construirTreeMap();
        maps.eliminarDuplicadosandSort(null);
    }

    private static void runGraph() {

        Graph<String> graph = new Graph<>();

        graph.addEdgeUni("A", "B");
        graph.addEdgeUni("B", "C");
        graph.addEdgeUni("B", "D");
        graph.addEdgeUni("C", "A");
        graph.addEdgeUni("C", "D");
        graph.addEdgeUni("D", "C");
        graph.addEdgeUni("D", "J");
        graph.addEdgeUni("J", "D");
        graph.printGraph();
    }

}