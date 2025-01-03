package NivelIntermediario.ClassesAbstratasInterface;

public class Main {
    public static void main(String[] args) {

        Uzumaki Naruto = new Uzumaki();

        Naruto.nome = "Naruto";
        Naruto.nomeDoNinja();
        Naruto.tacarKunai();
        Naruto.tacarUmaShuriken();

        System.out.println("----------------------------");

        Uchiha Sasuke = new Uchiha();

        Sasuke.nome = "Sasuke";
        Sasuke.nomeDoNinja();
        Sasuke.tacarKunai();

    }
}
