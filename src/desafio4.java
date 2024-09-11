import java.text.NumberFormat;
import java.util.Locale;

public class desafio4 {
    public static void main(String[] args) {
        double [] faturamento = new double[5];
        String [] estados = new String[5];

        // atribuição dos estados no vetor
        estados [0] = "SP";
        estados [1] = "RJ";
        estados [2] = "MG";
        estados [3] = "ES";
        estados [4] = "Outros";

        // atribuição dos faturamentos no vetor
        faturamento [0] = 67836.43;
        faturamento [1] = 36678.66;
        faturamento [2] = 29229.88;
        faturamento [3] = 27165.48;
        faturamento [4] = 19849.53;

        // soma do faturamento mensal de todos os estados
        double valorTotal = faturamento [0] + faturamento [1] + faturamento [2] + faturamento [3]
                + faturamento [4];

        // formatação dos valores para o padrão brasileiro
        NumberFormat formatoBR = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        String valorFormatado = formatoBR.format(valorTotal);
        System.out.println("O valor total é de: R$ " + valorFormatado);

        double percentual;
        for(int i = 0; i < faturamento.length; i++){
            percentual = faturamento [i] / valorTotal *100;
            System.out.println("A porcentagem do estado " + estados [i] + " é: " + String.format("%.2f", percentual)+ "%");
        }

    }
}
