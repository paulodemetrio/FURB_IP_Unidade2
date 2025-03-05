//Num sistema de equações o valor de A equivale ao valor de B e o valor de C equivale ao valor de D. Leia os valores de B, C e D e calcule o valor de A.

import java.util.Scanner;

public class Uni2Exe19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o valor de B: ");
        double b = scan.nextDouble();
        System.out.print("Digite o valor de C: ");
        double c = scan.nextDouble();
        System.out.print("Digite o valor de D: ");
        double d = scan.nextDouble();
        double a = b;
        System.out.println("O valor de A será: " + a);
        scan.close();
    }    
}
