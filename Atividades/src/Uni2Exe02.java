//Leia 2 valores inteiros e imprima sua multiplicação.
import java.util.Scanner;
public class Uni2Exe02 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        int n1 = scan.nextInt();
        System.out.print("Digite o segundo valor: ");
        int n2 = scan.nextInt();
        int multi = n1 * n2;
        System.out.println("O resultado de " + n1 + " x " + n2 + " é: " + multi);
        scan.close();
    }
}
