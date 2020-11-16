package exercicioaula09;

public class Livro implements Publicacao{
   private String titulo;
   private String autor;
   private int totPag;
   private int pagAtual;
   private boolean aberto;
   private Pessoa leitor;
   
   public Livro(String titulo, String autor, int totPag, int pagAtual, boolean aberto, Pessoa leitor) {
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setTotPag(totPag);
        this.setPagAtual(pagAtual);
        this.setAberto(aberto);
        this.setLeitor(leitor);
    }
   
   public void detalhes(){
       System.out.println("*-*-*-* DETALHES *-*-*-*");
       System.out.println("Titulo: " + this.getTitulo());
       System.out.println("Autor: " + this.getAutor());
       System.out.println("Total de Páginas: " + this.getTotPag());
       System.out.println("Página Atual: " + this.getPagAtual());
       System.out.println("Aberto? " + this.isAberto());
       System.out.println("Leitor: " + this.getLeitor().getNome());
       System.out.println("-------------------------");
   }

    private String getTitulo() {
        return titulo;
    }

    private void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    private String getAutor() {
        return autor;
    }

    private void setAutor(String autor) {
        this.autor = autor;
    }

    private int getTotPag() {
        return totPag;
    }

    private void setTotPag(int totPag) {
        this.totPag = totPag;
    }

    private int getPagAtual() {
        return pagAtual;
    }

    private void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    private boolean isAberto() {
        return aberto;
    }

    private void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    private Pessoa getLeitor() {
        return leitor;
    }

    private void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.setAberto(true);
        System.out.println("O livro está aberto!");
    }

    @Override
    public void fechar() {
        this.setAberto(false);
        System.out.println("O livro está fechado!");
    }

    @Override
    public void folhear() {
        System.out.println("Folheando...");
        for (int i = this.getPagAtual(); i <= this.getTotPag(); i++) {
            System.out.println("Página: " + i);
        }
        System.out.println("Acabaram as páginas.");
    }

    @Override
    public void avancarPag() {
        this.setPagAtual(this.getPagAtual() + 1);
        System.out.println("Estamos na página: " + this.getPagAtual());
    }

    @Override
    public void voltarPag() {
        this.setPagAtual(this.getPagAtual() - 1);
        System.out.println("Voltamos para a página: " + this.getPagAtual());
    }
}
