/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tabelahashdefinitivo;

/**
 *
 * @author Geraldo, Mateus, Anderson e Igor
 */
public class Pessoa {
    private String Nome;
    private int CPF;
    private String Nascimento;
    Pessoa(String n, int cpf, String data){
        setNome(n);
        setCPF(cpf);
        setNascimento(data);
        
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public void setNascimento(String Nascimento) {
        this.Nascimento = Nascimento;
    }

    public String getNome() {
        return Nome;
    }

    public int getCPF() {
        return CPF;
    }

    public String getNascimento() {
        return Nascimento;
    }
    
}
