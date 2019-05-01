package banco;

public class conta {
    private int codigo;
    private String numero;
    private String nome;
    private String data;
    private double saldo;
    
    public conta(){
        setCodigo(0);
        setNumero("0");
        setNome("");
        setData("");
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public String getData() {
        return data;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    
    
    public void retirada(double valor){
            saldo = saldo - valor;
     }
    
    public void deposito(double valor){
        saldo = saldo + valor;
    
    }
    
    public double consultaSaldo(){
        return saldo;
 
    }

}
