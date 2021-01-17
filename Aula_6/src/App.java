//Criando um código para loja de vendas de CD musicais
// import java.util.Scanner;

// public class App {
// public static void main(String[] args) {
// Produto p = new Produto(17, "CD Depeche Mode");
// // p.setCodigo(26);
// // p.setNome("Queen Live in Wembley");
// System.out.println("Dados do produto: ");
// System.out.println("Código do produto: " + p.getCodigo());
// System.out.println("Nome do produto: " + p.getNome());
// Pedido pedidoNovo = new Pedido(34, "Beatriz Arruda", 2000);
// System.out.println("Dados do pedido: ");
// System.out.println("Código do pedido: " + pedidoNovo.getNumero());
// System.out.println("Nome do cliente: " + pedidoNovo.getNome_Cliente());
// System.out.println("Valor do pedido: " + pedidoNovo.getValor_Pedido());

//  }
// }

// class Pedido {
// private int numero;
// private String nome_cliente;
// private double valor_pedido;
// public Pedido(int num, String nome, double valor) {
// numero = num;
// nome_cliente = nome;
// valor_pedido = valor;
// }
// public void setNumero(int num) {
// numero = num;
// }
// public int getNumero() {
// return numero;
// }
// public void setNome_Cliente(String nome) {
// nome_cliente = nome;
// }
// public String getNome_Cliente() {
// return nome_cliente;
// }

//  public void setValor_Pedido(double valor) {
// valor_pedido = valor;
// }
// public double getValor_Pedido() {
// return valor_pedido;
// }
// }

// class Produto {
// private int codigo;
// private String nome;
// public Produto(int cod, String n) {
// codigo = cod;
// nome = n;
// }
// public void setCodigo(int cod) {
// codigo = cod;
// }
// public int getCodigo() {
// return codigo;
// }
// public String getNome() {
// return nome;
// }
// public void setNome(String nome_produto) {
// nome = nome_produto;
// }
// }


//Encontrar Área e périmetro do retângulo
// import java.util.Scanner;

// public class App {
//     public static void main(String[] args) {
//         Retangulo r = new Retangulo();
//         Scanner s = new Scanner(System.in);
//         System.out.println("Digite a base do retângulo");
//         double b = s.nextDouble();
//         System.out.println("Digite a altura do retângulo");
//         double a = s.nextDouble();
        
//         r.setB(b);
//         r.setA(a);

//         System.out.println("Área do retângulo : " + r.area());
//         System.out.println("Périmetro do retângulo : " + r.peri());

//     }

    
// }

// class Retangulo{
//     private double b;
//     private double a;

//     public void setB(double b){
//         this.b = b;
//     }

//     public void setA(double a){
//         this.a = a;
//     }

//     public double area(){
//         return b*a;
//     }

//     public double peri(){
//         return (b*2) + (a*2);
//     }
// }

//Exemplo do prof com altura e base predefinidas

// public class App {
//     public static void main(String[] args) {
//         Retangulo r = new Retangulo(10,5);
//         System.out.println(r);

//     }

    
// }

// class Retangulo{
//     private double base;
//     private double altura;

//     public Retangulo(double b, double a){
//         base = b;
//         altura = a;
//     }

//     public double getBase(){
//         return base;
//     }

//     public void setBase(double b){
//         base = b;
//     }

//     public double getAltura(){
//         return altura;
//     }

//     public void setAltura(double a){
//         altura = a;
//     }

//     public double getArea(){
//         return base*altura;
//     }

//     public double getPerimetro(){
//         return (base*2) + (altura*2);
//     }

//     public String toString(){
//         return "Eu sou um retângulo de base = " + getBase() +", altura = "+ + getAltura() +" área ="+ getArea() +" e perímetro = " + getPerimetro();
//     }
// }



//Fazer imc
public class App {
    public static void main(String[] args) {
        Pessoa r = new Pessoa("Maria", 20, 45.45,1.59);
        System.out.println(r);
    }
}

class Pessoa{
    private String nome;
    private int idade;
    private double peso;
    private double altura;

    public Pessoa(String n, int i, double p, double a){
        nome = n;
        idade = i;
        peso = p;
        altura = a;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String n){
        nome = n;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int i){
        idade = i;
    }

    public double getPeso(){
        return peso;
    }

    public void setPeso(double p){
        peso = p;
    }

    public double getAltura(){
        return altura;
    }

    public void setAltura(double a){
        altura = a;
    }

    public double getIMC(){
        return peso/(altura*altura);
    }

    public String toString(){
        double IMC = getIMC();
        String resposta = "Nome da pessoa: " + getNome() +"\n"+"Idade: " + getIdade() +"\n"+"IMC = "+ getIMC() +"\n"+"Situação: ";

        if (IMC <= 18.5){
            resposta = resposta + "Abaixo do peso normal";
        }
        else if((IMC > 18.5) && (IMC <= 25)){
            resposta = resposta + "Peso normal";
        }
        else if((IMC > 25) && (IMC <= 30)){
            resposta = resposta + "Acima do peso normal";
        }
        else {
            resposta = resposta + "Obesidade";
        }
        return resposta;
    }
}

class Imovel {
    private int numero_imovel;
    private String endereco_imovel;
    private double valor_total;
    
    public Imovel(int num, String end, double v){
    numero_imovel = num;
    endereco_imovel = end;
    valor_total = v;
    } 
    
    public void setNumero(int num) {
    numero_imovel = num;
    }
    
    public int getNumero() {
    return numero_imovel;
    }
    
    public void setEnd(String end) {
    endereco_imovel = end;
    }
    
    public String getEnd() {
    return endereco_imovel;
    }
    
    public void setValor(double v) {
    valor_total = v;
    }
    
    public double getValor() {
    return valor_total;
    }
    
    }