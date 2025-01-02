package NivelIntermediario.ClassesAbstratasInterface;

public abstract class Ninja {

    String nome;
    String aldeia;
    int idade;

    public abstract void nomeDoNinja();

    public void tacarKunai(){
        System.out.println( nome + "tacou uma kanai");
    }


}
