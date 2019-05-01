/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabelahashdefinitivo;

/**
 *
 * @author Anderson
 */
public class Auxiliar {
    private static int Hash(int valor,int tamanho){
        return ((valor*valor)*7)%tamanho;
    }
    
    public static boolean CalcHashIncerir(Pessoa[] v, int valor){
        int posicao = Hash(valor, v.length);
        return Incerir(v, valor, posicao, 0);
    }
    public static boolean CalcHashRemover(Pessoa[] v, int valor){
        int posicao = Hash(valor, v.length);
        return remover(v, valor, posicao, 0);
    }
    public static int CalcHashBuscar(Pessoa[] v, int valor){
        int posicao = Hash(valor, v.length);
        return Buscar(v, valor, posicao, 0);
    }
    private static boolean Incerir(Pessoa[] v, int va, int posicao, int tentativa){
        if(tentativa != v.length){
            if(v[posicao] == null){//verifica se aquela posiçao esta ocupada
                v[posicao].setCPF(va);//se nao estiver, inseri...

                System.out.println("valor :" + va + " na posicao :" + posicao);
                return true;//elemento inserido...
            }
            if(v[posicao].getCPF() == va){
                System.out.println("valor ja existe");
                return false;
            }
            else{
                if(posicao == v.length -1){//se for o ultimo posicao se vetor, tento incerir no inicio...
                    tentativa++;
                    return Incerir(v, va, 0, tentativa);
                }
                else{
                    tentativa++;
                    return Incerir(v, va, posicao +1, tentativa);//vou incerir na proxima posicao...
                }
            }
        }
        return false;//vetor esta cheio...
    }
    private static boolean remover(Pessoa[] v, int va, int posicao, int tentativa){
        if(tentativa != v.length){
            if(v[posicao] != null){//verifica se aquela posiçao esta ocupada
                if(v[posicao].getCPF() == va){
                    v[posicao] = null;
                    return true;//o elemento foi removido...
                }
                else{
                    if(posicao == v.length-1){
                        tentativa++;
                        return remover(v, va, 0, tentativa);//OU remover(v, va, 0, tentativa +1);
                    }
                    else{
                        tentativa++;
                        return remover(v, va, posicao +1, tentativa);//OU remover(v, va, posicao +1, tentativa +1);
                    }
                }
            }
            return false;//elemento nao encontrado
        }
        return false;//elemento nao encontrado
    }
   
    private static int Buscar(Pessoa[] v, int valor, int posicao, int tentativa){
        if(tentativa != v.length){
            if(v[posicao] == null){
                System.out.println("CPF nao encotrado");
                return -1;
            }
            else if(v[posicao].getCPF() == valor){
                System.out.println("CPF encontrado");
                return posicao;
            }
            else{
                if(posicao == v.length -1)
                    return Buscar(v, valor, 0, tentativa +1);
                else
                    return Buscar(v, valor, posicao +1, tentativa +1);
            }
            
        } 
        System.out.println("CPF nao encontrado");
        return -1;
    }
}
