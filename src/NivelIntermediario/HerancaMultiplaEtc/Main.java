package NivelIntermediario.HerancaMultiplaEtc;


public class Main {
    public static void main(String[] args) {

        Uzumaki Naruto = new Uzumaki();

        // brincando com toString()
        System.out.println(Naruto);

        System.out.println("---------------------");

        Naruto.tacarKunai();

        System.out.println("---------------------");

        Naruto.nome = "Naruto Uzumaki";
        Naruto.aldeia = "Aldeia da Folha";
        Naruto.idade = 16;
        Naruto.BoasVindas();
        Naruto.inteligenciaDeCombate();


        System.out.println("---------------------");


        // Obj Uchiha 1
        Uchiha Saskue = new Uchiha("Sasuke Uchiha", "Aldeia da Folha", 17,50, NivelNinja.GENIN);
        Saskue.habilidadeEspecial();
        Saskue.sharinganAtivado();

        // Obj Uchiha 2
        Uchiha Itachi = new Uchiha("Itachi Uchiha", "Aldeia da Folha", 14);
        Itachi.habilidadeEspecial();
        Itachi.inteligenciaDeCombate(110);


        // Obj Uchiha 3 - sobrecarga de contrutores
        Uchiha Madara = new Uchiha("Madara", "Aldeia da Folha", 48, 900, NivelNinja.KAGE);
        Madara.habilidadeEspecial();
        Madara.estrategiaDeBatalha();
        Madara.inteligenciaDeCombate(180);

        System.out.println("---------------------");


        // Obj Hatake - herança Múltipla
        Hatake Kakashi = new Hatake("Kakashi Hatake","Aldeia da Folha",17);
        Kakashi.boasVindas();
        Kakashi.habilidadeEspecial();
        Kakashi.sharinganAtivado();
        Kakashi.ninjaDeElite();
        Kakashi.inteligenciaDeCombate(148);





    }
}
