package aula13;

public class Aula13 {
    
    public static void main(String[] args) {
        Cachorro c = new Cachorro();
        c.reagir("Toma Comida");
        c.reagir("Vai Apanhar");
        c.reagir(11, 45);
        c.reagir(false);
        c.reagir(17, 4.5f);
    }
    
}
