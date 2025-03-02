//Uma pessoa foi até uma casa de câmbio trocar dólares por reais. Para isto ela entregou um valor em dólares para o atendente. Considerando que o atendente tem a cotação do dólar, calcule quantos reais o atendente deve devolver para a pessoa.

import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni2Exe09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");
        System.out.print("Digite o valor em dólares: ");
        double dolar = scan.nextDouble();
        System.out.print("Digite a cotação do dólar: ");
        double cotacao = scan.nextDouble();
        double reais = dolar * cotacao;
        System.out.print("$ " + df_2.format(dolar) + " USD são equivalentes a R$ " + df_2.format(reais) + " BRL");
        scan.close();
    }
}
