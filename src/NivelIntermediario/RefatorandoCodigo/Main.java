package NivelIntermediario.RefatorandoCodigo;

import NivelIntermediario.RefatorandoCodigo.CategoriasEHabilidades.Biju;
import NivelIntermediario.RefatorandoCodigo.CategoriasEHabilidades.NivelNinja;
import NivelIntermediario.RefatorandoCodigo.Ninjas.Hatake;
import NivelIntermediario.RefatorandoCodigo.Ninjas.Uchiha;
import NivelIntermediario.RefatorandoCodigo.Ninjas.Uzumaki;

public class Main {
    public static void main(String[] args) {

        System.out.println("----------Naruto----------");

        Uzumaki Naruto = new Uzumaki("Naruto uzumaki", "Aldeia da Folha", 17, 3, NivelNinja.KAGE, Biju.KURAMA);

        Naruto.BoasVindas();
        Naruto.habilidadeEspecial();
        Naruto.estrategiaDeBatalha();
        Naruto.inteligenciaDeCombate();



        System.out.println("----------Sasuke----------");

        Uchiha Sasuke = new Uchiha("Sasuke Uchiha", "Aldeia da Folha", 17, 3, NivelNinja.KAGE);

        Sasuke.sharinganAtivado();
        Sasuke.habilidadeEspecial();
        Sasuke.estrategiaDeBatalha();
        Sasuke.inteligenciaDeCombate();


        System.out.println("----------Itachi----------");

        Uchiha Itachi = new Uchiha("Itache Uchiha", "Aldeia da Folha", 14, 1, NivelNinja.KAGE);
        Itachi.sharinganAtivado();
        Itachi.habilidadeEspecial();
        Itachi.estrategiaDeBatalha();
        Itachi.inteligenciaDeCombate();

        System.out.println("----------Kakashi----------");

        Hatake Kakashi = new Hatake("Itache Uchiha", "Aldeia da Folha", 14, 1, NivelNinja.KAGE);

        Kakashi.boasVindas();
        Kakashi.sharinganAtivado();
        Kakashi.habilidadeEspecial();
        Kakashi.estrategiaDeBatalha();
        Kakashi.inteligenciaDeCombate();
        Kakashi.ninjaDeElite();


        System.out.println("---------------------------");

        // Método para mostrar todos Bijus
        Naruto.mostrarValoresBiju();

    }
}
