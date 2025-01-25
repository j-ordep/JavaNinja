package NivelIntermediario.RefatorandoCodigo.Ninjas;

import NivelIntermediario.RefatorandoCodigo.Interfaces.EstrategiaDeBatalha;
import NivelIntermediario.RefatorandoCodigo.CategoriasEHabilidades.NivelNinja;

abstract public class Ninja implements EstrategiaDeBatalha {

    String nome;
    String aldeia;
    int idade;
    int numeroDeMissoesConcluidas;
    NivelNinja rank;

    public abstract void habilidadeEspecial();

    @Override
    public void estrategiaDeBatalha() {
        System.out.println(nome + " usou a ESTRATEGIA de batalha");
    }

    public void inteligenciaDeCombate() {
        System.out.println(nome + " usou a INTELIGENCIA de batalha");
    }

    public void inteligenciaDeCombate(int qi) {

        if (qi > 150) {
            System.out.println("Seu QI é " + qi + ", você é um genio");
        } else if (qi >= 130) {
            System.out.println("Seu QI é " + qi + ", um ninja promissor");
        } else {
            System.out.println("Você é meio burro e precisa treinar");
        }

    }

    @Override
    public String toString() {
        return "Esse é o toString()\nMeu nome é: " + nome + " minha aldeia é: " + aldeia + " minha idade é " + idade;
    }

    final void tacarKunai() {
        System.out.println("Esse é um método final da classe MÃE");
    }

    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        this(nome, aldeia, idade);
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.rank = rank;
    }

    public Ninja() {
    }
}