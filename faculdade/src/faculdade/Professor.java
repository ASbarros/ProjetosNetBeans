/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faculdade;

import java.util.ArrayList;
import javax.print.DocFlavor;

/**
 *
 * @author Anderson
 */
public class Professor {
    private ArrayList<Disciplina> Leciona;
    private String nome;
    public Professor(Disciplina dis, String pnome){
        Leciona = new ArrayList<Disciplina>();
        Leciona.add(dis);
        addDisciplina(dis);
        nome = pnome;
    }
    public String getNome(){
        return nome;
    }
    public void printDisciplina(){
        for(int i=0;i<Leciona.size();i++){
            System.out.println(Leciona.get(i).getNome());
        }
    }
    public void addDisciplina(Disciplina d){
        Leciona.add(d);
        d.setMinistrada(this);
    }
}
