package Desodorante;
public class Main {
    public static void main(String[] args) {
        Desodorante d1 = new Desodorante();
        d1.nome = "Dove";
        d1.tipo = "Spray";
        d1.qtd = 0;
        
        d1.status();
        d1.linha();
        d1.passar();
    }
    
}
