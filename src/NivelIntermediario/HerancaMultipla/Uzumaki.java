package NivelIntermediario.HerancaMultipla;

public class Uzumaki extends Ninja {

    public void BoasVindas() {
        System.out.println("Olá meu nome é " + nome);
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println(nome + " utilizou sua habilidade especial");
    }


}
