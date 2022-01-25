package lht.com.oo.desafio;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
       super.imprimirInfosComuns();
        System.out.println("=== Seu emprestimo ===");
        super.imprimirInfosComuns();

    }


    }


