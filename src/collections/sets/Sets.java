package collections.sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import models.Contacto;

public class Sets {
    public Set<String> construirHashSet(){
        Set<String> hashSet = new HashSet<>();
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");
        hashSet.add("A");
        hashSet.add("D");
        hashSet.add("E");
        hashSet.add("F");
        hashSet.add("1Ggggggeegeg");
        hashSet.add("2G2gggggeegeg");
        hashSet.add("3Gggggeegeg");
        hashSet.add("4Ggggggeegeg");
        hashSet.add("5Ggggggeegeg");
        hashSet.add("5Ggggggeegeg");
        hashSet.add("6Ggggggeegeg");
        hashSet.add("G7gggggeegeg");
        return hashSet;
    }

    public Set<String> construirLinekdHashSets(){
        Set<String> linkedHashSet = new LinkedHashSet<>(); 
        linkedHashSet.add("A");
        linkedHashSet.add("B");
        linkedHashSet.add("C");
        linkedHashSet.add("A");
        linkedHashSet.add("D");
        linkedHashSet.add("E");
        linkedHashSet.add("F");
        linkedHashSet.add("1Ggggggeegeg");
        linkedHashSet.add("2G2gggggeegeg");
        linkedHashSet.add("3Gggggeegeg");
        linkedHashSet.add("4Ggggggeegeg");
        linkedHashSet.add("5Ggggggeegeg");
        linkedHashSet.add("5Ggggggeegeg");
        linkedHashSet.add("6Ggggggeegeg");
        linkedHashSet.add("G7gggggeegeg");
        return linkedHashSet;
    }
    public Set<String> construirTreeSets(){
        Set<String> treeSets = new TreeSet<>(); 
        treeSets.add("A");
        treeSets.add("B");
        treeSets.add("C");
        treeSets.add("A");
        treeSets.add("D");
        treeSets.add("E");
        treeSets.add("F");
        treeSets.add("1Ggggggeegeg");
        treeSets.add("2G2gggggeegeg");
        treeSets.add("3Gggggeegeg");
        treeSets.add("4Ggggggeegeg");
        treeSets.add("5Ggggggeegeg");
        treeSets.add("5Ggggggeegeg");
        treeSets.add("6Ggggggeegeg");
        treeSets.add("G7gggggeegeg");
        return treeSets;
    }

    public Set<Contacto> construirTreesetConComparador() {
        Set<Contacto> treeSet = new TreeSet<>((c1,c2) -> c1.getNombre().compareTo(c2.getNombre()));
        treeSet.add(new Contacto("Juan", "Perez", "123456789"));
        treeSet.add(new Contacto("Ana", "Gomez", "987654321"));
        treeSet.add(new Contacto("Pedro", "Lopez", "456789123"));
        treeSet.add(new Contacto("Maria", "Rodriguez", "789123456"));
        treeSet.add(new Contacto("Juan", "Perez", "123456789")); // Duplicado, no se agregará
        treeSet.add(new Contacto("Juan", "Lopez", "123456789"));
        return treeSet;
    }

    public Set<Contacto> construirHashSetContacto(){
        Set<Contacto> hashSet = new HashSet<>();
        Contacto contacto1 = new Contacto("Juan", "Perez", "123456789");
        Contacto contacto2 = new Contacto("Ana", "Gomez", "987654321");
        Contacto contacto3 = new Contacto("Pedro", "Lopez", "456789     123");
        Contacto contacto4 = new Contacto("Maria", "Rodriguez", "789123456");
        Contacto contacto5 = new Contacto("Juan", "Perez", "123456789"); // Duplicado, no se agregará
        Contacto contacto6 = new Contacto("Juan", "Lopez", "123456789");
        hashSet.add(contacto1);     
        hashSet.add(contacto2);
        hashSet.add(contacto3);
        hashSet.add(contacto4);
        hashSet.add(contacto5);
        hashSet.add(contacto6);
        return hashSet;
    }




}
