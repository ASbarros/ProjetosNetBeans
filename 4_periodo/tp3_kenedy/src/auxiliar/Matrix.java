package auxiliar;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anderson
 */
public class Matrix {
    private final static int TAM = 4;

    public static int getTAM() {
        return TAM;
    }
    public static float Check(float value) {
        if(value > -0.0001 && value < 0.00009 )
            return 0;
        else
            return value;
    }
    
    
    public static void Fill(float[][] mat){
        //preenchendo todos os valores da matriz com zero...
        for (int i = 0; i < TAM+1; i++) {
            for (int j = 0; j < TAM + 2; j++) {
                mat[i][j] = 0;
            }
        }
        
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a matriz aumentada");
        for (int i = 1; i < TAM+1; i++) {
            for (int j = 1; j < TAM + 2; j++) {
                System.out.println("Digite elemento " + (i) + "X" + (j));
                mat[i][j] = ler.nextFloat();
            }
        }
    }
    public static void PrintOutVector(float[] vector){
        for (int i = 1; i <= Matrix.getTAM(); i++) {
            System.out.println("x" + i + " " + Matrix.Check(vector[i]));
        }
    }
    public static void PrintOutMatrix(float[][] vector){
        for (int i = 1; i < TAM+1; i++) {
            String linha = "";
            for (int j = 1; j < TAM + 2; j++) {
                linha  += Float.toString(vector[i][j]) + "  ";
            }
            System.out.println(linha);
        }
    }
    public static void MetodoGauss(float[][] matriz) {
        float pivo = 0;

        for (int k = 1; k < Matrix.getTAM(); k++) {
            for (int i = k + 1; i < Matrix.getTAM()+1; i++) {
                pivo = (matriz[i][k] / matriz[k][k]);
                for (int j = k; j < Matrix.getTAM() + 2; j++) {
                    matriz[i][j] = matriz[i][j] - pivo * matriz[k][j];
                }
            }
        }
        
        //calculando os resultados...
        float somatorio = 0;
        float[] Resposta = new float[Matrix.getTAM() + 1];

        
        for (int i = Matrix.getTAM(); i >= 1; i--) {
            somatorio = 0;
            for (int j = i + 1; j <= Matrix.getTAM(); j++) {
                somatorio += matriz[i][j] * Resposta[j];
            }
            Resposta[i] = (((matriz[i][Matrix.getTAM()+1]) - somatorio) / matriz[i][i]);
        }
        Matrix.PrintOutVector(Resposta);
    }

}
