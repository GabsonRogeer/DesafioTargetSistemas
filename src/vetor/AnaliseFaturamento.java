/*TODO: 3) Dado um vetor que guarda o valor de faturamento diário de uma distribuidora,
   faça um programa, na linguagem que desejar, que calcule e retorne:
   • O menor valor de faturamento ocorrido em um dia do mês;
   • O maior valor de faturamento ocorrido em um dia do mês;
   • Número de dias no mês em que o valor de faturamento diário foi superior à média mensal.
   IMPORTANTE:
   a) Usar o json ou xml disponível como fonte dos dados do faturamento mensal;
   b) Podem existir dias sem faturamento, como nos finais de semana e feriados.
   Estes dias devem ser ignorados no cálculo da média;*/

package vetor;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class AnaliseFaturamento {
    public static void main(String[] args) {
        JSONParser parser = new JSONParser();
        ArrayList<Double> valores = new ArrayList<>();
        ArrayList<Double> valoresValidos = new ArrayList<>();
        DecimalFormat df = new DecimalFormat("#.00");
        double soma = 0;
        int diasAcimaMedia = 0;

        try {
            JSONArray jsonArray = (JSONArray) parser.parse(new FileReader("C:\\projetos\\targetSistemas\\untitled\\dados.json"));
            Iterator<JSONObject> iterator = jsonArray.iterator();

            while (iterator.hasNext()) {
                JSONObject jsonObject = iterator.next();
                double valor = (Double) jsonObject.get("valor");
                valores.add(valor);
                soma += valor;
            }

            for (Double d: valores) {
                if (d > 0.0){
                    valoresValidos.add(d);
                }
            }

            double media = soma / valoresValidos.size();
            double menorValor = Collections.min(valoresValidos);
            double maiorValor = Collections.max(valoresValidos);

            for (Double valor : valoresValidos) {
                if (valor > media) {
                    diasAcimaMedia++;
                }
            }

            System.out.println("Menor valor de faturamento: " + df.format(menorValor));
            System.out.println("Maior valor de faturamento: " + df.format(maiorValor));
            System.out.println("Número de dias com faturamento acima da média: " + (diasAcimaMedia));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
