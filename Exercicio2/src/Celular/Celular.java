package Celular;
public class Celular {
    boolean smart;
    float tamanho;
    String cor;
    int bateria;
    
    void status(){
        System.out.println("É smart? " + this.smart);
        System.out.println("Qual tamanho? " + this.tamanho);
        System.out.println("Qual a cor? " + this.cor);
        System.out.println("Qual a carga de bateria? " + this.bateria);
    }
    
    void ligar(){
        if (this.bateria > 5) {
            System.out.println("Ligando...");
        } else{
            System.out.println("Impossível Ligar! Pouca Bateria " + this.bateria + "%");
        }
    }
    
    void mandarMensagem(){
        if (this.bateria > 2){
            System.out.println("Mandando mensagem...");
        } else{
            System.out.println("Imposível Mandar Mensagem! Pouca Bateria " + this.bateria + "%");
        }
    }
    
    void baixarApp(){
        if (this.smart == true) {
            System.out.println("Baixando App...");
        } else {
            System.out.println("Esse aparelho não suporta esse tipo de Aplicação");
        }
    }
    
    void linha(){
        System.out.println("------------------------");
    }
}
