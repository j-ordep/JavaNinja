package NivelIntermediario.Enums;

public class Missoes {

    private String nomeDaMissao;

    private RankDeMissoes rank;


    // Método para mostrar informações
    public void exibirDetalhes () {
        System.out.println("Missão: " + nomeDaMissao + ", Rank: " + rank + " (descrição: " + rank.getDescricao() + ", dificuldade: " + rank.getDificuldade() + ")");
    }

    public void todoEnum() {
        for (RankDeMissoes ranks : RankDeMissoes.values()) {
            System.out.println("Ranks: " + ranks + " (descrição: " + ranks.getDescricao() + ", dificuldade: " + ranks.getDificuldade() + ")");
        }
    }




    public Missoes() {
    }

    public Missoes(String name, RankDeMissoes rank) {
        this.nomeDaMissao = name;
        this.rank = rank;
    }

    public String getName() {
        return nomeDaMissao;
    }

    public void setName(String name) {
        this.nomeDaMissao = name;
    }

    public RankDeMissoes getRank() {
        return rank;
    }

    public void setRank(RankDeMissoes rank) {
        this.rank = rank;
    }
}
