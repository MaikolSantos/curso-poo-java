package aula14;
public class Aula14 {

    public static void main(String[] args) {
       Video v[] = new Video[3];
       v[0] = new Video("Aula 1 de POO");
       v[1] = new Video("Aula 1 de POO PHP");
       v[2] = new Video("Aula 1 de POO JAVA");
       
       Gafanhoto g[] = new Gafanhoto[2];
       g[0] = new Gafanhoto("Maikol", 27, "M", "Maik");
       g[1] = new Gafanhoto("Fernanda", 32, "F", "Fer");
       
       Visualizacao vi = new Visualizacao(g[0], v[0]);
        
        System.out.println(v[0].toString());
        System.out.println(g[0].toString());
       
        System.out.println(vi.toString());
        vi.avaliar(10);
        
        System.out.println(v[0].toString());
        System.out.println(g[0].toString());
        
        
    }
}
