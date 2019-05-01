
package banco;

public class Banco {

    public static void main(String[] args) {
        
        corrente C = new corrente();
        
        tela.ExibirMensagem("Abrir conta Corrente!");
        C.setCodigo(tela.LerInteiro("Digite o Agencia: "));
        C.setNumero(tela.LerMensagem("Digite o Numero d aconta: "));
        C.setNome(tela.LerMensagem("Digite o Nome titula da conta: "));
        C.setData(tela.LerMensagem("Digite a data de Abertura da conta: "));
                
        
        poupanca P = new poupanca();
        
        tela.ExibirMensagem("Abrir conta Poupança!");
        P.setCodigo(tela.LerInteiro("Digite o Agencia: "));
        P.setNumero(tela.LerMensagem("Digite o Numero d aconta: "));
        P.setNome(tela.LerMensagem("Digite o Nome titula da conta: "));
        P.setData(tela.LerMensagem("Digite a data de Abertura da conta: "));
        
        
        C.deposito(tela.LerNumeroReal("Digite o valor que deseja deposita na conta Corrente: "));
        P.deposito(tela.LerNumeroReal("Digite o valor que deseja deposita na conta Poupança: "));
        C.consutSaldo();
        P.consutSaldo();
        P.retirada(tela.LerNumeroReal("Qual valor deseja retira na poupança: "));
        P.deposito(tela.LerNumeroReal("Digite o valor que deseja deposita na conta Poupança: "));
        C.consutSaldo();
        P.consutSaldo();
        C.setValorTarifa(tela.LerNumeroReal("Qual valor da tarifa da conta Corrente: "));
        C.debitarTarifa();
        P.rendimento(tela.LerInteiro("Quantos dias o dinheiro ficou na poupança: "), tela.LerNumeroReal("Qual porcentagem de redimento por dia: "));
        P.deposito(tela.LerNumeroReal("Qual foi o redimento durante 30 dia direto: "));                                                                                                                                                                 P.deposito(4.33);
        C.consutSaldo();
        P.consutSaldo();
    }
    
}

