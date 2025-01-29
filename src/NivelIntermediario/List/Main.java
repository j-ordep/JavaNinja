package NivelIntermediario.List;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Array
        String[] ninjasArray = new String[3];
        ninjasArray[0] = "Naruto do Array";
        ninjasArray[1] = "Sasuke do Array";
        ninjasArray[2] = "Sakura do Array";

        for (int i = 0; i < ninjasArray.length; i++) {
            System.out.println("Array: " + ninjasArray[i]);
        }

        System.out.println("-----------------------");



        // List
        List<String> ninjasList = new ArrayList<>();

        // Adicionar - add
        ninjasList.add("Naruto");
        ninjasList.add("Sasuke");
        ninjasList.add("Sakura");

        System.out.println("-----------------------");

        // Altera um valor
        ninjasList.set(2, "Juliana");

        System.out.println("-----------------------");

        //
        ninjasList.remove("Sasuke");


    }
}
