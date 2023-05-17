package sistemaAluno;

public class EntradaSistema {

    private Permissao permissao;

    public EntradaSistema(Permissao permissao) {
        if(permissao.acesso()){
            this.permissao = permissao;

        }else {
            throw new IllegalArgumentException("Acesso negado");
        }

    }



}
