package NivelIntermediario.Record;

public record NinjaRecord(String nome, String email, int telefone) {

    // exemplo real: nomeUsuario, Id
    // pois nome e Id não muda

    // Em Record atributos, métodos e a própria classe todos são FINAL

    public String emailCaixaAlta() {
        return email.toUpperCase();
    }

}
