package Desafios.desafio04;

public class NinjaBasico implements Ninja{

    String nome;
    TipoHabilidade habilidade;
    int idade;

    @Override
    public void mostrarInformacoes() {
        System.out.println("nome: " + nome + "\nidade " + idade + "\nhabilidade: " + habilidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println(nome + "executou sua habilidade " + habilidade);
    }


}
