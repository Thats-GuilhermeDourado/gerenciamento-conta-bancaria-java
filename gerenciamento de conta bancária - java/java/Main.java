public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
 
 
        ContaBancaria conta1 = new ContaBancaria("12345", "Alice", 1000, 500);
        ContaBancaria conta2 = new ContaBancaria("67890", "Bob", 2000, 700);
 
 
        banco.adicionarConta(conta1);
        banco.adicionarConta(conta2);
 
 
        ContaBancaria contaConsultada = banco.consultarConta("12345");
        if (contaConsultada != null) {
            System.out.println("Titular: " + contaConsultada.getTitular() + ", Saldo:  " + contaConsultada.getSaldo());
        }
 
 
        conta1.depositar(200);
        System.out.println("Saldo atual da conta 12345: " + conta1.getSaldo());
 
 
        conta1.sacar(300);
        System.out.println("Saldo atual da conta 12345:  " + conta1.getSaldo());
 
 
        conta1.alterarLimite(600);
 
 
        conta1.sacar(700);
 
 
        banco.removerConta("67890");
    }
}