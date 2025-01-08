package NivelIntermediario.TresPilares;

public class Main {
    public static void main(String[] args) {

        Uzumaki Naruto = new Uzumaki();

        Naruto.nome = "Naruto";
        Naruto.aldeia = "Aldeia da folha";
        Naruto.idade = 16;
        Naruto.habilidadeEspecial();
        Naruto.estrategiaDeBatalha();

        System.out.println("---------------------");

        System.out.println(Naruto.nome + " sou um bosta");

        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke";
        Sasuke.aldeia = "Aldeia da folha";
        Sasuke.idade = 17;
        Sasuke.habilidadeEspecial();
        Sasuke.sharinganAtivado();

        System.out.println("---------------------");


        // Consigo até criar um novo obj, mas não consigo usar um construtor específico da superclass (classe mãe), para isso preciso criar um construtor na subclass e utilizar "super()" dentro do construtor -> exemplo na class Uchiha

        Uchiha itachi = new Uchiha("Itachi","Aldeia da folha",13);
        itachi.habilidadeEspecial();




    }
}
