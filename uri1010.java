import java.util.Scanner;

public class uri1010 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("Quantidade item 1: ");
        int Qntd1 = in.nextInt();

        System.out.println("Valor item 1: ");
        double Valor1 = in.nextDouble();

        System.out.println("Quantidade item 2: ");
        int Qntd2 = in.nextInt();

        System.out.println("Valor item 2: ");
        double Valor2 = in.nextDouble();

        in.close();
        double conta = (Qntd1 * Valor1 + Qntd2 * Valor2);

        System.out.printf("Valor total a Pagar: %.2f", conta);

    }
}