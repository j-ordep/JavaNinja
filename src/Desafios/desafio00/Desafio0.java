package Desafios.desafio00;

public class Desafio0 {
    public static void main(String[] args) {

        String nomeNinja1 = "Naruto Uzumaki";
        int idade1 = 16;
        String missao1 = "Encontrar o bandido";
        String statusDaMissao1 = "Em andamento";
        char nivelDaMissao1 = 'A';

        if (idade1 < 15) {
            if (nivelDaMissao1 == 'C' || nivelDaMissao1 == 'D') {
                statusDaMissao1 = "Concluida";
            } else {
                statusDaMissao1 = "Não concluida";
            }
        } else {
            statusDaMissao1 = "Concluida";
        }

        System.out.println("Nome: " + nomeNinja1);
        System.out.println("Idade: " + idade1);
        System.out.println("Missao: " + missao1);
        System.out.println("Nivel da missão: " + nivelDaMissao1);
        System.out.println("Status: " + statusDaMissao1);


    }
}