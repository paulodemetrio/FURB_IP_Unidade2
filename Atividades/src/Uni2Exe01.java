//Leia 2 valores inteiros e imprima sua soma.
import java.util.Scanner;
public class Uni2Exe01 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        int n1 = scan.nextInt();
        System.out.print("Digite o segundo valor: ");
        int n2 = scan.nextInt();
        int soma = n1 + n2;
        System.out.println("O resultado de " + n1 + " + " + n2 + " é: " + soma);
        scan.close();
    }
}
