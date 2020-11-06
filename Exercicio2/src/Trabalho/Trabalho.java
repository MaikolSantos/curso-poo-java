package Trabalho;
public class Trabalho {
    int jornada;
    String nomeEmpresa;
    String tipoServico;
    
    void linha(){
        System.out.println("--------------------------");
    }
    
    void status(){
        System.out.println("Minutos ainda para cumprir: " + this.jornada);
        System.out.println("Nome da Empresa: " + this.nomeEmpresa);
        System.out.println("Tipo de Serviço Fornecido: " + this.tipoServico);
    }
    
    void imprimir(){
        if (this.jornada == 0) {
            System.out.println("Você não pode imprimir. Acabou sua jornada de trabalho!");
        } else {
            System.out.println("Imprimindo...");
        }
    }
}
