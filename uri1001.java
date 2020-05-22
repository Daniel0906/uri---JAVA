import java.util.Scanner;

class uri1001{
    public static void main(String[] args) {
        Scanner v1 = new Scanner(System.in);
        Scanner v2 = new Scanner(System.in);

        int A = v1.nextInt();
        int B = v2.nextInt();

        v1.close();
        v2.close();
        
        int soma = A + B;

        System.out.println("X = " + soma);
    }
}