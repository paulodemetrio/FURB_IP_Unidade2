//Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
import java.util.Scanner;
public class Uni2Exe05 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        int n1 = scan.nextInt();
        System.out.print("Digite o segundo valor: ");
        int n2 = scan.nextInt();
        System.out.print("Digite o terceiro valor: ");
        int n3 = scan.nextInt();
        System.out.print("Digite o quarto valor: ");
        int n4 = scan.nextInt();
        int diferenca = (n1 * n2) - (n3 * n4);
        System.out.println("O resultado da diferença de " + n1 + " x " + n2 + " - " + n3 + " x " + n4 + " será de: " + diferenca);
        scan.close();
    }
}
