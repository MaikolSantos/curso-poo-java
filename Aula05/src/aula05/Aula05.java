package aula05;


public class Aula05 {

    public static void main(String[] args) {
        ContaBanco c1 = new ContaBanco();
        
        c1.abrirConta("CP");
        c1.setNumConta(1);
        c1.setDono("Maikol dos Santos");
        //c1.sacar(100);
        c1.depositar(500);
        //c1.pagarMensalidade();
        //c1.fecharConta();
        c1.status();
    }
}