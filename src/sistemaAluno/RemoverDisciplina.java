package sistemaAluno;

import javax.swing.*;
import java.util.List;

public class RemoverDisciplina {

    private Aluno aluno;

    public RemoverDisciplina() {

    }

    public void remover(Aluno aluno) {
        Integer remover = Integer.valueOf(JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?"));
        while (remover == JOptionPane.YES_OPTION) {

            String disciplinaRemovida = JOptionPane.showInputDialog("Qual disciplina deseja remover?");
            List<Disciplinas> list = aluno.getDisciplinas();

            if (list.removeIf(disciplinas -> disciplinas.getNome().equalsIgnoreCase(disciplinaRemovida))) {
                JOptionPane.showMessageDialog(null, "Disciplina Removida com sucesso");
            } else {
                JOptionPane.showMessageDialog(null, "Não foi encontrada esta disciplina");
            }
            remover = Integer.valueOf(JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?"));
        }
    }
}
