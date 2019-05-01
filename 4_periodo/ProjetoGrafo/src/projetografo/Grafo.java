
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetografo;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Anderson
 */
public class Grafo {

    private static final int MAXNUMVERTICES = 100;
    private static final int MAXNUMARESTAS = 4500;

    private float mat[][];
    private int NumVertices;
    private int NumArestas;

    public Grafo() {
        this.mat = new float[MAXNUMVERTICES + 1][MAXNUMVERTICES + 1];
    }

    public void setMat(float[][] mat) {
        this.mat = mat;
    }

    public void setNumVertices(int NumVertices) {
        this.NumVertices = NumVertices;
    }

    public void setNumArestas(int NumArestas) {
        this.NumArestas = NumArestas;
    }

    public static int getMAXNUMVERTICES() {
        return MAXNUMVERTICES;
    }

    public static int getMAXNUMARESTAS() {
        return MAXNUMARESTAS;
    }

    public float[][] getMat() {
        return mat;
    }

    public int getNumVertices() {
        return NumVertices;
    }

    public int getNumArestas() {
        return NumArestas;
    }

    public void InsereAresta(int V1, float Peso, int V2) {
        System.out.println("insere aresta");
        this.mat[V1][V2] = Peso;
    }

    public boolean ExisteAresta(int V1, int V2) {
        return this.mat[V1][V2] > 0;
    }

    public boolean ListaAdjVazia(int v) {
        short aux = 0;
        while (aux < this.NumVertices) {
            if (this.mat[v][aux] > 0) {
                return false;
            }
            aux++;
        }
        return true;
    }

    public int PrimeiroListaAdj(int v) {
        int aux = 0;
        while (aux < this.NumVertices) {
            if (this.mat[v][aux] > 0) {
                return aux;
            }
            aux++;
        }
        System.out.println("Erro: Lista adjacente vazia");
        return -1;
    }

    public void RetiraAresta(int V1, int V2) {
        if (this.mat[V1][V2] == 0) {
            System.out.println("Nao existe aresta");
        } else {
            this.mat[V1][V2] = 0;
        }
    }

    public void ImprimeGrafo() {
        short i, j;
        System.out.println("\n\t\t Matriz de adjcencia do grafo: \n\n");
        System.out.println(" ");

        for (i = 1; i <= this.getNumVertices(); i++) {
            System.out.println("   " + i);
        }
        System.out.println("");
        for (i = 1; i <= this.getNumVertices(); i++) {
            System.out.println(i);
            for (j = 1; j <= this.getNumVertices(); j++) {
                System.out.println(this.getMat()[i][j]);
                System.out.println("");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public void CarregaArquivo(String nome){
        try {
            FileReader arquivo = new FileReader(nome);
            BufferedReader lerArquivo = new BufferedReader(arquivo);

            int numArestas, numVertices;
            int ori, dest;
            float peso;
            String linha;

            System.out.println("Arquivo aberto");
            linha = lerArquivo.readLine();
            numVertices = Integer.parseInt(linha);
            linha = lerArquivo.readLine();
            numArestas = Integer.parseInt(linha);
            System.out.println(numVertices + " " + numArestas);
            this.setNumVertices(numVertices);
            this.setNumArestas(numArestas);
            linha = lerArquivo.readLine();

            while (linha != null) {
                ori = Integer.parseInt(linha);
                
                linha = lerArquivo.readLine();
                peso = Float.parseFloat(linha);
                
                linha = lerArquivo.readLine();
                dest = Integer.parseInt(linha);
                
                this.InsereAresta(ori, peso, dest);
                linha = lerArquivo.readLine();
            }
        arquivo.close();
        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n",
                    e.getMessage());
        }

    }
}
