package aula11;

public class Aula11 {
   
    public static void main(String[] args) {
        Visitante v1 = new Visitante();
        v1.setNome("July");
        v1.setIdade(3);
        v1.setSexo("F");
        v1.detalhes();
        
        Aluno a1 = new Aluno();
        a1.setNome("Maikol");
        a1.setIdade(27);
        a1.setSexo("M");
        a1.detalhes();
        a1.pagarMens();
        
        Bolsista b1 = new Bolsista();
        b1.setNome("Fernanda");
        b1.setIdade(32);
        b1.setSexo("F");
        b1.detalhes();
        b1.pagarMens();
        
    
    
    
    }
    
}
