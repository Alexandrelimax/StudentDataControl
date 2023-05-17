package sistemaAluno;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private final String name;
    private List<Disciplinas>disciplinas = new ArrayList<>();


    public Aluno(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Disciplinas> getDisciplinas() {
        return disciplinas;
    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Aluno: ");
        sb.append(getName()).append("\n");
        for (Disciplinas discip: disciplinas) {
            sb.append(discip.getNome()+"  ");
            sb.append(discip.getNotas()+"\n");
            sb.append(discip.getCondicaoAprovacao());
            sb.append("\n");
        }

        return sb.toString();
    }
}
