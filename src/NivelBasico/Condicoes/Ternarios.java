package NivelBasico.Condicoes;

public class Ternarios {
    public static void main(String[] args) {

/*                                     if              else
//      variavel = (condição) ? valorSeVerdadeiro : valorSeFalso
*/

        short numeroDeMissoes = 10;
        String nivelDoNinja = (numeroDeMissoes >= 10) ? "Esse ninja tem mais de 10 missões" : "Esse ninja tem menos de 10 missões";

        System.out.println(nivelDoNinja);

    }
}
