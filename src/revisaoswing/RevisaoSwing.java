/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisaoswing;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import org.json.simple.JSONArray;
import org.json.simple.JSONValue;

/**
 *
 * @author Aluno faculdade
 */
public class RevisaoSwing {

    public static JSONArray array = new JSONArray();
    public static Path arquivo = Paths.get(System.getProperty("user.dir"), "funcionarios.txt");

    public static void carregarArray() throws IOException {

        if(!Files.exists(arquivo)) return;
        
        String texto = "";
        List<String> linhas = Files.readAllLines(arquivo, Charset.defaultCharset());
        for (String item : linhas) {
            texto += item;
        }

        array = (JSONArray) JSONValue.parse(texto);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FormCadastro form = new FormCadastro();
        form.setVisible(true);
    }

}
