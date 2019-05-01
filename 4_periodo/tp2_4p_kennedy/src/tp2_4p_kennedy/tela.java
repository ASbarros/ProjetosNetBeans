/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2_4p_kennedy;

/**
 *
 * @author Anderson
 */
import javax.swing.JOptionPane;

public class tela {
    public static String LerMensagem (String sMSG){
        return JOptionPane.showInputDialog(sMSG);  
    }
    
    public static int LerInteiro (String sMsg){
        String sValor;
        sValor = JOptionPane.showInputDialog(null, sMsg, "Menu",2);
        return Integer.parseInt(sValor);
        
    }
    
    public static double LerNumeroReal (String sMSG){
        String sValor = JOptionPane.showInputDialog(sMSG);
        return Double.parseDouble(sValor);
    }
    
    public static void ExibirMensagem (String sMsg){
        JOptionPane.showMessageDialog(null, sMsg);
    }
    
    
}

