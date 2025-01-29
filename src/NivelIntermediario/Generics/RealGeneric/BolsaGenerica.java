package NivelIntermediario.Generics.RealGeneric;

import java.util.ArrayList;
import java.util.List;

public class BolsaGenerica<T> {

    private List<T> equipamentos; // não é acoplada a outra clase, como no caso da outra bolsa, que era acoplada a Kunai

    public BolsaGenerica() {
        this.equipamentos = new ArrayList<>();
    }

    // colocar equipamentos genericos
    public void adicionarEquipamentos(T equipamentoGenerico) {
        this.equipamentos.add(equipamentoGenerico);
    }

    public List<T> getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(List<T> equipamentos) {
        this.equipamentos = equipamentos;
    }

    @Override
    public String toString() {
        return "Bolsa de equipamentos: " + equipamentos.toString();
    }
}
