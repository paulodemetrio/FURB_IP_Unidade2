//Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais.

import java.util.Scanner;
import java.text.DecimalFormat;
public class Uni2Exe06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");        
        System.out.println("Digite o número do funcionário: ");
        int id = scan.nextInt();
        System.out.println("Digita o número de horas trabalhadas pelo funcuionário: ");
        double horas = scan.nextDouble();
        System.out.println("Digita o valor que deve receber por hora trabalhada: ");
        double valor = scan.nextDouble();
        double salario = horas * valor;
        System.out.println("O funcionário de número " + id + " receberá o sálario: R$ " + df_2.format(salario));
        scan.close();
    }
}
