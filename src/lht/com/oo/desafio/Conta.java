package lht.com.oo.desafio;

import java.util.Scanner;

public class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;


    protected int agencia;
    protected int numero;
    protected double saldo;
    protected double emprestimo;
    protected Cliente cliente;



    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;

    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;

    }

    @Override
    public void depoisitar(double valor) {

        saldo += valor;
    }

    @Override
    public void transferencia(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depoisitar(valor);
    }

    @Override
    public void emprestimo(double valor) {

    }


    @Override
    public void emprestimo(double emprestimo, Conta contaDestino) {
        Scanner entrada = new java.util.Scanner(System.in);
        System.out.println("Valor:");
        double valor = entrada.nextDouble();
        System.out.println("Juro ao Mês:");
        double juro = entrada.nextDouble();
        System.out.println("Total de Meses:");
        int meses = entrada.nextInt();
        double valorfinal = ( (valor * juro * meses ) / 100 + valor);

        // taxa de juro ao mes
        // quantidade de parcelas
        // multa de atraso
        // e o valor do emprestio
        // vai acrescentar no saldo da conta corrente

    }


    @Override
    public void imprimirExtrato() {

    }



    public int getAgencia() {

        return agencia;
    }

    public int getNumero() {

        return numero;
    }

    public double getSaldo() {

        return saldo;
    }

    public double getEmprestimo() {
        return emprestimo;
    }

    protected void imprimirInfosComuns() {

        System.out.println(String.format("Cliente: %s",this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d",this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
        System.out.println(String.format("Valor do Emprestimo: %.2f", this.emprestimo));
    }



    public void emprestimo() {

    }
}