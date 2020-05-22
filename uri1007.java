import java.util.Scanner;

public class uri1007 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.printf("Valor A: ");
        int A = in.nextInt();
        System.out.printf("Valor B: ");
        int B = in.nextInt();
        System.out.printf("Valor C: ");
        int C = in.nextInt();
        System.out.printf("Valor D: ");
        int D = in.nextInt();

        in.close();

        int diferenca = (A * B - C * D);

        System.out.println("Diferença = " + diferenca);
        
    }
}