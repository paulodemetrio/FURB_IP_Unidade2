//Leia dois valores de ponto flutuante e calcule a média ponderada sabendo que a nota A tem peso 3.5 e nota B 7.5 (a soma dos pesos é 11), sendo que a nota vai de 0.0 a 10.0.

import java.util.Scanner;
import java.text.DecimalFormat;
public class Uni2Exe04 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");
        double pesoA = 3.5;
        double pesoB = 7.5;
        System.out.println("Digite a primeira nota: ");
        float notaA = scan.nextFloat();
        System.out.println("Digite a segunda nota: ");
        float notaB = scan.nextFloat();
        double mediaPonderada = ( (notaA * pesoA) + (notaB * pesoB) ) / (pesoA + pesoB); 
        System.out.println("A média ponderada resulta em: " + df_2.format(mediaPonderada));
        scan.close();
    }
}
