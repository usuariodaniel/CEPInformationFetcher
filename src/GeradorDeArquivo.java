import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class GeradorDeArquivo {

    public void gerarJson(Endereco endereco) throws IOException {

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        FileWriter text = new FileWriter(endereco.cep() + ".json");
        text.write(gson.toJson(endereco));
        text.close();
    }
}
