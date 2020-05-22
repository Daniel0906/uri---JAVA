import java.util.Scanner;
public class uri1004 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int A, B, PROD;

        A = in.nextInt();
        B = in.nextInt();

        in.close();

        PROD = A*B;

        System.out.println("PROD = " + PROD);

    }
}