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
public class FuncComissao extends Funcionario implements CLT, HomeOffice{
    
    private double ValorBase;
    private double PercComissao;
    
    public FuncComissao(int c, String n, double carga, double v, double p){
        super(c, n, carga);
        setPercComissao(p);
        setValorBase(v);
    }

    public void setValorBase(double ValorBase) {
        this.ValorBase = ValorBase;
    }

    public void setPercComissao(double PercComissao) {
        this.PercComissao = PercComissao;
    }

    public double getValorBase() {
        return ValorBase;
    }

    public double getPercComissao() {
        return PercComissao;
    }

    @Override
    public double Calcsalario() {
        return ValorBase*(PercComissao/100);
    }
    
    public double Calcsalario(double v, double p){
        return v*(p/100);
    }
    public double Calcsalario(double fixo){
        return fixo + Calcsalario();
    }

    @Override
    public double CalcINSS() {
        return Calcsalario() * 0.07;
    }

    @Override
    public double CalcFundoGarantia() {
        return 0;
    }

    @Override
    public double CalcIR(double Aliquota) {
        return 0;
    }

    @Override
    public double Addcustos(double Horas, double KlwHora) {
        return Horas * KlwHora;
    }

    @Override
    public void ImprimirDados() {
        System.out.println(getNome() + ":" + Calcsalario());
    }
    
    
}
