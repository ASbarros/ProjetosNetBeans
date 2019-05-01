/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabelahash;



/**
 *
 * @author Anderson
 */
public class Hash {
    public static int FuncaoHash(int valor){
        int resultado;
        resultado = (valor * 2)%10;
        return resultado;
    }
    public static void Preencher(int valor, int[] vetor){
        
    }
}
