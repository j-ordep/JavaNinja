package NivelIntermediario.RefatorandoCodigo.Ninjas;

import NivelIntermediario.RefatorandoCodigo.CategoriasEHabilidades.NivelNinja;
import NivelIntermediario.RefatorandoCodigo.Interfaces.AnbuInterface;
import NivelIntermediario.RefatorandoCodigo.Interfaces.EstrategiaDeBatalha;
import NivelIntermediario.RefatorandoCodigo.Interfaces.SharinganInterface;

public class Hatake extends Ninja implements SharinganInterface, AnbuInterface {

    public void boasVindas() {
        System.out.println(nome + " eu sou um Hatake");
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println(nome + " utilizou sua habilidade especial");
    }

    @Override
    public void sharinganAtivado() {
        System.out.println(nome + " ativou o sharingan");
    }

    @Override
    public void ninjaDeElite() {
        System.out.println(nome + " é um ninja de elite da Ambu");
    }



    public Hatake(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Hatake(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    public Hatake() {
        super();
    }

}
