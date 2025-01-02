package NivelBasico.Condicoes;

public class IfElse {
    public static void main(String[] args) {

        String name = "Naruto Uzumaki";
        String rank;

        int age = 10;
        boolean hokage = false;
        short missionNumber = 20;

        if (missionNumber == 10 && age > 15) {
            System.out.println("Rank Chunnin");
        } else if (missionNumber >= 20) {
            System.out.println("Rank Jounnin");
        } else {
            System.out.println("Rank Genin");
        }

    }
}
