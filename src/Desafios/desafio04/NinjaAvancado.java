package Desafios.desafio04;

public class NinjaAvancado implements Ninja {

    String nome;
    int idade;
    TipoHabilidade habilidade;
    String especialidade;

    @Override
    public void mostrarInformacoes() {
        System.out.println("nome: " + nome + "\nidade " + idade + "\nhabilidade: " + habilidade + "\nespicialidade: " + especialidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println(nome + " executou a habilidade " + habilidade);
    }

    public NinjaAvancado(String nome, int idade, TipoHabilidade habilidade, String especialidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.especialidade = especialidade;
    }

    public NinjaAvancado() {
    }
}
