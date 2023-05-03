import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SimpleProject {
    public static void main(String[] args) {
        // Create an instance of the Person class
        Person person = new Person("John", 25);

        // Call the methods on the person object
        person.sayHello();
        person.sayAge();

        // Create an instance of the Car class
        Car car = new Car("Tesla", "Model S", "Red", 2019);

        // Call the methods on the car object
        //car.start();
        //car.accelerate();
        //car.brake();

        // Simple HTTP Java Client for Spotify
        String newString = "Alguma coisa";
        List<Double> arrayDoubles = new ArrayList<>();
        Person person1 = new Person("Alice", 23);

        HttpClient client = HttpClient.newHttpClient();
        HashMap bodyParams = new HashMap<String, String>() {{
            put("client_id", "2c9b26578dd9468a83f3a0272ff1cebd");
            put("client_secret", "bde4634e7b6e4480b834ee1acea9bc2c");
            put("grant_type","client_credentials");
        }};

        ObjectMapper objectMapper = new ObjectMapper();
        String requestBody = objectMapper
                .writeValueAsString(bodyParams);

        // 1. Importar o Jackson (que contem a class ObjectMapper) usando o pom
        // 2. (Aparte) Quando alterares o pom, não te esqueças de fazer reload
        // 3. Se a classe for importada corretamente, fazer run e ver se o Spotify devolve 200
        // 4. Se não devolver 200, tentar perceber o que se passa
        // 5. Se devolver 200, tentar fazer um pedido ao outro endpoint do Spotify (Get Album Tracks)
            // Usar o Postman para gerar um token e usar esse token

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://accounts.spotify.com/api/token"))
                .POST(HttpRequest.BodyPublishers.ofString(requestBody))
                .build();

        try {
            HttpResponse response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println("Spotify returned HTTP Code: " + response.statusCode());
        } catch (IOException | InterruptedException e) {
            System.out.println("Exception thrown by the HTTP Client");
        }
    }
}
