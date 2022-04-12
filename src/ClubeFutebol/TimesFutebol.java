package ClubeFutebol;

public class TimesFutebol {
    private String nome, categoria;
    private int vitorias, derrotas, empates;
    private boolean jogadores;

    public TimesFutebol(String nome, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
        setCategoria();
    }

    public String status() {
        return "TimesFutebol{\n" +
                "  nome='" + nome + "',\n" +
                "  categoria='" + categoria + "',\n" +
                "  vitorias=" + vitorias + ",\n" +
                "  derrotas=" + derrotas + ",\n" +
                "  empates=" + empates + ",\n" +
                "  jogadores=" + jogadores + ",\n" +
                '}';
    }

    public void vencer() {
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perder() {
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public void empatar() {
        this.setEmpates(this.getEmpates() + 1);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
        if (this.vitorias >= 10) {
            this.categoria = "Série A";
        } else if (this.vitorias >= 5) {
            this.categoria = "Série B";
        } else {
            this.categoria = "Série C";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public boolean isJogadores() {
        return jogadores;
    }

    public void setJogadores(boolean jogadores) {
        this.jogadores = jogadores;
    }
}
