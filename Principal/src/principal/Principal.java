/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.ArrayList;

/**
 *
 * @author Anderson
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Funcionario> Lista = new ArrayList<>();
        funcHorista H = new funcHorista(1, "H", 10, 100);
        FuncMensalista M = new FuncMensalista(2, "M", 40, 2000);
        FuncComissao C = new FuncComissao(3, "C", 0, 5000, 10);
        Lista.add(H);
        Lista.add(M);
        Lista.add(C);
        
        for(int i = 0; i < Lista.size(); i++){
            Lista.get(i).ImprimirSalario();
        }
        
        System.out.println("calcSalario_versao 1->" + C.Calcsalario());
        System.out.println("calcSalario_versao 2->" + ((FuncComissao)C).Calcsalario(1000, 5));
        System.out.println("calcSalario_versao 3->" + ((FuncComissao)C).Calcsalario(1200));
        
        Impostos.DeduzirImposto(M);
        Impostos.AdicionarObrigatorio(C);

    }
}
