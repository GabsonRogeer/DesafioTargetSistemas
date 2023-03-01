/*TODO: 4) Dado o valor de faturamento mensal de uma distribuidora, detalhado por estado:
   SP – R$67.836,43
   RJ – R$36.678,66
   MG – R$29.229,88
   ES – R$27.165,48
   Outros – R$19.849,53
   Escreva um programa na linguagem que desejar onde calcule o percentual de representação
   que cada estado teve dentro do valor total mensal da distribuidora.*/

package faturamento;

import java.text.DecimalFormat;

public class FaturamentoDistribuidora {

    public static void main(String[] args) {
        double faturamentoTotal = 180759.98;
        double SP = 67836.43;
        double RJ = 36678.66;
        double MG = 29229.88;
        double ES = 27165.48;
        double Outros = 19849.53;
        DecimalFormat df = new DecimalFormat("#.00");

        double percentualSP = (SP / faturamentoTotal) * 100;
        double percentualRJ = (RJ / faturamentoTotal) * 100;
        double percentualMG = (MG / faturamentoTotal) * 100;
        double percentualES = (ES / faturamentoTotal) * 100;
        double percentualOutros = (Outros / faturamentoTotal) * 100;

        System.out.println("Percentual de representação de cada estado no faturamento mensal da distribuidora:");
        System.out.println("SP: " + df.format(percentualSP) + "%");
        System.out.println("RJ: " + df.format(percentualRJ) + "%");
        System.out.println("MG: " + df.format(percentualMG) + "%");
        System.out.println("ES: " + df.format(percentualES) + "%");
        System.out.println("Outros: " + df.format(percentualOutros) + "%");
    }
}