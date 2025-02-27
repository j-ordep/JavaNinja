package NivelIntermediario.Generics.RealGeneric;

public class Main {
    public static void main(String[] args) {

        EquipamentosNinja kunai = new EquipamentosNinja("Kunai");
        EquipamentosNinja shuriken = new EquipamentosNinja("Shuriken");
        EquipamentosNinja pergaminho = new EquipamentosNinja("Pergaminho");

        BolsaGenerica<EquipamentosNinja> bolsaGenerica = new BolsaGenerica<>();
        bolsaGenerica.adicionarEquipamentos(kunai);
        bolsaGenerica.adicionarEquipamentos(shuriken);
        bolsaGenerica.adicionarEquipamentos(pergaminho);

        // exibe os elementos todos os elementos na Lista
        System.out.println(bolsaGenerica);

        System.out.println("---------------------------");

        // exibe os elementos todos os elementos da Lista separadamente
        bolsaGenerica.exibirEquipamentos();

        System.out.println("---------------------------");

        // novo obejto e nova bolsa
        Frutas abacaxi = new Frutas("Abacaxi bem grande");

        BolsaGenerica<Frutas> bolsaFruta = new BolsaGenerica<>();
        bolsaFruta.adicionarEquipamentos(abacaxi);

        // exibe os elementos todos os elementos na Lista
        System.out.println(bolsaFruta);

        // exibe os elementos todos os elementos da Lista separadamente
        bolsaFruta.exibirEquipamentos();


        System.out.println("--------------BolsaTotal--------------");

        //objetos de diferentes tipos na mesma bolsa

        BolsaGenerica<Object> todosObjetos = new BolsaGenerica<>(); // Object aceita todos os objetos

        todosObjetos.adicionarEquipamentos(new EquipamentosNinja("bomba"));

        todosObjetos.adicionarEquipamentos(new Frutas("morango"));

        todosObjetos.exibirEquipamentos();







/*  Explicação

        Olha pra classe BolsaGenerica, lá tem uma lista certo? essa lista não tem um tipo, ela é List<T>, e nessa lista ele cria um objeto equipamentos,
        mas ele não esta acoplado a nenhuma classe, então esse equipamento pode vir de qualquer classe.
        Já no exemplo não generico a BolsaKunai tem uma lista do tipo Kunai, a classe kunai, com atributos metodos etc, List<Kunai> kunais(que no generico ele chamou de equipamentos).
        A diferença é essa, a List<> da bolsa no generico não está presa a nenhuma classe.

        Então onde dizemos qual sera o tipo do equipamento que irá entrar na bolsa ?
        Na ArrayListLinkedList! Por exemplo: BolsaGenerica<EquipamentosNinja> bolsaGenerica = new BolsaGenerica<>();
        (EquipamentosNinja) é o tipo, que representa o <T>. ou seja, o <T> lá na classe BolsaGenerica nesse caso será do tipo EquipamentosNinja,
        mas tambem eu poderia criar uma classe Fruta,
        um objeto abacaxi e adicionar em outra bolsa, sem precisar criar uma nova classe pra bolsa, e sim so mudar o tipo dela, reciclar a classe
        mas com um objeto de um tipo diferente

        Frutas abacaxi = new Frutas("Abacaxi bem grande");
        BolsaGenerica<Frutas> bolsaFruta = new BolsaGenerica<>();
        bolsaFruta.adicionarEquipamentos(abacaxi);

*/



    }
}
