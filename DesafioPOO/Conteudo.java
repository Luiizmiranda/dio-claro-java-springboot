package DesafioPOO;

public abstract class Conteudo {
    private String titulo;
    private String descricao;
    public static final double XP_PADRAO = 10d;

    public abstract double calcularXP();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}