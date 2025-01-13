package NivelIntermediario.HerancaMultipla;

public class Hatake extends Ninja implements SharinganInterface, AmbuInterface, EstrategiaDeBatalha {

    public Hatake(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Hatake() {
        super();
    }

    public void boasVindas () {
        System.out.println(nome + " eu sou um Hatake");
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println(nome + " utilizou sua habilidade especial");
    }

    @Override
    public void sharinganAtivado() {
        System.out.println(nome + " ativou o sharingan");
    }

    @Override
    public void ninjaDeElite() {
        System.out.println(nome + " é um ninja de elite da Ambu");
    }



}
