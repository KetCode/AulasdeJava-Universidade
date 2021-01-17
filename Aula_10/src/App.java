public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}

// Código para uma loja de livraria
class Produto {
    private int codigo;
    private String nome;
    private double preço;
    private double desconto_a_Vista;
    public Produto(int codigo, String nome, double preço, double desconto) {
    super();
    this.codigo = codigo;
    this.nome = nome;
    this.preço = preço;
    this.desconto_a_Vista = desconto;
    }
    
     public int getCodigo() {
    return codigo;
    }
    
     public void setCodigo(int codigo) {
    this.codigo = codigo;
    }
    
     public String getNome() {
    return nome;
    }
    
     public void setNome(String nome) {
    this.nome = nome;
    }
    
     public double getPreço() {
    return preço;
    }
    
     public void setPreço(double preço) {
    this.preço = preço;
    }
    
     public double getDesconto() {
    return desconto_a_Vista;
    }
    
     public void setDesconto_a_Vista(double desconto) {
    this.desconto_a_Vista = desconto;
    }
    public String descrição() {
    return "eu sou um produto, e meu código é : "+getCodigo() +
    " nome : " + getNome() +
    " preço : " + getPreço() +
    " e desconto a vista: " + this.getDesconto();
    }

}

    class Livro extends Produto {
        private String autor;
        private String editora;
        public Livro(int codigo, String nome, double preço, double desconto, String autor, String editora) {
        super(codigo, nome, preço, desconto);
        this.autor = autor;
        this.editora = editora;
        }
        
         public String getAutor() {
        return autor;
        }
        
         public void setAutor(String autor) {
        this.autor = autor;
        }
        
         public String getEditora() {
        return editora;
        }
        
         public void setEditora(String editora) {
        this.editora = editora;
        }
        public String descrição() {
        return "eu sou um Livro, e meu código é : "+getCodigo() +
        ", nome : " + getNome() +
        ", preço : " + getPreço() +
        ", desconto a vista: " + this.getDesconto() +
        ", autor: "+this.getAutor() +
        " e editora: "+this.getEditora();
        }
        
        
        }
        