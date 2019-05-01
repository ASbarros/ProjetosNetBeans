package projeto_pessoa;

public class Classe_Pessoa {
    private int codigo;
    private String nome;
    private boolean ativo;
    
    public void setnome(String pnome){
        nome = pnome;
    }
    public String getnome(){
        return nome;
    }
    public void setcodigo(int pcodigo){
        if(pcodigo > 0)
            codigo = pcodigo;
        else 
            System.out.println("codigo invalido!");
    }
    public int getcodigo(){
        return codigo;
    }
    public void setativo(boolean pativo){
        ativo = pativo;
    }
    public boolean getativo(){
        return ativo;
    }
    
    
}
