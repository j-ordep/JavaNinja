package NivelIntermediario.HerancaMultipla;

public abstract class Ninja {

    // ToDo: Incluir 2 novos atributos: NumeroDeMissoesConcluidas, Rank
    // ToDo: Rank: Genin, Chuunin, Jounin, Kage

    String nome;
    String aldeia;
    int idade;
    int numeroDeMissoes;
    NivelNinja rank;

    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    public Ninja() {
    }
}
