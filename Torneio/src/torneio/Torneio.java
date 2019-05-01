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
public class Torneio {
    /**
     * @param args the command line arguments
     */ 
    public static void main(String[] args) {
        int x;//variavel para opcão de escolha
        boolean verifica = false;//para ver se o time ja esta listado
        
        ArrayList<TIME> lista = new ArrayList<>();
        
        do{
        x = tela.LerInteiro("Para inserir um novo time : digite 1 \nPara simular jogos : digite 2 \nPara sair : digite 3");
            switch(x){
                case 1://cadastro de times
                    if(lista.size() <= 10){
                        String nome = tela.LerMensagem("Digite o nome do time");
                        for(int i=0;i<lista.size();i++){//verifica se o nome digitado ja esta no lista
                            verifica = nome.equals(lista.get(i).getNome());//retorna verdadeiro se o nome existir
                            if(verifica == true)
                                i = lista.size();//se o nome ja existir na lista, sai do for
                        }
                        if(verifica == false)
                            lista.add(new TIME(nome));
                        else
                            tela.ExibirMensagem("O time ja esta na lista");

                    }else
                        tela.ExibirMensagem("Lista de times está cheia");

                    break;

                case 2://sorteio dos jogos
                    
                    TIME obj1 = null, obj2 = null;
                    boolean existe = false;//para ver se o time existe
                    
                    String time1 = tela.LerMensagem("Digite o primeiro time");
                    for(int i=0;i<lista.size();i++){
                        if(time1.equals(lista.get(i).getNome())){
                            obj1 = lista.get(i);
                            existe = true;
                        }
                    }
                    if(existe == false){
                        tela.ExibirMensagem("Time não encontrado");
                        break;
                    }
                    
                    String time2 = tela.LerMensagem("Digite o segundo time");
                    existe = false;
                    for(int i=0;i<lista.size();i++){
                        if(time2.equals(lista.get(i).getNome())){
                            obj2 = lista.get(i);
                            existe = true;
                        }
                    }
                    if(existe == false){
                        tela.ExibirMensagem("Time não encontrado");
                        break;
                    }
                    existe = false;
                    
                    for(int i=0;i<obj2.getTamanhoEnfrentados();i++){
                        if(time1.equals(obj2.getEnfrentados(i))){
                            tela.ExibirMensagem("Este jogo já foi realizado!Escolha outra dupla de time");
                            existe = true;
                        }
                    }
                    if(existe == true)
                        break;
                    for(int i=0;i<obj1.getTamanhoEnfrentados();i++){
                        if(time2.equals(obj1.getEnfrentados(i))){
                            tela.ExibirMensagem("Este jogo já foi realizado!Escolha outra dupla de time");
                            existe = true;
                        }
                    }
                    if(existe == true)
                        break;
                    Controler.GerarJogo(obj1, obj2);
                    break;
            }
        }while(x != 3);
        
        Controler.ImprimirTabela(lista);
            
    }
} 
    

