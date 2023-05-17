package sistemaAluno;

import java.util.List;
import java.util.Map;

public class CalculoAprovacao implements Calculo{

    private Disciplinas disciplinas;

    public CalculoAprovacao(Disciplinas disciplinas, Double nota ) {
        this.disciplinas = disciplinas;
        calculoMateria(nota);
    }

    @Override
    public void calculoMateria(Double nota) {
        if(nota >= 7){
            disciplinas.setCondicaoAprovacao(CondicaoAprovacao.APROVADO);
        } else if (nota >= 5) {
            disciplinas.setCondicaoAprovacao(CondicaoAprovacao.RECUPERACAO);
        }else {
            disciplinas.setCondicaoAprovacao(CondicaoAprovacao.REPROVADO);
        }
    }
}
