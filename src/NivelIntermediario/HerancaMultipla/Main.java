package NivelIntermediario.HerancaMultipla;

public class Main {
    public static void main(String[] args) {

        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.aldeia = "Aldeia da Folha";
        Naruto.idade = 16;
        Naruto.BoasVindas();



        System.out.println("---------------------");


        Uchiha Saskue = new Uchiha("Sasuke Uchiha", "Aldeia da Folha", 17);
        Saskue.sharinganAtivado();


        System.out.println("---------------------");


        Hatake Kakashi = new Hatake(
                "Kakashi Hatake",
                "Aldeia da Folha",
                17
        );
        Kakashi.boasVindas();
        Kakashi.sharinganAtivado();
        Kakashi.ninjaDeElite();


























    }
}
