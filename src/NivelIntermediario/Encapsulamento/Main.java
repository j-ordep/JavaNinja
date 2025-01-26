package NivelIntermediario.Encapsulamento;

public class Main {
    public static void main(String[] args) {

        Uzumaki Naruto = new Uzumaki("Naruto Uzumaki", "Aldeia da Folha", 17, 3, 1.70);
        System.out.println("Meu nome é " + Naruto.getName());

        // alterar nome
        Naruto.setName("Naruto lerdão");
        System.out.println("Meu nome foi alterado, agora eu sou o " + Naruto.getName());

    }
}
