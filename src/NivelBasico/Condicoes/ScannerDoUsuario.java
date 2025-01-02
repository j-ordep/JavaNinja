package NivelBasico.Condicoes;

import java.util.Scanner;

public class ScannerDoUsuario {
    public static void main(String[] args) {

        Scanner caixaDeTexto = new Scanner(System.in);

        // Recebe o nome do Ninja
        System.out.println("Escreva aqui o nome do ninja: ");
        String nomeDoNinja = caixaDeTexto.nextLine();
        System.out.println("O nome do ninja é: " + nomeDoNinja);


        // Recebe a idade do Ninja
        System.out.println("Escreva aqui a idade do ninja: ");
        int idade = caixaDeTexto.nextInt();
        System.out.println("A idade de " + nomeDoNinja + " é: " + idade + " anos");

        if (idade >= 18){
            System.out.println("O ninja já é maior de idade");
        } else {
            System.out.println("O ninja ainda é muito novo");
        }


        caixaDeTexto.close();

    }
}
