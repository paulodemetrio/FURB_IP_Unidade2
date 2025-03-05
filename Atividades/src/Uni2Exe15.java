//Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor monetário. A seguir, calcule o menor número de notas e moedas possíveis no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. A seguir mostre a relação de notas necessárias.

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni2Exe15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");
        System.out.println("Informe o valor: ");
        double valor = scan.nextDouble();
        df_2.format(valor);
        int valorCentavos = (int) Math.round(valor * 100);
        System.out.println("Notas referentes à: " + valor);
        if (valorCentavos >= 10000) {
            int quantidade = valorCentavos / 10000;
            System.out.println(quantidade + " nota(s) de 100");
            valorCentavos = valorCentavos % 10000;
        }
        if (valorCentavos >= 5000) {
            int quantidade = valorCentavos / 5000;
            System.out.println(quantidade + " nota(s) de 50");
            valorCentavos = valorCentavos % 5000;
        }
        if (valorCentavos >= 2000) {
            int quantidade = valorCentavos / 2000;
            System.out.println(quantidade + " nota(s) de 20");
            valorCentavos = valorCentavos % 2000;
        }
        if (valorCentavos >= 1000) {
            int quantidade = valorCentavos / 1000;
            System.out.println(quantidade + " nota(s) de 10");
            valorCentavos = valorCentavos % 1000;
        }if (valorCentavos >= 500) {
            int quantidade = valorCentavos / 500;
            System.out.println(quantidade + " nota(s) de 5");
            valorCentavos = valorCentavos % 500;
        }
        if (valorCentavos >= 200) {
            int quantidade = valorCentavos / 200;
            System.out.println(quantidade + " nota(s) de 2");
            valorCentavos = valorCentavos % 200;
        }
        System.out.println("Moedas referentes à: " + valor);
        if (valorCentavos >= 100) {
            int quantidade = valorCentavos / 100;
            System.out.println(quantidade + " moeda(s) de 1");
            valorCentavos = valorCentavos % 100;
        }
        if (valorCentavos >= 50) {
            int quantidade = valorCentavos / 50;
            System.out.println(quantidade + " moeda(s) de 0.50");
            valorCentavos = valorCentavos % 50;
        }
        if (valorCentavos >= 25) {
            int quantidade = valorCentavos / 25;
            System.out.println(quantidade + " moeda(s) de 0.25");
            valorCentavos = valorCentavos % 25;
        }
        if (valorCentavos >= 10) {
            int quantidade = valorCentavos / 10;
            System.out.println(quantidade + " moeda(s) de 0.10");
            valorCentavos = valorCentavos % 10;
        }
        if (valorCentavos >= 5) {
            int quantidade = valorCentavos / 5;
            System.out.println(quantidade + " moeda(s) de 0.05");
            valorCentavos = valorCentavos % 5;
        }
        if (valorCentavos >= 1) {
            System.out.println(valorCentavos + " moeda(s) de 0.01");
        }
        scan.close();
    }
}
