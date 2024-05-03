import javax.swing.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ConsultaCep consultaCep = new ConsultaCep();

        String cep = JOptionPane.showInputDialog(null, "Insira o CEP");

        try {
            Endereco novoEndereco = consultaCep.buscaEndereco(cep);
            JOptionPane.showMessageDialog(null, novoEndereco.toString());
            GeradorDeArquivo gerador = new GeradorDeArquivo();
            gerador.gerarJson(novoEndereco);
            JOptionPane.showMessageDialog(null, "Arquivo gerado com sucesso!");
        } catch (RuntimeException | IOException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            JOptionPane.showMessageDialog(null,"Finalizando a Aplicação");
        }
    }
}