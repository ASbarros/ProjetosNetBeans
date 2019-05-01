/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author Anderson
 */
public class Impostos {
    
    public static double DeduzirImposto(CLT objCLT){
        return objCLT.CalcFundoGarantia() - objCLT.CalcIR(10);
    }
    public static double AdicionarObrigatorio(HomeOffice obj){
        obj.ImprimirDados();
        return obj.Addcustos(8, 12);
    }
}
