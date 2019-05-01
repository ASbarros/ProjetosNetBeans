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
public class Pessoa {
    
    private int Codigo;
    private String Nome;
    private String Cargo;
    private ArrayList<Projeto> Esta;

    public Pessoa(int codigo, String nome, String cargo){
        setCodigo(codigo);
        setCargo(cargo);
        setNome(nome);
        Esta = new ArrayList<>();
    }
    
    public int getCodigo() {
        return Codigo;
    }

    public String getNome() {
        return Nome;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCodigo(int Cod) {
        Codigo = Cod;
    }

    public void setNome(String N) {
        Nome = N;
    }

    public void setCargo(String Car) {
        Cargo = Car;
    }

    public void AddProjeto(Projeto E) {
        Esta.add(E);
    }

    public ArrayList<Projeto> getEsta() {
        return Esta;
    }
    
    
     public void ListarProjeto(Pessoa x){
         System.out.println("Codigo-----Nome------Descrição------Complexidade");
         for (int i = 0; i < x.getEsta().size(); i++) {
             System.out.println(x.getEsta().get(i).getCodigo() + "   " + x.getEsta().get(i).getNome() + "    " + x.getEsta().get(i).getDescricao() + "    " + x.getEsta().get(i).getComplexidade());
         }
    }
    
}
