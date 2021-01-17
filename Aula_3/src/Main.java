// // Potencial de um numero double elevado a um numero int
// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         System.out.println("Digite o valor de A e B:");
//         Scanner s = new Scanner(System.in);
//         double A = s.nextDouble();
//         int B = s.nextInt();
//         double resposta = potencial(A,B);
//         System.out.println(A +" elevado a " +B+" é:" +resposta);
//     }

//     public static double potencial(double A, int B){
//         double resposta=1;
//         for(int i = 1; i<= B; i++){
//             resposta = resposta*B;
//         } return resposta;
//     }
// }

// Fazer a raiz quadrada
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // System.out.println("Digite o valor de A e B:");
        // Scanner s = new Scanner(System.in);
        // double A = s.nextDouble();
        // int B = s.nextInt();
        raiz(9);
    }

    public static void raiz (int numero){
        int i = 1, counter = 0, x = numero;
        while(x>0){
            x=x-i;
            i=i+2;
            counter=counter+1;
        } 
        if(x==0){
            System.out.println("Raiz exata de " +numero+ ": " + counter);
        } 
        else{
            counter = counter-1;
            System.out.println("Raiz aproximada de " +numero+ ": " + counter);
        }
    }
}

