// // Calcular a média
// public class Main {
//     public static void main(String[] args) {
//         double x[] = {10,20,30};
//         double resposta = media(x);
//         System.out.println("Média = " + resposta);
//     }

//     public static double media(double[] v){
//         double media = 0, soma = 0;
//         for(int i = 0; i<v.length; i++){
//             soma = soma + v[i];
//         }
//         media = soma / v.length;
//         return media;
//     }
// }

// Fazer com que ele calcule o fatorial do número que for selecionado pelo usuario
import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         System.out.println("Digite o número que deseja achar o fatorial");
//         int v = new Scanner(System.in).nextInt(), i = v;
//         double f = i;
//         while (i > 1) {
//             f = f * (i - 1);
//             i--;
//         } System.out.println("O fatorial de " + v + "! resulta em: " + f);
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         double v = nDigitado();
//         double i = v;
//         double f = i;
//         while (i > 1) {
//             f = f * (i - 1);
//             i--;
//         } System.out.println("O fatorial de " + v + " resulta em: " + f);
//     }

//     public static double nDigitado(){
//     System.out.<println("Digite o número que deseja achar o fatorial");
//     double valor = new Scanner(System.in).nextDouble();
//     return valor;
//     }
// }


// // Codigo do prof
// public class Main {
//     public static void main(String[] args) {
//         int n=0;
//         System.out.println("Digite o número cujo fatorial deseja calcular.");
//         Scanner s = new Scanner(System.in);
//         n = s.nextInt();
//         int resposta = fatorial(n);
//         System.out.println("O fatorial de "+v+" é: " +resposta);
//     }

//     public static int fatorial(int numero) {
//         int fat = 1;
//         for(i=1; i<=numero; i++){
//             fat = fat*i;
//         } return fat;
//     }
// }

// Teste com Lista de frutas

public class Main {
        public static void main(String[] args) {
            String x[] = {"nanana","tirina","tototo","cocoate"};
            // String buscar = "";

            System.out.println("O que deseja comprar hoje?");
            Scanner s = new Scanner(System.in);
            String buscar = s.next();

            

            for(int i = 0; i<x.length; i++){
                if(x[i].contains(buscar)){
                    System.out.println("Obrigada por comprar " + buscar);
                    // continue; // é a mesma coisa que não colocar essa variavel pois o codigo já entende que ele tem que rodar tudo, ele ja utiliza o continue por si só sem precisar coloca-lo.
                    // break; // o break vai ajudar a sair do loop
                } else{
                    System.out.println("Não temos no estoque de hoje =( ");
                    // break;
                }
            }
        }
}

// For (loop): é usado quando vc sabe exatamente quantas vezes deseja utilizar o codigo
// ele tem 3 instruções (inicio/numero inicial, a condição (de parada), incrementador)
// agora imprimi a palavra yes 5 vezes
// melhor primeiro imprime de 1 até 5
// o while é quase igual ao for, ele é um loop a unica diferença é que o while vai rodar o codigo 
// até a condição que for dada for verdadeira. while(i<5){Sout(i);i++;}
// Bora usar uma matriz para armazenar o estoque, a matriz é do ingles array representada dentro das conchetes.
// w3schools.com
