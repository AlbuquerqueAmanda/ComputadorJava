public class Computador {
    // Atributos
    private String marca;
    private String modelo;
    private int memoriaRAM;
    private double processadorGHz;
    private double preco;

    // Construtor default (sem parâmetros)
    public Computador() {
    }
    
    // Construtor com parâmetros
    public Computador(String marca, String modelo, int memoriaRAM, double processadorGHz, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.memoriaRAM = memoriaRAM;
        this.processadorGHz = processadorGHz;
        this.preco = preco;
    }

    // Métodos getters e setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public double getProcessadorGHz() {
        return processadorGHz;
    }

    public void setProcessadorGHz(double processadorGHz) {
        this.processadorGHz = processadorGHz;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Método imprimir para exibir os atributos do Computador
    public void imprimir() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Memória RAM: " + this.memoriaRAM + " GB");
        System.out.println("Processador: " + this.processadorGHz + " GHz");
        System.out.println("Preço: R$ " + this.preco);
        System.out.println();
    }
}
