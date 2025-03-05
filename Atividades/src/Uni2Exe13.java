//Dois carros (X e Y) partem em uma mesma direção. O carro X sai com velocidade constante de 60 Km/h e o carro Y sai com velocidade constante de 90 Km/h. Em uma hora (60 minutos) o carro Y consegue se distanciar 30 quilômetros do carro X, ou seja, consegue se afastar um quilômetro a cada 2 minutos. Leia a distância (em Km) e calcule quanto tempo leva (em minutos) para o carro Y tomar essa distância do outro carro.
import java.util.Scanner;

public class Uni2Exe13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double veloX = 60;
        double veloY = 90;
        double difVelo = veloY - veloX;
        System.out.print("Informe a distância entre os veículos X e Y em Km: ");
        double distancia = scan.nextDouble();
        double tempoH = distancia / difVelo;
        double tempoM = tempoH * 60;
        System.out.println("O tempo necessáro para que o veículo Y tomar a distância de " + distancia + " ikm do veículo X será de " + tempoM + " minutos.");
        scan.close();
    }
}