/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3_kenedy;


import auxiliar.*;
import java.util.Scanner;

/**
 *
 * @author Anderson
 */
public class Tp3_kenedy {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        float[][] MatrizPrin = new float[Matrix.getTAM() + 1][Matrix.getTAM() + 2];
        
        Matrix.Fill(MatrizPrin);
        
        Matrix.MetodoGauss(MatrizPrin);
        
        Matrix.PrintOutMatrix(MatrizPrin);

    }
}
