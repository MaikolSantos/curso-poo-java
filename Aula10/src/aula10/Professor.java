package aula10;
public class Professor extends Pessoa{
    private String especialidade;
    private float salario;

    public void receberAum(int porc){
        this.setSalario(this.getSalario() * (1 + (porc / 100)));
    }
    
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
    
}
