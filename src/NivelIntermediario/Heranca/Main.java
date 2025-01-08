package NivelIntermediario.Heranca;

public class Main {
    public static void main(String[] args) {

        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.aldeia = "Aldeia do Folha";
        Naruto.idade = 17;
        Naruto.ModoSabioAtivado();

        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.aldeia = "Aldeia do Folha";
        Sasuke.idade = 18;
        Sasuke.SharinganAtivado();

        Haruno Sakura = new Haruno();
        Sakura.nome = "Sakura Haruno";
        Sakura.aldeia = "Aldeia do Folha";
        Sakura.idade = 18;
        Sakura.AtivarCura();

        Hyuga Hinata = new Hyuga();
        Hinata.nome = "Hinata Hyuga";
        Hinata.aldeia = "Aldeia do Folha";
        Hinata.idade = 16;
        Hinata.AtivarByakugan();

        Boruto Boruto = new Boruto();
        Boruto.nome = "Boruto Hyuga Uzumaki";
        Boruto.aldeia = "Aldeia da Folha";
        Boruto.idade = 9;

        Boruto.ModoSabioAtivado();
        Boruto.AtivarJougan();
        Boruto.AtivarOKarma();


    }
}
