package Desodorante;
public class Desodorante {
    String nome;
    String tipo;
    float qtd;
    
    void linha(){
        System.out.println("-------------------------------");
    }
    
    void status(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Quantidade: " + this.qtd);
    }
    
    void passar(){
        if (this.qtd == 0) {
            System.out.println("Acabou...");
        } else{
            System.out.println("Passando...");
        }
    }
}
