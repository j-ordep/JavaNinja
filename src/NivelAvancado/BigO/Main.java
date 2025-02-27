package NivelAvancado.BigO;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        long inicio;
        long fim;
        long tempo;

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 9000000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }


        inicio = System.nanoTime();

        // Verifica o numero do index do array
        arrayList.add(250);

        fim = System.nanoTime();
        tempo = fim - inicio;
        System.out.println("Tempo Array List " + tempo + " ns");


        System.out.println("-------------------------------------");


        inicio = System.nanoTime();

        linkedList.add(250);

        fim = System.nanoTime();

        tempo = fim - inicio;

        System.out.println("Tempo Linked List " + tempo + " ns");

    }
}
