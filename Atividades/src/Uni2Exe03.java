//Calcule a área da circunferência elevando o valor de raio ao quadrado e multiplicando por π (π = 3.14159).
import java.util.Scanner;
import java.text.DecimalFormat;
public class Uni2Exe03 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");
        System.out.print("Digite o valor do raio da circunferência: ");
        double raio = scan.nextDouble();
        double pi = 3.14159;
        double area = pi * (raio * raio);
        System.out.println("A área da circunferência será de " + df_2.format(area));
        scan.close();
    }
}
