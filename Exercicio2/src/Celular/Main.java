package Celular;
public class Main {
    public static void main(String[] args) {
        Celular cel1 = new Celular();
        cel1.smart = true;
        cel1.tamanho = 0.8f;
        cel1.cor = "Prata";
        cel1.bateria = 3;
        
        cel1.status();
        cel1.linha();
        
        cel1.ligar();
        cel1.mandarMensagem();
        cel1.baixarApp();
        cel1.linha();
    }
    
}
