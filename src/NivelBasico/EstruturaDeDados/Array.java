package NivelBasico.EstruturaDeDados;

import java.util.Arrays;

// Falando dobre Garbage Collection

public class Array {
    public static void main(String[] args) {

        // Arrays são tipo referencia

        String[] ninja = new String[5];

        ninja[0] = "Naruto Uzumaki";
        ninja[1] = "Sasuke Uchiha";
        ninja[2] = "Sakura Haruno";
        ninja[3] = "Hinata Hyuga";
        ninja[4] = "Kakashi Hatake";

//        System.out.println(ninja[2]);

        // Sobreescreveu
        ninja = new String[7];

        ninja[0] = "hashirama Senju";
        ninja[1] = "Tobirama Senju";
        ninja[2] = "Hiruzen Sarutobi";
        ninja[3] = "Minato Namikaze";
        ninja[4] = "Tsunade";
        ninja[5] = "Kakashi Hatake";
        ninja[6] = "Naruto Uzumaki";




        for(int i = 0; i < 7; i++) {
            System.out.println(ninja[i]);
        }

    }
}
