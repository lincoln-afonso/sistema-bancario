package sistema.auxiliar;

public class DadoNaoInformadoException extends Exception {
    private static final long serialVersionUID = 1L;

    public DadoNaoInformadoException(String str) {
        super(str);
    }

    public DadoNaoInformadoException() {
        super("O dado solicitado não fooi informado!");
    }
}