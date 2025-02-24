public class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if(valor > 0) {
            saldo += valor;
            System.out.println("Depositado: " + valor);
        }
    }

    public void sacar(double valor) {
        if(valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Sacado: " + valor);
        } else {
            System.out.println("Saldo insuficiente ou valor inválido para saque");
        }
    }
}
