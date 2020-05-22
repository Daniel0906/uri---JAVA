import java.util.Scanner;

public class uri1009 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.printf("Nome do vendedor: ");
        String nome = in.nextLine();
        System.out.printf("Salário fixo total: ");
        double salario = in.nextDouble();
        System.out.printf("Vendas no mês($): ");
        double vendaMes = in.nextDouble();

        in.close();

        double salF = (salario + vendaMes * 0.15);

        System.out.println("Vendedor: " + nome);
        System.out.printf("Total: %.2f", salF);

    }
}