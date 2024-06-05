import java.util.Scanner;

public class Conversor {

    private final Cotacao cotacao;

    public Conversor(String apiKey) {
        this.cotacao = new Cotacao(apiKey);
    }

    public void converterMoeda(String moedaPartida, String moedaFinal) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite o valor da moeda em " + moedaPartida + " ");
            double valor = Double.parseDouble(sc.nextLine());

            double taxa = cotacao.taxaCambio(moedaPartida, moedaFinal);
            double result = valor * taxa;
            System.out.println("Valor resultante em " + moedaFinal + ": " + result);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
