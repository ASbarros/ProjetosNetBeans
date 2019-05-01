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
public class FuncMensalista extends Funcionario implements CLT{

    private double SalarioBase;
    
    public FuncMensalista(int c, String n, double carga, double v){
        super(c, n, carga);
        setSalarioBase(v);
    }
    
    @Override
    public double Calcsalario() {
        return SalarioBase;
    }

    public double getSalarioBase() {
        return SalarioBase;
    }

    public void setSalarioBase(double Base) {
        this.SalarioBase = Base;
    }

    @Override
    public double CalcINSS() {
        return SalarioBase*0.09;
    }

    @Override
    public double CalcFundoGarantia() {
        if(SalarioBase > 1000)
            return SalarioBase * 0.12;
        else
            return 1000;
    }

    @Override
    public double CalcIR(double Aliquota) {
        return (SalarioBase - CalcINSS()) * (Aliquota/100);
    }

    
}
