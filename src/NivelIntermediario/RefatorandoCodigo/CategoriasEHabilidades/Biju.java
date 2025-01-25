package NivelIntermediario.RefatorandoCodigo.CategoriasEHabilidades;

public enum Biju {

    SHUKAKU("Shikaku", "Gaara", 1),
    MATATABI("Yugito Nii", "Matatabi", 2),
    ISOBU("Yagura", "Isobu", 3),
    SON_GOKU("Roshi", "Son Goku", 4),
    KOKUO("Han", "Kokuo", 5),
    SAIKEN("Utakata", "Saiken", 6),
    CHOMEI("Fuu", "Chomei", 7),
    GYUKI("Killer Bee", "Gyuki", 8),
    KURAMA("Naruto Uzumaki", "Kurama", 9);

    String nomeBiju;
    String junchuriki;
    int numeroDeCaldas;

    Biju(String nomeBiju, String junchuriki, int numeroDeCaldas) {
        this.nomeBiju = nomeBiju;
        this.junchuriki = junchuriki;
        this.numeroDeCaldas = numeroDeCaldas;
    }

    // Cria o ENUM sem argumentos
    Biju() {
    }

    public String pegarNome() {
        return nomeBiju;
    }

    public String pegarJunchuriki() {
        return junchuriki;
    }

    public int pegarNumeroDeCaldas() {
        return numeroDeCaldas;
    }

}
