package lht.com.oo.desafio;

public interface IConta {


    void sacar(double valor);

    void depoisitar (double valor);

    void transferencia(double valor, Conta contaDestino);


    void emprestimo(double valor);


    void emprestimo(double emprestimo, Conta contaDestino);

    void imprimirExtrato();


}
