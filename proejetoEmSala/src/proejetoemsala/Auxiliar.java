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
public class Auxiliar {

    /**
     *
     * @param nome
     * @param lista
     * @return
     */
    public static int VerificaC(String nome, ArrayList<Categoria> lista){
        for(int i=0;i<lista.size();i++){
                        if(nome.equals(lista.get(i).getNome())){
                           return i; 
                        }
                    }
        return -1;
    }
    public static int VerificaPE(String nome, ArrayList<Pessoa> lista){
        for(int i=0;i<lista.size();i++){
                        if(nome.equals(lista.get(i).getNome())){
                           return i; 
                        }
                    }
        return -1;
    }
    public static int VerificaPR(String nome, ArrayList<Projeto> lista){
        for(int i=0;i<lista.size();i++){
                        if(nome.equals(lista.get(i).getNome())){
                           return i; 
                        }
                    }
        return -1;
    }
}
