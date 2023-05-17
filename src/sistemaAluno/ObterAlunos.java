package sistemaAluno;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ObterAlunos {

    private List<Aluno> alunos = new ArrayList<>();
    private RemoverDisciplina removerDisciplina = new RemoverDisciplina();


    public ObterAlunos() {

    }

    public List<Aluno> obterLista() {
        while (alunos.isEmpty()) {
            try {
                Integer quantAluno = Integer.valueOf(JOptionPane.showInputDialog("Quantos alunos desejar pesquisar?"));
                ExcecoesMetodos.quantidadeException(quantAluno);

                for (int i = 0; i < quantAluno; i++) {
                    String name = JOptionPane.showInputDialog("Digite o nome do aluno.");
                    ExcecoesMetodos.apenasStrings(name);
                    Aluno aluno = new Aluno(name);

                    Integer QuantidadeDisciplina = Integer.valueOf(JOptionPane.showInputDialog("Quantas Disciplinas?"));
                    ExcecoesMetodos.quantidadeException(QuantidadeDisciplina);

                    for (int j = 0; j < QuantidadeDisciplina; j++) {
                        String nome = JOptionPane.showInputDialog("Qual a disciplina?");
                        ExcecoesMetodos.apenasStrings(name);

                        Double nota = Double.valueOf(JOptionPane.showInputDialog("Qual a nota?"));
                        aluno.getDisciplinas().add(new Disciplinas(nome, nota));

                    }
                    removerDisciplina.remover(aluno);
                    alunos.add(aluno);
                }
                return alunos;
            } catch (ExcecoesProjeto.QuantidadeInvalida | ExcecoesProjeto.SoStrings | NumberFormatException e) {
                e.printStackTrace();
                e.getMessage();
            } catch (Exception e) {
                e.printStackTrace();
                e.getMessage();

            }
        }
        return null;
    }
}
