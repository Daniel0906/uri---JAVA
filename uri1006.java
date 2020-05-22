import java.util.Scanner;

public class uri1006 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.printf("Nota A: ");
        double A = in.nextDouble();
        System.out.printf("Nota B: ");
        double B = in.nextDouble();
        System.out.printf("Nota C: ");
        double C = in.nextDouble();

        in.close();

        if (A > 10.0 || A < 0 || B > 10.0 || B < 0 || C > 10.0 || C < 0) {
            System.out.println("Nota inválida!");
            
        }else{

        double media = (A * 2 + B * 3 + C * 5)/10;
        
        System.out.printf("Média: %.1f", media);
        }

    }
}