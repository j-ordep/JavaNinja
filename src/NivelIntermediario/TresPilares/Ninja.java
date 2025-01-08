package NivelIntermediario.TresPilares;

public abstract class Ninja implements EstrategiaDeBatalha {

    String nome;
    String aldeia;
    int idade;

    public abstract void habilidadeEspecial();

    @Override
    public void estrategiaDeBatalha() {
        System.out.println("estrategia do " + nome + " é sair matando");
    }

    public Ninja() {
    }

    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }



}
