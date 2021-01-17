// public class App {
//     public static void main(String[] args) throws Exception {
//     }
// }

//Exercicio de encapsulamento
//Está classe deverá usar encapsulamento, possuir um construtor, um método que calcula o preço
//a vista bem omo um método setDesconto, que recebe o valor do desconto, e se o mesmo for superior
//a 100 ou menor que zero, configurar o desconto como zero.
// class ProdutoSemEncapsulamento {
    // public int codigo;
    // public String nome; 
    // public double preco; 
    // public double desconto_a_vista; 
// }

//Solução:
// class Produto { 
//     private int codigo; 
//     private String nome; 
//     private double preco; 
//     private double desconto_a_vista; 
    
//     public Produto(int cod_prod, String nome_prod, double preco_prod, double desc) { 
//         codigo = cod_prod; 
//         nome = nome_prod; 
//         preco = preco_prod; 
//         desconto_a_vista = desc; 
//     } 
    
//     public double getPreco() { 
//         return preco; 
//     } 
    
//     public double getPrecoAVista() { 
//         double preco_a_vista; 
//         preco_a_vista = preco - preco*desconto_a_vista/100; 
//         return preco_a_vista; 
//     } 
    
//     public void setDesconto(double desc) { 
//         if ((desc > 100) || (desc < 0)) desconto_a_vista = 0; 
//         else desconto_a_vista = desc; 
//     } 
// }


// Exercicio
// Criar uma classe que representa uma conta bancária. Contendo encapsulamento, dois atributos,
// código e saldo, um construtor que recebe o número da conta e o saldo inicial, utilizar zero se
// for mandado um número negativo, métodos para creditar um valor, sacar um valor e imprimir o saldo
// se o valor a ser sacado for maior imprimir apenas o valor que tem no saldo.

class ContaBancaria{
    private long numero;
    private double saldo;

    public ContaBancaria(long num, double sc) {
        numero = num;
        if (sc > 0) saldo = sc;
    }

    public void creditar(double sc) {
        saldo = saldo + sc;
    }

    public double debitar(double sc) {
        if (sc > saldo) sc = saldo;
        saldo = saldo - sc;
        return sc;
    }

    public void imprimaSaldo() {
        System.out.println("Conta: " + numero + "Saldo: R$ " + saldo);
    }
}