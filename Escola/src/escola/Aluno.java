
package escola;

import java.util.ArrayList;

public class Aluno {
    private String Matricula;
    private String Nome;
    private int Periodo;
    private int QtdeFaltas;
    private int MediaAprovacao;
    private int QtdeNotas;
    private ArrayList<Double> Notas;
    
    //metodo construtor...
    public Aluno(){
        setMatricula("");
        setNome("");
        setPeriodo(1);
        setMediaAprovacao(60);
        QtdeFaltas = 0;
        QtdeNotas = 0;
        Notas = new ArrayList<Double>();
        
    }
    
    public String getMatricula(){
        return Matricula;
    }
    public void setMatricula(String matri){
        Matricula = matri;
    }
    public String getNome(){
        return Nome;
    }
    public void setNome(String n){
        Nome = n;
    }
    public int getPeriodo(){
        return Periodo;
    }
    public void setPeriodo(int p){
        Periodo = p;
    }
    public int getQtdeFaltas(){
        return QtdeFaltas;
    }
    public int getMediaAprovacao(){
        return MediaAprovacao;
    }
    public void setMediaAprovacao(int m){
        if((m>=40) && (m<80))
            MediaAprovacao = m;
    }
    public int getQtdeNotas(){
        return QtdeNotas;
    }
    public void recebeFalta(){
        QtdeFaltas = QtdeFaltas +2;
    }
    public void addNota(double n){
        if((n<30) && (calcNotaFinal() + n <= 100)){
        Notas.add(n);   
        QtdeNotas++;
        }
    }
    public double getNota(int num){
        return Notas.get(num);
    }
    public double calcNotaFinal(){
        double aux = 0;
        for(int i=0;i<Notas.size();i++){
            aux = aux + Notas.get(i);
        }
        return aux;
    }
    public double calcMedia(){
        double aux;
        aux = calcNotaFinal()/Notas.size();
        return aux;
    }
    public boolean eAprovado(){
        
        if( (calcMedia() >= getMediaAprovacao() )&& (getQtdeFaltas()<10) ){
            if(Notas.size() < 4)
                tela.ExibirMensagem("Quantidade de avaliações menores que 4");
            return true;
        }
        else
            return false;
    }
    public int TotalDeProva(){
        return Notas.size();
    }
    
    
    
}
