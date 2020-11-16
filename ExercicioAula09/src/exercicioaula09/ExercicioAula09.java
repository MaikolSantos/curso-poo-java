package exercicioaula09;

public class ExercicioAula09 {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Maikol", 27, "M");
        
        Livro l1 = new Livro("Java", "Guanabara", 200, 197, true, p1);
        
        
        l1.detalhes();
        p1.fazerAniversario();
        l1.folhear();
        l1.avancarPag();
        l1.detalhes();
        
       
        
    }
    
    
    
}
