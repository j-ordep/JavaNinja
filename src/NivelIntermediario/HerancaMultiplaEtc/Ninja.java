package NivelIntermediario.HerancaMultiplaEtc;

public abstract class Ninja implements EstrategiaDeBatalha {

    // ToDo: Incluir 2 novos atributos: NumeroDeMissoesConcluidas, Rank
    // ToDo: Rank: Genin, Chuunin, Jounin, Kage

    String nome;
    String aldeia;
    int idade;
    int numeroDeMissoesConcluidas;
    NivelNinja rank;
   double altura = 2.10;
   // final = constante


    // Deixa essa bosta aqui e constroi uma nova que se referencia a essa para não quebrar a aplicação
    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    public Ninja() {
    }


    // Sobrecarga de construtor - cria um novo constructor que se referencia ao constructor anterior
    // Na sobrecarga de de metodos você não precisa redeclarar o constructor, só os novos atributos

    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        this(nome, aldeia, idade);
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.rank = rank;
    }

    // Método abstrato que todos os ninjas tem
    public abstract void habilidadeEspecial();

    @Override
    public void estrategiaDeBatalha() {
        System.out.println(nome + " usou a ESTRATEGIA de batalha");
    }

    // Inteligencia de combate - metodo padrão
    public void inteligenciaDeCombate() {
        System.out.println(nome + " usou a INTELIGENCIA de batalha");
    }

    // Inteligencia de combate - sobrecarga de metodo ( Overload )
    public void inteligenciaDeCombate(int qi) {

        if (qi > 150) {
            System.out.println("Seu QI é " + qi + ", você é um genio");
        } else if (qi >= 130) {
            System.out.println("Seu QI é " + qi + ", um ninja promissor");
        } else {
            System.out.println("Você é meio burro e precisa treinar");
        }

    }

    // toda String já tem o metodo toString(), por isso se utiliza o Override, para modificar o método dentro da minha classe
    @Override
    public String toString() {
        return "Esse é o toString()\nMeu nome é: " + nome + " minha aldeia é: " + aldeia + " minha idade é " + idade;
    }

    final void tacarKunai() { // final não pode ser sobreecrito
        System.out.println("Esse é um método final da classe MÃE");
    }

}
