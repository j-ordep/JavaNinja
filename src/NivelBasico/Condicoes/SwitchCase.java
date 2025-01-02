package NivelBasico.Condicoes;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um Ninja: ");
        System.out.println("1 - Naruto Uzumaki");
        System.out.println("2 - Sasuke Uchiha");
        System.out.println("3 - Sakura Haruno");

        int escolhaDoUsuario = scanner.nextInt();

        String ninjaEscolhido;
        switch (escolhaDoUsuario){
            case 1:
                ninjaEscolhido = "Naruto Uzumaki";
                System.out.println("Você escolheu o ninja: " + ninjaEscolhido);
                break;
            case 2:
                ninjaEscolhido = "Sasuke Uchiha";
                System.out.println("Você escolheu o ninja : " + ninjaEscolhido);
                break;
            case 3:
                ninjaEscolhido = "Sakura haruno";
                System.out.println("Você escolheu o ninja: " + ninjaEscolhido);
            default:
                System.out.println("Ninja desconhecido");
        }



    }
}
