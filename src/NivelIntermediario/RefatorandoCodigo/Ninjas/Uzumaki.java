package NivelIntermediario.RefatorandoCodigo.Ninjas;

import NivelIntermediario.RefatorandoCodigo.CategoriasEHabilidades.Biju;
import NivelIntermediario.RefatorandoCodigo.CategoriasEHabilidades.NivelNinja;

public class Uzumaki extends Ninja {

    Biju eNumBiju;

    public void mostrarValoresBiju() {
        for (Biju biju : Biju.values()) {
            System.out.println("Biju: " + biju + " (nome: " + biju.pegarNome() + ", Numero de caldas: " + biju.pegarNumeroDeCaldas() + ")");
        }
    }

    public void BoasVindas() {
        System.out.println("Olá meu nome é " + nome);
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println(nome + " utilizou sua habilidade especial");
    }


    public Uzumaki(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }


    public Uzumaki(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    public Uzumaki(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank, Biju biju) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
        this.eNumBiju = biju;
    }

    public Uzumaki() {
    }

}
