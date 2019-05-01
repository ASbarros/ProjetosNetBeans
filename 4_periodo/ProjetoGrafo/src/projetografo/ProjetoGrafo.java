
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetografo;


/**
 *
 * @author Anderson
 */
public class ProjetoGrafo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Grafo grafo1 = new Grafo();
        int valor = 3;
        grafo1.CarregaArquivo("texte.txt");
        grafo1.ImprimeGrafo();
        System.out.println("lista de adjacencia vazia? "+ grafo1.ListaAdjVazia(valor));
        grafo1.PrimeiroListaAdj(valor);
    }
    
}
