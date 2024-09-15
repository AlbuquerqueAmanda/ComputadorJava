import java.util.Scanner;

public class TesteComputador {
    public static void main(String[] args) {
        // Usando try-with-resources para garantir que o Scanner seja fechado automaticamente
        try (Scanner scanner = new Scanner(System.in)) {

            // Criando dois objetos com o construtor default
            Computador comp1 = new Computador();
            Computador comp2 = new Computador();

            // Preenchendo os atributos do comp1
            System.out.println("Digite as informações do Computador 1:");
            System.out.print("Marca: ");
            comp1.setMarca(scanner.nextLine());
            System.out.print("Modelo: ");
            comp1.setModelo(scanner.nextLine());
            System.out.print("Memória RAM (GB): ");
            comp1.setMemoriaRAM(scanner.nextInt());
            System.out.print("Processador (GHz): ");
            comp1.setProcessadorGHz(scanner.nextDouble());
            System.out.print("Preço (R$): ");
            comp1.setPreco(scanner.nextDouble());
            scanner.nextLine();  // Limpa a nova linha do buffer

            // Preenchendo os atributos do comp2
            System.out.println("\nDigite as informações do Computador 2:");
            System.out.print("Marca: ");
            comp2.setMarca(scanner.nextLine());
            System.out.print("Modelo: ");
            comp2.setModelo(scanner.nextLine());
            System.out.print("Memória RAM (GB): ");
            comp2.setMemoriaRAM(scanner.nextInt());
            System.out.print("Processador (GHz): ");
            comp2.setProcessadorGHz(scanner.nextDouble());
            System.out.print("Preço (R$): ");
            comp2.setPreco(scanner.nextDouble());
            scanner.nextLine();  // Limpa a nova linha do buffer

            // Criando dois objetos com o construtor com parâmetros
            Computador comp3 = new Computador("Apple", "MacBook Pro", 16, 2.9, 12000.00);
            Computador comp4 = new Computador("HP", "Pavilion", 12, 2.4, 4500.00);

            // Exibindo os dados dos computadores
            System.out.println("\nComputador 1:");
            comp1.imprimir();
            System.out.println("Computador 2:");
            comp2.imprimir();
            System.out.println("Computador 3:");
            comp3.imprimir();
            System.out.println("Computador 4:");
            comp4.imprimir();
        }
    }
}
