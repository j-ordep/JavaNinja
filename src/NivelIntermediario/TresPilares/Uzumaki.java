package NivelIntermediario.TresPilares;

public class Uzumaki extends Ninja {

    @Override
    public void habilidadeEspecial() {
        System.out.println(nome + " usou sua habilidade especial dos Uzumaki");
    }

    public Uzumaki() {
    }

    public Uzumaki(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }
}
