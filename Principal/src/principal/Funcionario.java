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
public abstract class Funcionario {
    private int Codigo;
    private String Nome;
    private double CargaHoraria;
    public void ImprimirSalario(){
        System.out.println("Funcionario " + Nome + " : Salario = " + Calcsalario());
    }
    
    public Funcionario(int c, String n, double carga){
        setCodigo(c);
        setNome(n);
        setCargaHoraria(carga);
    }
    
    public abstract double Calcsalario();

    public int getCodigo() {
        return Codigo;
    }

    public String getNome() {
        return Nome;
    }

    public double getCargaHoraria() {
        return CargaHoraria;
    }

    public void setCodigo(int codigo) {
        this.Codigo = codigo;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setCargaHoraria(double CargaHoraria) {
        this.CargaHoraria = CargaHoraria;
    }
    
    
}
