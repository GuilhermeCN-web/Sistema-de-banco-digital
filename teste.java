public class teste {
    public static void main(String args[]) {
        pessoa pessoa = new pessoa("João", 30);
        pessoa.apresentar();

        ContaBancaria conta = new ContaBancaria(1000.0);
        System.out.println("Saldo inicial: " + conta.getSaldo()); 
        conta.depositar(500.0);
        System.out.println("Saldo após depósito: " + conta.getSaldo());
        conta.sacar(300.0);
        System.out.println("Saldo após saque: " + conta.getSaldo());
    }
}
