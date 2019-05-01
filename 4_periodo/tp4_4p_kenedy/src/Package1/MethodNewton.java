/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package1;

import java.util.Scanner;

/**
 *
 * @author Anderson
 */
public class MethodNewton {

    private static int TAM = 3;

    public static int getTAM() {
        return TAM;
    }

    protected static void setTAM(int TAM) {
        MethodNewton.TAM = TAM;
    }

    public static void Fill(float[][] matrix) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < getTAM() + 1; j++) {
                System.out.println("Digite o termo da posiçao " + i + "X" + j + " :");
                matrix[i][j] = scan.nextFloat();
            }
        }
    }

    public static float[][] Calc(float[][] matrix) {
        //funcao para calcular a matriz das ordens...
        float[][] aux = new float[getTAM() + 1][getTAM() + 1];
        for (int i = 0; i < getTAM() + 1; i++) {
            for (int j = 0; j < getTAM() + 1; j++) {
                if (j == 0) {
                    aux[i][0] = matrix[1][i];
                } else {
                    if (j == i || i > j) {
                        aux[i][j] = (aux[i][j - 1] - aux[i - 1][j - 1]) / (matrix[0][i] - matrix[0][i - j]);
                    }
                }
            }
        }
        return aux;
    }

    public static double Formula(float[][] matrix, float[][] aux, double x) {
        double somatorio, produtorio = 1;
        somatorio = aux[1][0];

        for (int i = 1; i <= getTAM(); i++) {
            //resolvendo o produtorio...
            for (int j = 0; j < i; j++) {
                produtorio = produtorio * (x - aux[0][j]);
            }
            somatorio = somatorio + (produtorio * matrix[i][i]);
            produtorio = 1;
        }
        return somatorio;
    }
}
