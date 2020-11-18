package aula10;

public class Aula10 {
   
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        
        p1.setNome("Maikol");
        p2.setNome("Fernanda");
        p3.setNome("David");
        p4.setNome("July");
        
        p2.setCurso("Informática");
        p3.setSalario(2500.75f);
        p4.setSetor("Estoque");
        
        
        p1.detalhes();
        p2.detalhes();
        p3.detalhes();
        p4.detalhes();
        
    
    
    
    }
    
}
