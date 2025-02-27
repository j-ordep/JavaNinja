package Desafios.desafio06;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // TODO Menu interativo
        // TODO implemente uma função que permita ordenar a lista de ninjas por diferentes critérios: idade, nome ou vila.
        //https://github.com/NicolasCoiado/linked-ninjas/blob/main/src/Interface.java


        // Criando LinkedList
        LinkedList<Ninja> ninjasLinkedList = new LinkedList<>();

        // Criando e adicionando Ninjas na LinkedList
        ninjasLinkedList.add(new Ninja("Naruto", 17, "Konoha"));
        ninjasLinkedList.add(new Ninja("Sasuke", 17, "Konoha"));
        ninjasLinkedList.add(new Ninja("Sakura", 17, "Konoha"));
        ninjasLinkedList.add(new Ninja("Hinata", 17, "Konoha"));
        ninjasLinkedList.add(new Ninja("Kakashi", 20, "Konoha"));
        ninjasLinkedList.add(new Ninja("Shikamura", 30, "Konoha"));
        ninjasLinkedList.add(new Ninja("Neji", 50, "Konoha"));

        System.out.println("----------Lista de Ninja----------");

        // complexidade O(n) - complexidade de acordo com o tamanho (n) da lista
        for (Ninja ninja : ninjasLinkedList) {
            System.out.println(ninja);
        }

        System.out.println("");
        System.out.println("----------Adicionado no inicio----------");


        // Adicionar Ninja no inicio da lista
        ninjasLinkedList.addFirst(new Ninja("Boruto Uzumaki", 9, "Konoha"));

        for (Ninja ninjaAdicionado : ninjasLinkedList) {
            System.out.println(ninjaAdicionado);
        }

        System.out.println("");
        System.out.println("----------Removido do inicio----------");


        // Remover elemento no inicio da lista
        Ninja ninjaRemovido = ninjasLinkedList.removeFirst();
        System.out.println("Ninja removido do inicio: " + ninjaRemovido);

        System.out.println("");
        System.out.println("----------Lista final de Ninja----------");

        // Listar lista de ninjas
        for (Ninja listaDeNinjaAtualizada : ninjasLinkedList) {
            System.out.println("lista de Ninja atualizada: " + listaDeNinjaAtualizada);
        }

        System.out.println("----------Busca por index----------");

        // Procurar ninja por indice
        Ninja buscarNinja = ninjasLinkedList.get(3);
        System.out.println("Ninja do Index 3: " + buscarNinja);



    }
}
