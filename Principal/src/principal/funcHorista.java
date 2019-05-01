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
public class funcHorista extends Funcionario{
    private double ValorHora;

    public double getValorHora() {
        return ValorHora;
    }

    public void setValorHora(double ValorHora) {
        this.ValorHora = ValorHora;
    }
    

    @Override
    public double Calcsalario() {
        
        return getCargaHoraria()*getValorHora();
    }
    public funcHorista(int c, String n, double carga, double v){
        super(c, n, carga);
        setValorHora(v);
    }
    
}
