//Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica, e informe-o expresso no formato horas:minutos:segundos.

import java.util.Scanner;

public class Uni2Exe10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Informe o tempo de duração em segundos do evento: ");
        int tempo = scan.nextInt();
        int horas = tempo / 3600;
        int minutos = (tempo % 3600) / 60;
        int segundos = tempo % 60;
        System.out.printf("O tempo de duração do evento equivale a %02d:%02d:%02d.\n", horas, minutos, segundos);
        scan.close();
    }
}
