package NivelIntermediario.EstruturaDeDados;

import java.util.*;

public class ArrayListLinkedList {
    public static void main(String[] args) {

        // Array
        String[] ninjasArray = new String[5];
        ninjasArray[0] = "Naruto";
        ninjasArray[1] = "Sasuke";
        ninjasArray[2] = "Sakura";
        ninjasArray[3] = "Hinata";
        ninjasArray[4] = "Kakashi";

        System.out.println("Meu Array: " + Arrays.toString(ninjasArray));

        ninjasArray[4] = "Shikamura";

        System.out.println("Meu Array com alteração: " + Arrays.toString(ninjasArray));

        System.out.println("----------------------------------");


        // ArrayList

        List<String> ninjaList = new ArrayList<>();
        ninjaList.add("Naruto");
        ninjaList.add("Sasuke");
        ninjaList.add("Sakura");
        ninjaList.add("Hinata");
        ninjaList.add("Kakashi");

        System.out.println("Minha List inicial: " + ninjaList);

        // Adicionando em uma posição específica, sem remover, e sim empurrando os outros elementos para frente
        ninjaList.add(1, "Shikamura"); // é custoso em termos de performance por causa da memoria, se for um array grande, custa realocar todos os elementos e os index
        System.out.println("Minha List alterada: " + ninjaList);

        ninjaList.set(1, "Juliana");
        System.out.println("Minha List com set: " + ninjaList);

        System.out.println("----------------------------------");



        // LinkedList

        LinkedList<String> ninjasLinkedList = new LinkedList<>();
        ninjasLinkedList.add("Naruto");
        ninjasLinkedList.add("Sasuke");
        ninjasLinkedList.add("Sakura");
        ninjasLinkedList.add("Hinata");
        System.out.println("Minha LinkedList: " + ninjasLinkedList);

        ninjasLinkedList.add(1, "Shikamura");
        System.out.println("Minha LinkedList com add: " + ninjasLinkedList);

        ninjasLinkedList.remove(1);
        System.out.println("Minha LinkedList com remove: " + ninjasLinkedList);

        ninjasLinkedList.addFirst("Kakashi");
        System.out.println("Minha LinkedList com addFirst: " + ninjasLinkedList);


    }
}
