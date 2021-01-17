// Valor arredondado do número PI
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        double resposta = arredondar(Math.PI, 2, 0);
        System.out.println("Valor arredondado: " + resposta);
    }

    public static double arredondar(double valor, int casas, int pCimaoupBaixo){
        double arredondado = valor;
        arredondado = arredondado*(Math.pow(10,casas));
        if(pCimaoupBaixo == 1){
            arredondado = (int) (arredondado+1);
        } else{
            arredondado = (int) (arredondado);
        }
        arredondado = arredondado/(Math.pow(10,casas));
        return arredondado;
    }
}
