
package banco;

public class poupanca extends conta{
    
    public double rendimento(int dias, double porcentual){
        double Rend = consultaSaldo();
        for(int i=0; i < dias; i++){
            Rend =+ Rend*(porcentual/100);
        }
        
        //double aux = consultaSaldo();
        //aux = Rend - aux;
        return Rend;
    }
 
    public void consutSaldo(){
        double Saldo = consultaSaldo();
        tela.ExibirMensagem("Conta Poupança - Saldo: " + Saldo);
    }
}
