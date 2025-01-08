package NivelIntermediario.HerancaMultipla;

public class Uchiha extends Ninja implements SharinganInterface {

    @Override
    public void sharinganAtivado() {
        System.out.println(nome + " ativou o sharingan");
    }


    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uchiha() {
        super();
    }

}
