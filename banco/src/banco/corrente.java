
package banco;

import com.sun.org.apache.regexp.internal.recompile;
import javax.swing.JOptionPane;


public  class corrente extends conta {
    private double valorTarifa;

    public double getValorTarifa() {
        return valorTarifa;
    }

    public void setValorTarifa(double valorTarifa) {
        this.valorTarifa = valorTarifa;
    }
    
    public void retirar(double valorRetirado){
        retirada(valorRetirado);
        double Saldo = consultaSaldo();
        tela.ExibirMensagem("O saldo existente na conta é: " + Saldo);
    }
    
    public void consutSaldo(){
        double Saldo = consultaSaldo();
        tela.ExibirMensagem("Conta Corrente - Saldo: " + Saldo);
    }
    
    public void debitarTarifa(){
        retirada(valorTarifa);
       
    }
   
}