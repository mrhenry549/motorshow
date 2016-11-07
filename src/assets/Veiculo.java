package assets;

public class Veiculo {
    String nome, marca;
    int cilindrada;

    public Veiculo(String nome, String marca, int cilindrada) {
        this.nome = nome;
        this.marca = marca;
        this.cilindrada = cilindrada;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
    
}
