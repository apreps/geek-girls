import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

public class SimpleProject {
    public static void main(String[] args) throws UnsupportedEncodingException {
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

        String newString = "Alguma coisa";
        List<Double> arrayDoubles = new ArrayList<>();
        Person person1 = new Person("Alice", 23);

        // Simple HTTP Java Client for Spotify
        final String SPOTIFY_URL = "https://accounts.spotify.com/api/token";

        CloseableHttpClient httpClient = HttpClientBuilder.create().build();

        HttpPost httpPost = new HttpPost(SPOTIFY_URL);
        httpPost.addHeader("Content-Type", "application/x-www-form-urlencoded");

        String bodyParams = "client_id=2c9b26578dd9468a83f3a0272ff1cebd&client_secret=bde4634e7b6e4480b834ee1acea9bc2c&grant_type=client_credentials";

        HttpEntity paramEntity = new StringEntity(bodyParams);
        httpPost.setEntity(paramEntity);


        // 0. Criar classe de um objecto com duas strings (access_token e token_type) e um inteiro (expires_in)
            // usar exemplo do SpotifyError
        // 1 . Criar objecto da classe nova
        // 2. Mapear responseString para o objecto criado
            // usar objectMapper (?)
            // Secção 3.2 >> https://www.baeldung.com/jackson-object-mapper-tutorial#2-json-to-java-object
        // 2. Usar a informação guardada no objecto para fazer uma chamada ao endpoint "Get Tracks" do Spotify

        try {
            CloseableHttpResponse httpResponse = httpClient.execute(httpPost);
            System.out.println("GET Response Status: " + httpResponse.getStatusLine().getStatusCode());
            System.out.println("Ola");

            HttpEntity entity = httpResponse.getEntity();
            String responseString = EntityUtils.toString(entity, "UTF-8");
            System.out.println("GET Response body: " + responseString);

        } catch (IOException exception) {
            System.out.println("Exception thrown by the HTTP Client");
        }
    }
}
