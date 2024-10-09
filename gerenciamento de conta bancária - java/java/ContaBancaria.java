public class ContaBancaria {
    
    private String numeroConta;
    private String titular;
    private double saldo;
    private double limiteSaque;
    
    public ContaBancaria(String numeroConta, String titular, double saldo, double limiteSaque) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
        this.limiteSaque = limiteSaque;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    
    public String getTitular() {
        return titular;
    }
    
    
    public String getNumeroConta() {
        return numeroConta;
    }
    
    
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Erro: Valor de depósito deve ser positivo.");
        }
    }
    
    public void sacar(double valor) {
        if (valor <= saldo && valor <= limiteSaque) {
            saldo -= valor;
        } else {
            System.out.println("Erro: Saque não permitido. Verifique o saldo ou o limite.");
        }
    }
    
    public void alterarLimite(double novoLimite) {
        limiteSaque = novoLimite;
    }
}
