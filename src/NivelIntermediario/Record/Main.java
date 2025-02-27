package NivelIntermediario.Record;

public class Main {
    public static void main(String[] args) {

        Ninja cadastroNinja = new Ninja("naruto", "slaoq@gmail", 999);
        System.out.println(cadastroNinja);

        NinjaRecord cadastroRecord = new NinjaRecord("narutoRecord", "slaoq@gmail", 111);
        System.out.println("Cadastro record " + cadastroRecord);
        System.out.println("Email em CAPSLOCK: " + cadastroRecord.emailCaixaAlta());
        System.out.println("nome: " + cadastroRecord.nome()); // não precisa do get()


    }
}
