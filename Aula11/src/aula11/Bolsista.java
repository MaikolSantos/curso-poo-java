package aula11;

public final class Bolsista extends Aluno{
    private int bolsa;
    
    public final void renovarBolsa(){
        System.out.println("Bolsa do Aluno " + this.nome + " Renovada!");
    }
    
    @Override
    public void pagarMens(){
        System.out.println("Mensalidade do bolsista " + this.nome + " Paga!");
    }

    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }
    
}
