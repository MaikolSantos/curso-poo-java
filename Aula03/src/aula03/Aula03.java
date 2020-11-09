package aula03;
public class Aula03 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "Bic Cristal";
        c1.cor = "Preta";
        // c1.ponta = 0.5f; //Ocorre erro, pois o atributo é privado
        c1.carga = 10; /*protegido, porém por estar dentro de uma classe que
        utiliza a classe Caneta(), é possível a alteração*/
        c1.destampar();
        
        c1.status();
        
    }
    
}
