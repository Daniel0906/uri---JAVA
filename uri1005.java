import java.util.Scanner;
public class uri1005 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double A, B, media;

        A = in.nextDouble();
        B = in.nextDouble();

        in.close();

        media = (A * 3.5 + B * 7.5)/11;

        System.out.printf("MEDIA = %.5f", media);
    }
}