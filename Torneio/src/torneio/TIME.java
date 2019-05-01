/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torneio;

import java.util.ArrayList;

/**
 *
 * @author Anderson
 */
public class TIME {
    private String Nome;
    private int TotalDeJogos;
    private int TotalDeGols;
    private int Vitorias;
    private int Empates;
    private int Derrotas;
    private int TotalDePontos;
    private int GolsMarcados;
    private int GolsSofridos;
    private int SaldoDeGols;
    private ArrayList<String> Enfrentados ;
    
    
    //construtor padrão, sem parametros...
    public TIME(){
        setNome("");
        TotalDeJogos = 0;
        TotalDeGols = 0;
        Vitorias = 0;
        Empates = 0;
        Derrotas = 0;
        TotalDePontos = 0;
        GolsMarcados = 0;
        GolsSofridos = 0;
        SaldoDeGols = 0;
        Enfrentados = new ArrayList<>();
        setEnfrentados("");
    }
    
    //construtor com um parametro do nome...
    public TIME(String pnome){
        setNome(pnome);
        TotalDeJogos = 0;
        TotalDeGols = 0;
        Vitorias = 0;
        Empates = 0;
        Derrotas = 0;
        TotalDePontos = 0;
        GolsMarcados = 0;
        GolsSofridos = 0;
        SaldoDeGols = 0;
        Enfrentados = new ArrayList<>();
        setEnfrentados("");
    }

    public String getEnfrentados(int i) {
        return Enfrentados.get(i);
    }

    public void setEnfrentados(String Enfre) {
        Enfrentados.add(Enfre);
    }
    public int getTamanhoEnfrentados(){
        return Enfrentados.size();
    }
    
    public void setNome(String pnome){
        Nome = pnome;
    }

    public String getNome() {
        return Nome;
    }
    public int getTotalDeJogos(){
        return TotalDeJogos;
    }
    public void setTotalDeJogos(int total){
        TotalDeJogos = TotalDeJogos + total;
    }

    public int getTotalDeGols() {
        return TotalDeGols;
    }

    public int getVitorias() {
        return Vitorias;
    }

    public int getEmpates() {
        return Empates;
    }

    public int getDerrotas() {
        return Derrotas;
    }

    public int getTotalDePontos() {
        return TotalDePontos;
    }

    public int getGolsMarcados() {
        return GolsMarcados;
    }

    public int getGolsSofridos() {
        return GolsSofridos;
    }

    public int getSaldoDeGols() {
        return SaldoDeGols;
    }

    public void setTotalDeGols(int TotalDe) {
        TotalDeGols = TotalDeGols + TotalDe;
    }

    public void setVitorias(int Vito) {
        Vitorias = Vitorias + Vito;
    }

    public void setEmpates(int Empa) {
        Empates = Empates + Empa;
    }

    public void setDerrotas(int Der) {
        Derrotas = Derrotas + Der;
    }

    public void setTotalDePontos(int TotalDeP) {
        TotalDePontos = TotalDePontos + TotalDeP;
    }

    public void setGolsMarcados(int GolsM) {
        GolsMarcados = GolsMarcados + GolsM;
    }

    public void setGolsSofridos(int GolsSo) {
        GolsSofridos = GolsSofridos + GolsSo;
    }

    public void setSaldoDeGols(int SaldoDe) {
        SaldoDeGols = SaldoDe;
    }
    
    
}
