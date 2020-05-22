import java.util.Scanner;

public class uri1008 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.printf("Número do funcionário: ");
        int num = in.nextInt();
        System.out.printf("Horas trabalhadas: ");
        int horas = in.nextInt();
        System.out.printf("Salário por hora: ");
        double salpH = in.nextDouble();

        in.close();

        double salario = horas * salpH;
        
        System.out.println("Número do funcionário: " + num);
        System.out.println("Salário: " + salario);
        
    }
}