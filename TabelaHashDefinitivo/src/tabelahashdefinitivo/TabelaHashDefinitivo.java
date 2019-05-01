/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabelahashdefinitivo;

/**
 *
 * @author Anderson
 */
public class TabelaHashDefinitivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int tamanho = 10;
        Pessoa[] v = new Pessoa[tamanho];
        for(int i =0; i<tamanho;i++){
            v[i] = new Pessoa(" ", i, "10");
        }
        Auxiliar.CalcHashIncerir(v, 1000);
        Auxiliar.CalcHashBuscar(v, 4);
    }
    
}
