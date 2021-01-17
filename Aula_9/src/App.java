// Pontos dimensionais predefinidos
public class App {
    public static void main(String[] args) throws Exception {
        
        PontoBidimensional pb = new PontoBidimensional(3,4);
        PontoTridimensional pt = new PontoTridimensional(5,6,7);

        System.out.println(pb);
        System.out.println(pt);

    }

}

class PontoBidimensional {

private double x_coord;
private double y_coord;

public PontoBidimensional(double x, double y) {

setCoordenadaX(x);
setCoordenadaY(y);

}

public void setCoordenadaX(double x) {
x_coord = x;
}

public void setCoordenadaY(double y) {
y_coord = y;
}

public double getCoordenadaX() {
return x_coord;
}

public double getCoordenadaY() {
return y_coord;
}

public String toString() {
return "Eu sou um ponto bidimensional.\n" +
"Minha coordenada x: " + getCoordenadaX() + "\n" +
"Minha coordenada y: " + getCoordenadaY() + "\n";
}

}

class PontoTridimensional extends PontoBidimensional {
    
    private double z_coord;

    public PontoTridimensional(double x, double y, double z){
        
        super(x,y); // Construtor da classe mãe, chama a parte de x e y e em seguida faço a parte da camada z.
        setCoordenadaZ(z);

    }

    public void setCoordenadaZ(double z){
        z_coord = z;
    }

    public double getCoordenadaZ(){
        return z_coord;
    }

    public String toString() {
        return "Eu sou um ponto Tridimensional.\n" +
        "Minha coordenada x: " + getCoordenadaX() + "\n" +
        "Minha coordenada y: " + getCoordenadaY() + "\n" +
        "Minha coordenada z: " + getCoordenadaZ() + "\n";

    }

}

// Outro exemplo de Herança
// class Animal {

//     private String dono;
//     private String dataNascimento;
//     private String dataVacinacao;
    
//     public String getDono() {
//     return dono;
//     }

//     public void setDono(String dono) {
//     this.dono = dono;
//     }

//     public String getDataNascimento() {
//     return dataNascimento;
//     }

//     public void setDataNascimento(String dataNascimento) {
//     this.dataNascimento = dataNascimento;
//     }

//     public String getDataVacinacao() {
//     return dataVacinacao;
//     }

//     public void setDataVacinacao(String dataVacinacao) {
//     this.dataVacinacao = dataVacinacao;
//     }

// }
    
// class Gato extends Animal {

//     private boolean vacinado;
//     private String aspecto;

//     public Gato(boolean vacinado, String aspecto, String dono, String dataNasc, String dataVac) {
//         this.vacinado = vacinado;
//         this.aspecto = aspecto;
//         this.setDono(dono);
//         this.setDataNascimento(dataNasc);
//         this.setDataVacinacao(dataVac);
//     }

//     public boolean getVacinado() {
//         return vacinado;
//     }

//     public void setVacinado(boolean vacinado) {
//         this.vacinado = vacinado;
//     }

//     public String getAspecto() {
//         return aspecto;
//     }

//     public void setAspecto(String aspecto) {
//         this.aspecto = aspecto;
//     }

// }