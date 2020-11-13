package UltraEmojiCombat;

import java.util.Random;

public class Luta {
    Random aleatorio = new Random();
    
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria() == l2.getCategoria() && l1 != l2) {
            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
            System.out.println("Luta Marcada!");
            System.out.println(this.getDesafiado().getNome() + " X " + 
                    this.getDesafiante().getNome() + "\n");
        } else{
            this.setAprovada(false);
            System.out.println("Luta não pode ser Marcada!");
        }
    }
    
    public void lutar(){
        if (this.isAprovada()) {
            this.getDesafiado().apresentar();
            this.getDesafiante().apresentar();
            int vencedor = aleatorio.nextInt(3);
            switch (vencedor){
                case 0:
                    System.out.println("EMPATE\n");
                    this.getDesafiado().empatarLuta();
                    this.getDesafiante().empatarLuta();
                    break;
                case 1:
                    System.out.println(this.getDesafiado().getNome() + 
                            " VENCEU A LUTA!\n");
                    this.getDesafiado().ganharLuta();
                    this.getDesafiante().perderLuta();                    
                    break;
                case 2:
                    System.out.println(this.getDesafiante().getNome() + 
                            " VENCEU A LUTA\n");
                    this.getDesafiado().perderLuta();
                    this.getDesafiante().ganharLuta();
                    break;
            
            } 
        } else{
            System.out.println("Não há luta!");
        }
    }
}
