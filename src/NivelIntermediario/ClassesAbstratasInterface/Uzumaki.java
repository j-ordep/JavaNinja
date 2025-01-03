package NivelIntermediario.ClassesAbstratasInterface;

public class Uzumaki extends Ninja implements NinjaInterface {

    @Override
    public void tacarKunai(){
        System.out.println( nome + " tacou uma kanai");
    }

    @Override
    public void tacarUmaShuriken(){
        System.out.println(nome + " tacou uma shuriken");
    }


}
