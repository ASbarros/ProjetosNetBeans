/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faculdade;

/**
 *
 * @author Anderson
 */
public class Disciplina {
    private Professor ministrada;
    private String nome;
    
    public Disciplina(String pnome){
        nome = pnome;
    }
    public String getNome(){
        return nome;
    }
    public Professor getMinistrada(){
        return ministrada;
    }
    public void setMinistrada(Professor prof){
        prof.addDisciplina(this);
    }
    
}
