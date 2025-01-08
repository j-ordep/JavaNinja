package NivelIntermediario.TresPilares;

public class Hatake extends Ninja{



    public void BoasVindas() {
        System.out.println(nome + " eu sou um Hatake");
    }





    @Override
    public void habilidadeEspecial() {
        System.out.println(nome + " usou a habilidade especial dos Hatake");
    }

    public Hatake() {
        super();
    }

    public Hatake(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }
}
