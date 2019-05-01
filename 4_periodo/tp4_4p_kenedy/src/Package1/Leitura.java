/*
 * Classe para ler o arquivo...
 */
package Package1;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Anderson
 */
public class Leitura {
    private static StringBuffer stringBuffer = null;
    public static void Leitura(String pathname, float[][] matrix){
        String[] todoarq;//vai pegar cada linha do arquivo...
        String[] linha;//vai pegar os elementos da linha...
        int ordem;//vai pegar a primeira linha do arquivo, so tem um elemento...
        
        if(carrega(new File(pathname))){
            todoarq = stringBuffer.toString().split("\n");
            ordem = Integer.parseInt(todoarq[0].trim());
            for (int i = 0; i < 2; i++) {
                linha = todoarq[i+1].split(" ");
                for (int j = 0; j < 4; j++) {
                    matrix[i][j] = Float.parseFloat(linha[j].trim());
                }
            }
            MethodNewton.setTAM(ordem);
        }
    }
    private static boolean carrega(File arquivo) {
        stringBuffer = new StringBuffer();
        int conteudo;
        try {
            FileReader reader = new FileReader(arquivo);
            do {
                conteudo = reader.read();
                if (conteudo != -1) {
                    stringBuffer.append((char) conteudo);
                }
            } while (conteudo != -1);

            reader.close();
            return true;

        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}
