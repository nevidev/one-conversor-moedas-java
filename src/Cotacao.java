import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Cotacao {

    private final String API_KEY;

    public Cotacao(String apiKey) {
        this.API_KEY = apiKey;
    }

    public double taxaCambio(String moedaPartida, String moedaFinal) {
        try {
            String url_str = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/pair/"
                    + moedaPartida + "/"
                    + moedaFinal;
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI(url_str))
                    .GET()
                    .build();

            HttpResponse<String> response = HttpClient.newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());

            Gson gson = new Gson();
            JsonObject jsonResponse = gson.fromJson(response.body(), JsonObject.class);
            return jsonResponse.get("conversion_rate").getAsDouble();

        } catch (Exception e) {
            throw new RuntimeException("Erro! Não conseguimos obter a taxa de câmbio");
        }
    }
}
