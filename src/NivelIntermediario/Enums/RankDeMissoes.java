package NivelIntermediario.Enums;

public enum RankDeMissoes {

    D("Muito fácil", 0),
    C("Fácil", 2),
    B("Médio", 5),
    A("Difícil", 8),
    S("Muito difícil", 10);

    private String descricao;
    private int dificuldade;

    RankDeMissoes(String descricao, int dificuldade) {
        this.descricao = descricao;
        this.dificuldade = dificuldade;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getDificuldade() {
        return dificuldade;
    }



}
