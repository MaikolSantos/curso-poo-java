package aula05;
public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    //Métodos Personalizados 
     public void status(){
        System.out.println("Número: " + getNumConta());
        System.out.println("Tipo: " + getTipo());
        System.out.println("Dono: " + getDono());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Status: " + getStatus());
    }
     
    public void abrirConta(String tipo){
        this.setTipo(tipo);
        this.setStatus(true);
        if (this.tipo == "CC") {
            this.setSaldo(50);
        } else if (this.tipo == "CP") {
            this.setSaldo(150);
        }
        System.out.println("Conta Aberta");
     }
    
    public void sacar(float valor){
        if (this.status == true) {
            if (this.saldo < valor) {
                System.out.println("Saque: Saldo Insuficiente");
            } else if (this.saldo >= valor) {
                this.setSaldo(getSaldo() - valor);
            System.out.println("Saque: " + valor);
            }
        } else{
            System.out.println("Conta Encerrada!");
        }    
    }
    
    public void fecharConta(){
        if (this.saldo < 0) {
            System.out.println("Saldo Negativo. Conta não encerrada. Saldo:" + getSaldo());
        } else if (this.saldo > 0) {
            System.out.println("Conta encerrada com saque de: " + getSaldo());
            this.sacar(getSaldo());
            this.setSaldo(0);
            this.setStatus(false);
        } else {
            this.setStatus(false);
            System.out.println("Conta Encerrada!");
        }
    }
    
    public void depositar(float valor){
        if (this.status == true) { 
            this.saldo = this.saldo + valor; //poderia usar setSaldo(getSaldo() + valor)
        }else{
            System.out.println("Conta Encerrada!");
        }        
    }
    
    public void pagarMensalidade(){
        if (this.status == true) { 
            if (this.tipo == "CC") {
                this.saldo = this.saldo - 12;
            } else{
                this.saldo = this.saldo - 20;
            }
        } else{
            System.out.println("Conta Encerrada!");
        }  
    }
    
     //Métodos Especiais
    public ContaBanco(){
        this.setStatus(false);
        this.setSaldo(0);
    }
    
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
