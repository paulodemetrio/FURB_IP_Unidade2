//Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.

import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni2Exe08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");
        System.out.print("Digite o código da peça 1: ");
        int id1 = scan.nextInt();
        System.out.print("Digita o número de peças de código " + id1 + ": ");
        int n1 = scan.nextInt();
        System.out.print("Digita o valor unitário da peça de código " + id1 + ": ");
        double valor1 = scan.nextDouble();
        System.out.print("Digite o código da peça 2: ");
        int id2 = scan.nextInt();
        System.out.print("Digita o número de peças de código " + id2 + ": ");
        int n2 = scan.nextInt();
        System.out.print("Digita o valor unitário da peça de código " + id2 + ": ");
        double valor2 = scan.nextDouble();
        double valorTotal = (n1 * valor1) + (n2 * valor2);
        System.out.println("O valor total das peças " + id1 + " e " + id2 + " resulta em: R$ " + df_2.format(valorTotal));
        scan.close();
    }
}
