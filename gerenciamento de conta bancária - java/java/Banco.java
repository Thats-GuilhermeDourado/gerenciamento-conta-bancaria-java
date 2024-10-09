import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<ContaBancaria> contas;

    public Banco() {
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(ContaBancaria conta) {
        contas.add(conta);
        System.out.println("Conta adicionada: " + conta.getNumeroConta());
    }

    public void removerConta(String numeroConta) {
        for (int i = 0; i < contas.size(); i++) {
            if (contas.get(i).getNumeroConta().equals(numeroConta)) {
                contas.remove(i);
                System.out.println("Conta removida: " + numeroConta);
                return;
            }
        }
        System.out.println("Conta não encontrada: " + numeroConta);
    }

    public ContaBancaria consultarConta(String numeroConta) {
        for (ContaBancaria conta : contas) {
            if (conta.getNumeroConta().equals(numeroConta)) {
                return conta;
            }
        }
        System.out.println("Conta não encontrada: " + numeroConta);
        return null;
    }
}
