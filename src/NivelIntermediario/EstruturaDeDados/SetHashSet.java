package NivelIntermediario.EstruturaDeDados;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetHashSet {
    public static void main(String[] args) {

        // List
        List<String> ninjaList = new ArrayList<>();
        ninjaList.add("Naruto Uzumaki");
        ninjaList.add("Sasuke Uchiha");
        ninjaList.add("Sakura Haruno");
        ninjaList.add("Naruto Uzumaki");

        System.out.println("List ninja: " + ninjaList);

        // Set
        Set<String> ninjaSet = new HashSet<>();
        ninjaSet.add("Naruto Uzumaki");
        ninjaSet.add("Sasuke Uchiha");
        ninjaSet.add("Sakura Haruno");
        ninjaSet.add("Naruto Uzumaki");

        System.out.println("Set ninja: " + ninjaSet);

        // Set não permite repetições, ele descarta as duplicatas

        // Passando a List direto para Set
        Set<String> setListNinja = new HashSet<>();
        setListNinja.addAll(ninjaList);

        // Diferente do remove() do List, que remove pelo index, o Set remove pelo Objeto
        setListNinja.remove("Sakura Haruno");

        System.out.println(setListNinja);


    }
}
