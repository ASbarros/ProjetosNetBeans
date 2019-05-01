
package escola;

import javax.swing.JOptionPane;

public class tela extends Aluno{
    public static String LerMensagem (String sMSG){
        return JOptionPane.showInputDialog(sMSG);  
    }
    
    public static int LerInteiro (String sMsg){
        String sValor = JOptionPane.showInputDialog(sMsg);
        return Integer.parseInt(sValor);
        
    }
    
    public static double LerNumeroReal (String sMSG){
        String sValor = JOptionPane.showInputDialog(sMSG);
        return Double.parseDouble(sValor);
    }
    
    public static void ExibirMensagem (String sMsg){
        JOptionPane.showMessageDialog(null, sMsg);
    }
    
    public static void ResultadoFinal(Aluno objeto,int num){
        tela.ExibirMensagem("Nome do aluno " + num + " :" + objeto.getNome());
        tela.ExibirMensagem("Matricula do aluno: " + objeto.getMatricula());
        tela.ExibirMensagem("Periodo do aluno: " + objeto.getPeriodo());
        for(int i=0;i<objeto.TotalDeProva();i++){
            tela.ExibirMensagem("Prova " + (i+1) + " nota :"+objeto.getNota(num));
        }
        tela.ExibirMensagem("Faltas do aluno :" + objeto.getQtdeFaltas());
        tela.ExibirMensagem("Nota final do aluno :" + objeto.calcNotaFinal());
        tela.ExibirMensagem("Media do aluno :" + objeto.calcMedia());
        if(objeto.eAprovado())
            tela.ExibirMensagem("APROVADO!");
        else
            tela.ExibirMensagem("REPROVADO!");
                 
    }
    
}
