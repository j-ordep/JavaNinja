package NivelIntermediario.HerancaMultiplaEtc;

public class Uchiha extends Ninja implements SharinganInterface {

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uchiha(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    public Uchiha() {
        super();
    }

    @Override // O Override evita erros de sintaxe ao sobrescrever um método, pq se o nome do metodo com o @Override estiver diferente do metodo original da erro.
    public void habilidadeEspecial() {
        System.out.println(nome + " utilizou sua habilidade especial, e já tem: " + numeroDeMissoesConcluidas + " missões concluidas");
    }

    @Override
    public void sharinganAtivado() {
        System.out.println(nome + " ativou o sharingan");
    }

    @Override
    public void inteligenciaDeCombate() {
        System.out.println(nome + " usou a INTELIGENCIA de batalha");
    }

    @Override
    public void inteligenciaDeCombate(int qi) {

        if (qi > 150) {
            System.out.println("Seu QI é " + qi + ", você é um genio");
        } else if (qi >= 130) {
            System.out.println("Seu QI é " + qi + ", um ninja promissor");
        } else {
            System.out.println("Você é meio burro e precisa treinar");
        }

    }



}
