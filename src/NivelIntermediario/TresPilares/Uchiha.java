package NivelIntermediario.TresPilares;

public class Uchiha extends Ninja {

    @Override
    public void habilidadeEspecial() {
        System.out.println(nome + " usou a habilidade especial dos Uchiha");
    }

    public void sharinganAtivado() {
        System.out.println("ativou sharingan");
    }


    // "super()" diz que esse constructor vem da superclass, extends Ninja

    public Uchiha() {
        super();
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }
}
