
//Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o total a receber no final do mês, com duas casas decimais.
import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni2Exe07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");
        System.out.println("Digite o nome do vendedor: ");
        String nome = scan.next();
        System.out.println("Digita salário fixo do vendedor: ");
        double salarioFixo = scan.nextDouble();
        System.out.println("Digita o valor total vendido por " + nome + " em dinheiro: ");
        double valor = scan.nextDouble();
        double comissao = 0.15;
        double total =  salarioFixo + (valor * comissao);
        System.out.println("O vendedor " + nome + " receberá o total de: R$ " + df_2.format(total));
        scan.close();
    }
}
