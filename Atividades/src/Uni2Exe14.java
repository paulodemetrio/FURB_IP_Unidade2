//Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a relação de notas necessárias.

import java.util.Scanner;

public class Uni2Exe14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o valor inteiro:");
        int valor = scan.nextInt();
        int qtdeNotas;

        qtdeNotas = valor / 100;
        System.out.println(qtdeNotas + " nota(s) de 100");
        valor = valor % 100;

        qtdeNotas = valor / 50;
        System.out.println(qtdeNotas + " nota(s) de 50");
        valor = valor % 50;

        qtdeNotas = valor / 20;
        System.out.println(qtdeNotas + " nota(s) de 20");
        valor = valor % 20;

        qtdeNotas = valor / 10;
        System.out.println(qtdeNotas + " nota(s) de 10");
        valor = valor % 10;

        qtdeNotas = valor / 5;
        System.out.println(qtdeNotas + " nota(s) de 5");
        valor = valor % 5;

        qtdeNotas = valor / 2;
        System.out.println(qtdeNotas + " nota(s) de 2");
        valor = valor % 2;

        qtdeNotas = valor / 1;
        System.out.println(qtdeNotas + " nota(s) de 1");
        scan.close();
    }
}
