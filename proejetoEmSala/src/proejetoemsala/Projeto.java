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
public class Projeto {
    private int Codigo;
    private String Nome;
    private String Descricao;
    private String Complexidade;
    private Categoria Possui;
    private ArrayList<Pessoa> Trabalha;
    private String TodasPessoas;
    
    public Projeto(int cod, String pnome, String desc,int comp, Categoria a){
        Trabalha = new ArrayList<>();
        setCodigo(cod);
        setNome(pnome);
        setDescricao(desc);
        if(setComplexidade(comp)){
            Tela.ExibirMensagem("Falha na escolha da complexidade");
            return;
        }
        setPossui(a);
        
    }

    public Categoria getPossui() {
        return Possui;
    }

    public void setTodasPessoas(String T) {
        TodasPessoas = " ";
    }
    
    public void setTS(String n){
        TodasPessoas = TodasPessoas + n + " ";
    }
    public String getTODAS(){
        return TodasPessoas;
    }

    
    public ArrayList<Pessoa> getTrabalha() {
        return Trabalha;
    }

    public void setPossui(Categoria Possui) {
        this.Possui = Possui;
    }

    public void AddPessoa (Pessoa pessoa) {
        Trabalha.add(pessoa);
        setTS(pessoa.getNome() + " ");
    }
    

    public int getCodigo() {
        return Codigo;
    }

    public String getNome() {
        return Nome;
    }

    public String getDescricao() {
        return Descricao;
    }

    public String getComplexidade() {
        return Complexidade;
    }
    
    public boolean setComplexidade(int comp){
        if(comp == 1){
            Complexidade = "Baixa";
            return false;
        }
        if(comp == 2){
            Complexidade = "Media";
            return false;
        }
        if(comp == 3){
            Complexidade = "Alta";
            return false;
        }
        return true;
    } 

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setDescricao(String D) {
        Descricao = D;
    }

    public void setTrabalha(Pessoa T) {
        Trabalha.add(T);
    }
    
    
    
    public void ImprimirProjeto(Projeto zeta){
            System.out.println("Codigo----Nome------descrição--------Complexidade-----Pessoas\n" + zeta.getCodigo()+ "       " + zeta.getNome() + "    " + zeta.getDescricao() + "      " + zeta.getComplexidade() + "    " + zeta.getTODAS());
     
    }
}
