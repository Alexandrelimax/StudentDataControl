package sistemaAluno;

public class ExcecoesProjeto extends Exception {

    public ExcecoesProjeto(String msg) {
        super(msg);
    }

    public static class QuantidadeInvalida extends ExcecoesProjeto {
        public QuantidadeInvalida(String msg) {
            super(msg);
        }
    }

    public static class SoStrings extends ExcecoesProjeto {
        public SoStrings(String msg) {
            super(msg);
        }
    }



}


