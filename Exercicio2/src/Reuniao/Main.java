package Reuniao;
public class Main {
    public static void main(String[] args) {
        Reuniao r1 = new Reuniao();
        r1.cargaHoraria = 90;
        r1.tipoReuniao = "A Sentinela";
        r1.assistencia = 102;
        
        r1.status();
        r1.linha();
        r1.ler();
    }
}
