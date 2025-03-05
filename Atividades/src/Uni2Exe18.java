//Numa loja de materiais de construção, um azulejo estampado custa R$ 12,50. Leia o comprimento e altura de uma parede (em metros) e escreva o valor gasto com a compra de azulejos. Considere que um metro quadrado é formado por 9 azulejos.

import java.util.Scanner;

public class Uni2Exe18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double custoAzulejo = 12.5;
        int azulejoPorMetroQ = 9;
        System.out.print("Informe o comprimento da parede (em metros): ");
        double comp = scan.nextDouble();
        System.out.print("Informe a altura da parede (em metros): ");
        double alt = scan.nextDouble();
        double medidaParede = comp * alt;
        double nAzulejos = medidaParede * azulejoPorMetroQ;
        double valor = nAzulejos * custoAzulejo;
        System.out.println("Uma parede de " + medidaParede + " m² preenchida com azulejo estampado irá custar: R$ " + valor);
        scan.close();
    }
}