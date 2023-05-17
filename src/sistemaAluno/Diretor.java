package sistemaAluno;

public class Diretor implements Permissao{

    private Logs logs;

    public Diretor(Logs logs) {
        this.logs = logs;
    }

    @Override
    public boolean acesso() {
        boolean LogDiretor = logs.getLogin().equalsIgnoreCase("administrador");
        boolean senhaDiretor = logs.getSenha() == 789456;
        return LogDiretor && senhaDiretor;

    }
}
