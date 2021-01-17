// public class App {
//     public static void main(String[] args) throws Exception {
//         System.out.println("Hello, World!");
//     }
// }

// interface FormaGeometrica {

//  public double getArea();
// public String getDescricao();
// }

// class Retangulo implements FormaGeometrica {
// private double base;
// private double altura;
// public Retangulo(double base, double altura) {
// super();
// this.base = base;
// this.altura = altura;
// }

// public double getBase() {
// return base;
// }

//  public void setBase(double base) {
// this.base = base;
// }

//  public double getAltura() {
// return altura;
// }

//  public void setAltura(double altura) {
// this.altura = altura;
// }

//  public double getArea() {
// return base*altura;
// }
// public String getDescricao() {
// return "Eu sou um retângulo de área: " + getArea();
// }
// }


public class App  {
	
    public static void main(String[] args) {
		int[ ] t = {8,2,23,17,9};
		int[ ] y  = {4,5,23,2,6};
		int h = 0;
		for (int i = 0;i < t.length; i++ ) {
		     if (t[i] == y[i])
			    h = h +2;
		}
		System.out.println(h);
    }  
    
}