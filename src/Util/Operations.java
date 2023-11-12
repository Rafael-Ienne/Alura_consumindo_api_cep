package Util;

import Entities.City;
import Exception.CepNotFoundException;
import Exception.FileNotCreatedException;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

public class Operations {

    public static City findAdress(String cep) {
        try {
            String endereco = "https://viacep.com.br/ws/" + cep + "/json";

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();

            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), City.class);
        } catch (JsonSyntaxException | IOException | InterruptedException e) {
            throw new CepNotFoundException("Nao foi possivel encontrar o CEP. Encerrando a aplicacao");
        }

    }

    public static void writeFile(City city) {
        try {
            FileWriter writer = new FileWriter("cities.json");
            writer.write(new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).setPrettyPrinting().create().toJson(city));
            writer.close();
            System.out.println("Arquivo criado com sucesso");
        } catch (IOException e ) {
            throw new FileNotCreatedException("Nao foi possivel gerar o arquivo JSON com base no CEP informado. Finalizando a aplicacao");
        }
    }
}
