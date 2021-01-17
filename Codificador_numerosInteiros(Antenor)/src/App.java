// Cadeira de Computabilidade e Lógica Matemática (CLM)
// Criação de um codificador J para a função G e g, onde chamo o codificador J para a função G de 'Jtão' e o codificador J para a função g de 'Jtinha'
import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        System.out.println("Digite o número m");
        int m = new Scanner(System.in).nextInt();
        System.out.println("Digite o número n");
        int n = new Scanner(System.in).nextInt();
        double j = Jotinha(m, n);
        double J = Jotão(m, n);
        System.out.println("Para a função (" + m +", " + n + ") resultado do Jtão: " + J);
        System.out.println("Para a função (" + m +", " + n + ") resultado do Jtinha: " + j);
    } 

    public static double Jotinha(int first, int second){
        double j;
        double a = Math.pow(2, (first-1));
        j = (a*((2*second) - 1));
        return j;
    }

    public static double Jotão(int first, int second){
        double J;
        double a = Math.pow(first, 2);
        double b = Math.pow(second,2);
        J = (a + (2*second*first) + b - first - (3*second) + 2)/2;
        return J;
    }
    
}
