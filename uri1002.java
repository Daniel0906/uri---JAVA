import java.util.Scanner;
public class uri1002 {
    public static void main(String[] args) {
        Scanner raio = new Scanner(System.in);

        System.out.println("Valor do raio: ");
        double r = raio.nextDouble();

        raio.close();

        double n = 3.14159;

        double area = n*(r*r);

        System.out.printf("A = %.4f ", area);

    }
}