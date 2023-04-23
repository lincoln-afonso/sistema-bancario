package sistema.dominio;

import java.time.LocalDate;

import sistema.auxiliar.DadoInvalidoException;
import sistema.auxiliar.DadoNaoInformadoException;

public class ContaBancaria {
    /*
     * possui o número da agência, o número, a senha, o saldo e a data de abertura
     * da conta bancária. As operações bancárias de depósito, transferência e saque
     * devem ser registradas com a data e hora de sua realização. Portanto, crie uma
     * classe chamada OperacaoBancaria que registre a data, a hora, o tipo e o valor
     * da operação realizada.
     */
    private String numeroAgencia;
    private String numero;
    private double saldo;
    private LocalDate dataAbertura;

    public ContaBancaria() throws DadoInvalidoException, DadoNaoInformadoException {
        this.saldo = 0;
        this.setDataAbertura(LocalDate.now());
    }

    public String getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(String numeroAgencia) throws DadoInvalidoException, DadoNaoInformadoException {
        int numero;

        if (numeroAgencia.isEmpty())
            throw new DadoNaoInformadoException("Número da agência não informado!");
        
        numero = Integer.parseInt(numeroAgencia);
        if (numero <= 0)
            throw new DadoInvalidoException("Número de agência inválido!");
        this.numeroAgencia = numeroAgencia;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) throws DadoInvalidoException, DadoNaoInformadoException {
        int numeroConta;

        if (numero.isEmpty()) 
            throw new DadoNaoInformadoException();

        numeroConta = Integer.parseInt(numero);
        
        if (numeroConta <= 0) 
            throw new DadoInvalidoException("Número de conta inválido!");
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public LocalDate getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(LocalDate dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    @Override
    public String toString() {
        return "ContaBancaria [dataAbertura=" + dataAbertura + ", numero=" + numero + ", numeroAgencia=" + numeroAgencia
                + ", saldo=" + saldo + "]\n";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((numero == null) ? 0 : numero.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ContaBancaria other = (ContaBancaria) obj;
        if (numero == null) {
            if (other.numero != null)
                return false;
        } else if (!numero.equals(other.numero))
            return false;
        return true;
    }
}