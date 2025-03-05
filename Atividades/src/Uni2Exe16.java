//Uma fábrica de refrigerantes vende seu produto em três formatos: lata de 350 ml, garrafa de 600 ml e garrafa de 2 litros. Se um comerciante compra uma determinada quantidade de cada formato, informe quantos litros de refrigerante ele comprou.

import java.util.Scanner;

public class Uni2Exe16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Quantas latas (350ml) deseja comprar?");
        int qtdeLata = scan.nextInt();
        System.out.print("Quantas garrafas (600ml) deseja comprar?");
        int qtdeGarrafa = scan.nextInt();
        System.out.print("Quantas garrafas (2L) deseja comprar?");
        int qtdeGarrafa2L = scan.nextInt();
        double litros = ((0.350 * qtdeLata) + (0.600 * qtdeGarrafa) + (2 * qtdeGarrafa2L));
        System.out.println("O total comprado em litro(s) será de: " + litros);
        scan.close();
    }
}
