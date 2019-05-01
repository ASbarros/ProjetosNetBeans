/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auxiliar;

import java.io.*;

/**
 *
 * @author Anderson
 */
public class Leitura {
    private StringBuffer stringbuffer = null;

    public Leitura(String pathFile) {
        this.Carrega(new File(pathFile));
    }
    
    private void Carrega(File arquivo){
        stringbuffer = new StringBuffer();
    }
        
}
