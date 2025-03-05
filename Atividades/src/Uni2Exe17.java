//Uma empresa tem para um funcionário os seguintes dados: o nome, o número de horas trabalhadas mensais e o número de dependentes. A empresa paga R$ 10,00 por hora (valor para cálculo do salário trabalho) e R$ 60,00 por dependente (valor para cálculo do salário família) e são feitos descontos de 8,5% sobre o salário trabalho para o INSS e de 5% sobre o salário trabalho para o imposto de renda. Ao final informe o nome, o salário bruto e o salário líquido do funcionário.

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni2Exe17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");
        System.out.print("Informe o nome do funcionário: ");
        String nome = scan.nextLine();
        System.out.print("Informe o número de horas trabalhadas por " + nome + ": ");
        double horas = scan.nextDouble();
        System.out.print("Informe o número de dependentes: ");
        int dependente = scan.nextInt();
        double salarioTrabalho = 10 * horas;
        double salarioFamilia = 60 * dependente;
        double salarioBruto = salarioTrabalho + salarioFamilia;
        double inss = salarioTrabalho * 0.085;
        double ir = salarioTrabalho * 0.05;
        double salarioLiquido = salarioBruto - inss - ir;
        System.out.println("Nome: " + nome);
        System.out.println("Salário bruto: R$ " + df_2.format(salarioBruto));
        System.out.println("Salário líquido: R$ " + df_2.format(salarioLiquido));
        scan.close();
    }
}
