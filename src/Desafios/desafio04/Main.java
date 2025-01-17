package Desafios.desafio04;

public class Main {
    public static void main(String[] args) {

        NinjaAvancado ninjaAvancado = new NinjaAvancado("Naruto", 18,TipoHabilidade.NINJUTSU,"soco de vento");

        ninjaAvancado.mostrarInformacoes();
        ninjaAvancado.executarHabilidade();


    }
}
