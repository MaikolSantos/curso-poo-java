package Reuniao;
public class Reuniao {
    int cargaHoraria;
    String tipoReuniao;
    int assistencia;
    
    void linha(){
        System.out.println("---------------------");
    }
    
    void status(){
        System.out.println("Carga Horária: " + this.cargaHoraria);
        System.out.println("Tipo de Reunião: " + this.tipoReuniao);
        System.out.println("Assitência: " + this.assistencia);
    }
    
    void ler(){
        System.out.println("Lendo...");
    }
}
