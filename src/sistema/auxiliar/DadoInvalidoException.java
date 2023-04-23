package sistema.auxiliar;

public class DadoInvalidoException extends Exception {
    private static final long serialVersionUID = 1L;

    public DadoInvalidoException(String str) {
        super(str);
    }

    public DadoInvalidoException() {
        super("O dado solicitado não fooi informado!");
    }
}