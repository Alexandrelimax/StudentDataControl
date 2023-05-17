package sistemaAluno;
public class Secretaria implements Permissao {

    private Logs logs;

    public Secretaria(Logs logs) {
        this.logs = logs;
    }

    @Override
    public boolean acesso() {
        boolean LogSecretaria = logs.getLogin().equalsIgnoreCase("admin");
        boolean senhaSecretaria = logs.getSenha() == 123456;
        return LogSecretaria && senhaSecretaria;
    }
}
