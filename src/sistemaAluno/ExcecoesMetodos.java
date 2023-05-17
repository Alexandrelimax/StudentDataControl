package sistemaAluno;

public class ExcecoesMetodos {
    public static void quantidadeException(Integer entrada) throws ExcecoesProjeto.QuantidadeInvalida {
        if (entrada < 0) {
            throw new ExcecoesProjeto.QuantidadeInvalida("Quantidade de alunos inválida.");
        }
    }

    public static void apenasStrings(String entrada) throws ExcecoesProjeto.SoStrings {
        if (!entrada.matches("[a-zA-Z]+")) {
            throw new ExcecoesProjeto.SoStrings("Este campo só deve conter letras");
        }
    }

}


