package NivelIntermediario.Generics.NoGeneric;

import java.util.ArrayList;
import java.util.List;

public class BolsaKunai {

    private List<Kunai> kunais; // está acoplada a Kunai

    public BolsaKunai() {
        this.kunais = new ArrayList<>();
    }

    public void adicionarKunai(Kunai kunai) {
        this.kunais.add(kunai);
    }

    public List<Kunai> getKunais() {
        return kunais;
    }

    public void setKunais(List<Kunai> kunais) {
        this.kunais = kunais;
    }

    @Override
    public String toString() { // com esse metodo, quando eu der um print na classe ele mostrara os objetos, se não tivesse o toString ele mostraria o endereço de memoria
        return "Bolsa de kunais: " + kunais.toString();
    }

}
