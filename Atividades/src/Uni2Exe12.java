//Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano, p1(x1,y1) e p2(x2,y2) e calcule a distância entre eles, mostrando 4 casas decimais após a vírgula, segundo a fórmula:

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni2Exe12 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df_4 = new DecimalFormat("0.0000");
        System.out.print("Digite as coordenadas do eixo X e eixo Y do primeiro ponto P1(x1,y1), respectivamente: ");
        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();
        System.out.print("Digite as coordenadas do eixo X e eixo Y do segundo ponto P2(x2,y2), respectivamente: ");
        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();
        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));;
        System.out.println("A distância entre os pontos P1(" + x1 + ", " + y1 + ") e P2(" + x2 + ", " + y2 + ") será de " + df_4.format(distancia));
        scan.close();
    }
}
