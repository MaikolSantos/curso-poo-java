package Trabalho;
public class Main {
    public static void main(String[] args) {
        Trabalho t1 = new Trabalho();
        t1.jornada = 0;
        t1.nomeEmpresa = "Health Home Care";
        t1.tipoServico = "Faturamento";
        
        t1.status();
        t1.linha();
        t1.imprimir();
    }
}
