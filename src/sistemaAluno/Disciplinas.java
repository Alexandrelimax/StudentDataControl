package sistemaAluno;

public class Disciplinas {

    private String nome;
    private double notas;
    private CondicaoAprovacao condicaoAprovacao;

    public Disciplinas(String nome, double notas) {
        this.nome = nome;
        this.notas = notas;
    }

    public String getNome() {
        return nome;
    }

    public double getNotas() {
        return notas;
    }

    public CondicaoAprovacao getCondicaoAprovacao() {
        return condicaoAprovacao;
    }

    public void setCondicaoAprovacao(CondicaoAprovacao condicaoAprovacao) {
        this.condicaoAprovacao = condicaoAprovacao;
    }
}
