package sistemaAluno;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapsAlunos {
    private List<Aluno>alunos;
    private CalculoAprovacao calculoAprovacao;

    private CondicaoAprovacao condicaoAprovacao;


    public Map<CondicaoAprovacao, List<Aluno>> mapsCondicao(List<Aluno>alunos){
        Map<CondicaoAprovacao, List<Aluno>> condicaoAprovacaoListMap = new HashMap<>();

        condicaoAprovacaoListMap.put(CondicaoAprovacao.APROVADO, new ArrayList<>());
        condicaoAprovacaoListMap.put(CondicaoAprovacao.RECUPERACAO, new ArrayList<>());
        condicaoAprovacaoListMap.put(CondicaoAprovacao.REPROVADO, new ArrayList<>());

        for (Aluno alunos1 : alunos) {
            alunos1.getDisciplinas().forEach(disc -> {
                Double notas = disc.getNotas();
                calculoAprovacao = new CalculoAprovacao(disc, notas);
                condicaoAprovacao = disc.getCondicaoAprovacao();
                condicaoAprovacaoListMap.get(condicaoAprovacao).add(alunos1);
            });
        }
        return condicaoAprovacaoListMap;
    }
}
