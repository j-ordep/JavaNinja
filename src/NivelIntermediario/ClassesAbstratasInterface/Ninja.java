package NivelIntermediario.ClassesAbstratasInterface;

public abstract class Ninja {

    String nome;
    String aldeia;
    int idade;

    public void nomeDoNinja(){
        System.out.println("meu nome é " + nome);
    }

    public abstract void tacarKunai();

    
}
