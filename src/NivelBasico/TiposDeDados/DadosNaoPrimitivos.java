package NivelBasico.TiposDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {

            /*
            * Dados não primitivos: String, Array,, Class, Enum.
            */

        String name = "Naruto Uzumaki";
        String nameToUpperCase = name.toUpperCase();

        System.out.println("nome: " + name);
        System.out.println("Texto em CAPSLOCK: " + nameToUpperCase);


        String aldeia = "Aldeia da Folha";
        String aldeiraToLowerCase = aldeia.toLowerCase();

        System.out.println("Texto em caixa baixa: " + aldeiraToLowerCase);

    }
}
