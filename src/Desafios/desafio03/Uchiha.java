package Desafios.desafio03;

public class Uchiha extends Ninja {

    String habilidadeEspecial = "Sharingan";

    public void MostrarHabilidadeEspecial() {
        System.out.println(nome + " ativou sua habilidade especial, o " + habilidadeEspecial);
    }

    @Override
    public void exibirInformacoes(){
        System.out.println("nome: " + nome);
        System.out.println("idade: " + idade);
        System.out.println("Habilidade especial: " + habilidadeEspecial);
        System.out.println("missão: " + missao);
        System.out.println("nivel da missão: " + nivelDificuldade);
        System.out.println("status da missão: " + statusDaMissao);
    }

}
