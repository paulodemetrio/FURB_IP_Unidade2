/*Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159).
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni2Exe11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");
        System.out.print("Digite o primeiro valor: ");
        float a = scan.nextFloat();
        System.out.print("Digite o segundo valor: ");
        float b = scan.nextFloat();
        System.out.print("Digite o terceiro valor: ");
        float c = scan.nextFloat();
        double areaTriangulo = (a * c) / 2;
        double areaCirculo = 3.14159 * (c * c);
        double areaTrapezio = ((a + b) * c) / 2;
        double areaQuadrado = b * b;
        double areaRetangulo = a * b;
        System.out.println("A área do triângulo retângulo que tem " + a + " por base e " + c + " por altura resulta em: " + areaTriangulo);
        System.out.println("A área do círculo de raio " + c + " será de: " + df_2.format(areaCirculo));
        System.out.println("A área do trapézio que tem " + a + " e " + b + " por bases e " + c + " por altura será de: " + areaTrapezio);
        System.out.println("A área do quadrado de lado " + b + " será de: " + areaQuadrado);
        System.out.println("A área do retângulo que tem lados " + a + " e " + b + " será de: " + areaRetangulo);
        scan.close();
    }
}
