/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proejetoemsala;

import java.util.ArrayList;

/**
 *
 * @author Anderson
 */
public class Categoria {
    private int Codigo;
    private String Nome;
    private ArrayList<Projeto> Agrupa;
    
    public Categoria(int codigo, String nome){
        Agrupa = new ArrayList<>();
        setCodigo(codigo);
        setNome(nome);
    }
    
    public int getCodigo() {
        return Codigo;
    }

    public String getNome() {
        return Nome;
    }
    
    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public void setNome(String Nome) {
        this.Nome = Nome; 
    }
    
    public void AddProjeto(Projeto a){
        Agrupa.add(a);
    }

    public ArrayList<Projeto> getAgrupa() {
        return Agrupa;
    }
    
    
    public void ListarProjetos(Categoria x){
        System.out.println("Nome dos Projetos\n");
        for(int i=0;i<x.getAgrupa().size();i++){
            System.out.println(x.getAgrupa().get(i).getNome());
        }
    }
}
