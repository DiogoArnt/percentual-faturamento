import java.util.HashMap;
import java.util.Map;

public class PercentualFaturamento {

    public static void main(String[] args) {
        // Valores de faturamento por estado
        Map<String, Double> faturamentoPorEstado = new HashMap<>();
        faturamentoPorEstado.put("SP", 67836.43);
        faturamentoPorEstado.put("RJ", 36678.66);
        faturamentoPorEstado.put("MG", 29229.88);
        faturamentoPorEstado.put("ES", 27165.48);
        faturamentoPorEstado.put("Outros", 19849.53);

        // Calculando o valor total de faturamento
        double faturamentoTotal = 0;
        for (double valor : faturamentoPorEstado.values()) {
            faturamentoTotal += valor;
        }

        // Calculando e exibindo o percentual de cada estado
        System.out.println("Percentual de representação por estado:");
        for (Map.Entry<String, Double> entry : faturamentoPorEstado.entrySet()) {
            String estado = entry.getKey();
            double valor = entry.getValue();
            double percentual = (valor / faturamentoTotal) * 100;
            System.out.printf("%s: %.2f%%\n", estado, percentual);
        }
    }
}