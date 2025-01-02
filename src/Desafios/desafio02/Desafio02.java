package Desafios.desafio02;

import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int maxNinja = 10;

        String[] ninja = new String[maxNinja];

        // Contadores
        int ninjasCadastrados = 0;
        int opcao = 0;

        while (opcao!= 4){

            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Deletar Ninja");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            String entrada = scanner.nextLine();

            switch (opcao){
                case 1:
                    if(ninjasCadastrados < maxNinja){
                        System.out.println("Digite o Ninja que você quer inserir: ");
                        String novoNinja = scanner.nextLine();
                        ninja [ninjasCadastrados] = novoNinja;
                        ninjasCadastrados++;
                        System.out.println("Ninja " + novoNinja + " adicionado com sucesso");

                    } else {

                        System.out.println("Número máximo de ninjas atingido");
                    }
                    break;
                case 2:
                    if (ninjasCadastrados == 0){
                        System.out.println("A lista esta vazia");
                    } else {
                        System.out.println("Quantidade de ninjas cadastrados: " + ninjasCadastrados);
                        for (int i = 0; i < maxNinja; i++) { // posso usar o "ninjasCadastrados como comparador do i
                            System.out.println(i + " - " + ninja[i]);
                        }
                    }
                    break;

                case 3:
                    if (ninjasCadastrados == 0) {
                        System.out.println("A lista esta vazia");
                    } else {
                        String removido = ninja[ninjasCadastrados - 1];
                        ninja[ninjasCadastrados - 1] = null;
                        ninjasCadastrados--;
                        System.out.println("Ninja " + removido + " foi removido.");
                    }
                    break;

                case 4:
                    System.out.println("Você saiu do programa!");
                    break;
                default:
                    System.out.println("Essa opção não é válida.");
                    break;

            }


        }
    }
}
