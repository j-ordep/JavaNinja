package NivelBasico.Condicoes;

public class LacosDeRepeticao {
    public static void main(String[] args) {

        int numeroDeClones = 1;
        int numeroMaxDeClones = 40;

//      while(condição) {Enquanto a condição for verdadeira tudo aqui vai acontecer}

//        while(numeroDeClones <= numeroMaxDeClones){
//            System.out.println("O naruto fez um clone das sobras, agora ele tem " + numeroDeClones + " clones");
//            numeroDeClones++;
//        }

//--------------------------------------------------------------------------------------------------------------------------------

//      for

        for (int i = numeroDeClones; i <= numeroMaxDeClones; i++) {
            System.out.println("O naruto fez um clone das sobras, agora ele tem " + i + " clones");
        }


    }
}
