package NivelIntermediario.Generics.NoGeneric;

public class Main {
    public static void main(String[] args) {

        Kunai kunai1 = new Kunai("Kunai normal");
        Kunai kunai2 = new Kunai("Kunai explosiva");
        Kunai kunai3 = new Kunai("Kunai de água");

        BolsaKunai bolsaKunai = new BolsaKunai();
        bolsaKunai.adicionarKunai(kunai1);
        bolsaKunai.adicionarKunai(kunai2);
        bolsaKunai.adicionarKunai(kunai3);

        System.out.println(bolsaKunai);


    }
}
