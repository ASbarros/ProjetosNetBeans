/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1_4p_kennedy;

/**
 *
 * @author Anderson
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class tp1_4p_kennedy {
 
  public static void main(String[] args) {
    float valor, menor = 0,menor_valor = 0, acumulador = 0, media = 0, Vabs, Vrel = 0;
    int i = 1, indice = 0;
 
    System.out.printf("Informe o nome de arquivo texto:\n");
    String nome = "valores.txt";
 
    System.out.printf("\nConteúdo do arquivo texto:\n");
    try {
      FileReader arq = new FileReader(nome);
      BufferedReader lerArq = new BufferedReader(arq);
 
      String linha = lerArq.readLine(); // lê a primeira linha
// a variável "linha" recebe o valor "null" quando o processo
// de repetição atingir o final do arquivo texto
    //calcula a media...
      while (linha != null) {
        valor = Float.parseFloat(linha);
        acumulador += valor;
        indice++;
        linha = lerArq.readLine(); // lê da segunda até a última linha
      }
        media = acumulador/indice;
        System.out.println("media " + media +"\nnumero de elementos: "+indice);
        arq.close();
        
        
        arq = new FileReader(nome);
        lerArq = new BufferedReader(arq);
        linha = lerArq.readLine();
        while(linha != null){
            valor = Float.parseFloat(linha);
            Vabs = media - valor;
            if(Vabs < 0)
                Vabs = Vabs * -1;
            
            Vrel = Vabs/media;
            if(i == 1){
                i = 0;
                menor = Vrel;
                menor_valor = valor;
            }
            else{
                if(Vrel < menor){
                    menor = Vrel;
                menor_valor = valor;
                }
            }
            linha = lerArq.readLine();
        }
        System.out.println("menor valor "+menor_valor+"\nerro relativo: "+Vrel*100);
        arq.close();
    } catch (IOException e) {
        System.err.printf("Erro na abertura do arquivo: %s.\n",
          e.getMessage());
    }
 
    System.out.println();
  }
}
