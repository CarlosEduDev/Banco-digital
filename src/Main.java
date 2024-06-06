public class Main {
    public static void main(String[] args) {
        Cliente Carlos = new Cliente();
        Carlos.setNome("Carlos");

        ContaCorrente corrente = new ContaCorrente(Carlos);
        Conta poupanca = new ContaPoupanca(Carlos);

        corrente.depositar(1500);

        corrente.transferir(500, poupanca);

        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
