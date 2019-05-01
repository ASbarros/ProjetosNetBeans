
package torneio;

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
