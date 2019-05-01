/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sala;

/**
 *
 * @author Anderson
 */
public class pessoafisica extends {
    private String CPF;
    private String RG;
    private int ano_de_nascimento;
    
    public void setcpf(String nome){
        CPF = nome;
    }
    public String getrg(){
        return RG;
    }
    public void setrg(String nome){
        RG = nome;
    }
    public String getcpf(){
        return CPF;
    }
    
    public int ver_idade(){
        return 2018 - ano_de_nascimento;
    }
    public void imprimir_doc(){
        System.out.println("RG:" + RG + "CPF" + CPF);
    }
}
