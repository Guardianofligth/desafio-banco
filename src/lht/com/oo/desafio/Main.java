package lht.com.oo.desafio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cliente lht =new Cliente();
         lht.setNome("lht");

        Conta cc = new ContaCorrente(lht);
               cc.depoisitar(10000);
               cc.emprestimo ();
        Conta poupanca = new ContaPoupanca(lht);
              cc.transferencia(100,poupanca);

        Scanner entrada = new java.util.Scanner(System.in);

        System.out.println("Valor:");
             double valor = entrada.nextDouble();
        System.out.println("Juro ao Mês:");
              double juro = entrada.nextDouble();
        System.out.println("Total de Meses:");
               int meses = entrada.nextInt();

        double valorfinal = ( (valor * juro * meses ) / 100 + valor);
        double valorparc = valorfinal/meses;

        System.out.println(" O seu empréstimo no valor de R$ " + valor + " deverá ser pago " + meses + " parcelas de " + valorparc + " cada. " );





        cc.imprimirExtrato();
           poupanca.imprimirExtrato();


    }
}