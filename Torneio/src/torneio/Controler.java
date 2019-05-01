/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torneio;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Anderson
 */

public class Controler{
    
    public static void GerarJogo(TIME obj1, TIME obj2){
        Random rand = new Random();
        int x = rand.nextInt(5);
        int y = rand.nextInt(5);
        obj1.setGolsMarcados(x);
        obj1.setTotalDeGols(x);
        obj1.setGolsSofridos(y);
        obj1.setSaldoDeGols(obj1.getGolsMarcados() - obj1.getGolsSofridos());
        obj1.setTotalDeJogos(1);
        obj1.setEnfrentados(obj2.getNome());
        
        obj2.setGolsMarcados(y);
        obj2.setTotalDeGols(y);
        obj2.setGolsSofridos(x);
        obj2.setSaldoDeGols(obj2.getGolsMarcados() - obj2.getGolsSofridos());
        obj2.setTotalDeJogos(1);
        obj2.setEnfrentados(obj1.getNome());
        
        if(x > y){
            obj1.setVitorias(1);
            obj2.setDerrotas(1);
            tela.ExibirMensagem("Time : " + obj1.getNome() + " ganhou");
            tela.ExibirMensagem(obj1.getNome() + " " + x + " X " + y + " " + obj2.getNome());
            obj1.setTotalDePontos(3);
        } 
        else if(x < y){
            obj1.setDerrotas(1);
            obj2.setVitorias(1);
            tela.ExibirMensagem("Time : " + obj2.getNome() + " ganhou");
            tela.ExibirMensagem(obj1.getNome() + " " + x + " X " + y + " " + obj2.getNome());
            obj2.setTotalDePontos(3);

        }
        else{
            obj1.setEmpates(1);
            obj2.setEmpates(1);
            tela.ExibirMensagem("O jogo ficou empatado");
            tela.ExibirMensagem(obj1.getNome() + " " + x + " X " + y + " " + obj2.getNome());
            obj1.setTotalDePontos(1);
            obj2.setTotalDePontos(1);
        }
    }
    
    public static void ImprimirTabela(ArrayList<TIME> lista){
        System.out.println("Nome do time--Total de jogos--Vitorias--Empates--Derrotas--Total de pontos--Gols marcados--Gols sofridos--Saldo de gols");
        for(int i=0;i<lista.size();i++){
            System.out.println(lista.get(i).getNome() + "               " + lista.get(i).getTotalDeJogos() + "               " + lista.get(i).getVitorias() + "         " + lista.get(i).getEmpates() + "          " + lista.get(i).getDerrotas() + "           " + lista.get(i).getTotalDePontos() + "             " + lista.get(i).getGolsMarcados() + "               " + lista.get(i).getGolsSofridos() + "            " + lista.get(i).getSaldoDeGols());
        }
    }
}
