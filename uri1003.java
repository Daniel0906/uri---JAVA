import java.util.Scanner;
public class uri1003 {
    public static void main(String[] args) {

        Scanner n1 = new Scanner(System.in);
        Scanner n2 = new Scanner(System.in);

        System.out.println("Valor 1: ");
        int A = n1.nextInt();

        System.out.println("Valor 2: ");
        int B = n2.nextInt();

        n1.close();
        n2.close();

        int soma = A + B;

        System.out.println("SOMA = " + soma);

    }
}