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
public class pessoa {
    private int codigo;
    private String nome;
    
    
    public void setnome(String fnome){
        nome=fnome;
    }
    public String getnome(){
        return nome;
    }
    public void setcodigo(int fcodigo){
        codigo=fcodigo;
    }
    public int getcodigo(){
        return codigo;
    }
    public void imprimir(){
        System.out.println("nome:"+nome + "  codigo "+codigo);
    }
    
    
    
}

