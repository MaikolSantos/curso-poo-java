package aula11;
public class Aluno extends Pessoa{
    private int matr;
    private String curso;
    
    public void candMatric(){
        this.setMatr(0);
        System.out.println("!!! Matrícula Cancelada !!!");
    }
    
    public void pagarMens(){
        System.out.println("Mensalidade do Aluno " + this.nome + " Paga!");
    }
    
    public int getMatr() {
        return matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
}
