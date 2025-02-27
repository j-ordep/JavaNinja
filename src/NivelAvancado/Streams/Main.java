package NivelAvancado.Streams;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Ninja> ninjas = new ArrayList<>();
        ninjas.add(new Ninja("Naruto Uzumaki", "Konoha", 15));
        ninjas.add(new Ninja("Sasuke Uchiha", "Konoha", 17));
        ninjas.add(new Ninja("Sakura Haruno", "Konoha", 14));
        ninjas.add(new Ninja("Kakashi Hatake", "Konoha", 30));
        ninjas.add(new Ninja("Gaara", "Suna", 18));
        ninjas.add(new Ninja("Temari", "Suna", 19));
        ninjas.add(new Ninja("Rock Lee", "Konoha", 17));

        System.out.println("----------Filtrando por vila----------");

        // filter - Filtrando a Lista
        ninjas.stream()
                .filter(ninja -> ninja.getVila().equals("Konoha"))
                .forEach(System.out::println)
        ;

        System.out.println("");
        System.out.println("----------ordenando por idade----------");


        // sorted - Ordenando a lista
        ninjas.stream()
                .sorted((n1, n2) -> Integer.compare(n1.getIdade(), n2.getIdade()))
                .forEach(System.out::println);


        System.out.println("");
        System.out.println("----------ordenando por nome----------");


        ninjas.stream()
                .sorted((n1, n2) -> n1.getNome().compareTo(n2.getNome()))
                .forEach(System.out::println);


        System.out.println("");
        System.out.println("----------mapeando por nome----------");

        // map - mostrar e mapear um atributo
        ninjas.stream()
                .map(Ninja::getNome)
                .forEach(System.out::println);


        System.out.println("");
        System.out.println("----------mapeando por idade----------");

        ninjas.stream()
                .map(Ninja::getIdade)
                .forEach(System.out::println);

    }
}
