// // Exemplo do slide.
// public class Main{
//   public static void main(String[] args){
//     String s1 = "Testando a função chamada = escreva";
//     escreva(s1);
// }
//   private static void escreva(String frase) {
//     System.out.println(frase);
//   }
// }


// // Exemplo 2 do slide.
// public class Main {

//   static String s1 = "alguma coisa";
//   public static void main(String[] args) {

//     System.out.println("função Main: s1 = " + s1);

//     s1 = "coisa nenhuma";

//     escreva_Frase();

//     System.out.println("De volta para a função main.");

//   }

//   public static void escreva_Frase()  {

//   System.out.println("função escreva:  s1 = " + s1);

//   }
// }

/* Exemplo de modularização 
variaveis: gasto_azulejos, comprimeto, altura, area, azulejos: real
inicio: escrever "Digite o comprimento em metros"
        ler comprimento
        escrever "Digite a altura em metros"
        ler altura
        area <- comprimento * altura
        azulejos <- area * 9
        gasto_azulejos <- azulejos * 2.5
        escrever "Quantidade de azulejos necessária: ", azulejos
        escrever "Valor gasto com azulejos: R$ ", gasto_azulejos
fim.
Dividir em 3 partes: 1 - função que imprime na tela(escreva), 2 - variaveis com ler junto com o modulo da função 1, 3 - calcular */

import java.util.Scanner;

public class Main {

  static double comprimento = 0, altura = 0, qtd_azulejos = 0, gasto_azulejos = 0;

  public static double lerDimensoesEObterArea(){
    double area = 0;
    Scanner s = new Scanner(System.in); // Recurso para ler uma informação do teclado.
    System.out.println("Digite o comprimento em metros");
    comprimento = s.nextDouble(); // Vai pegar a informação dada.
    System.out.println("Digite a altura em metros");
    altura = s.nextDouble();
    area = comprimento * altura;
    return area;
  }

  public static void calcularValorGasto(double area) {
    qtd_azulejos = area * 9;
    gasto_azulejos = qtd_azulejos * 2.5;
  }

  public static void escreva(String frase) {
    System.out.println(frase);
  }

  public static void main(String[] aStrings) { // Função que vai executar o codigo.
    double area = 0;
    String resposta1 = "", resposta2 = "";
    area = lerDimensoesEObterArea();
    calcularValorGasto(area);
    resposta1 = "Quantidade de azulejos necessária: " + qtd_azulejos;
    escreva(resposta1);
    resposta2 = "Valor gasto com azulejos: R$ " + gasto_azulejos;
    escreva(resposta2);
  }
}