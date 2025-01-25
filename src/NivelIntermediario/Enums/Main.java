package NivelIntermediario.Enums;

public class Main {
    public static void main(String[] args) {

        Missoes missao1 = new Missoes("Matar Cleitin", RankDeMissoes.D);

        missao1.exibirDetalhes();

        System.out.println("----------Descrição dos Ranks----------");

        missao1.todoEnum();

    }
}
