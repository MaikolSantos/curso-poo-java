package aula06;
public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    public ControleRemoto(){
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean getTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        if (this.getLigado() == true) {
            System.out.println("======= MENU =======");
            System.out.println("Ligado: " + this.getLigado());
            System.out.println("Tocando: " + this.getTocando());
            System.out.print("Volume: " + this.getVolume());
            for (int i = 0; i <= this.getVolume(); i += 5) {
                if (i == getVolume()) {
                    System.out.println("\n");
                }else{
                    System.out.print(" º");
                }
            }
        } else{
            System.out.println("Imposível! Controle Desligado.");
        }
    }

    @Override
    public void fecharMenu() {
        if (this.getLigado() == true) {
            System.out.println("=== FECHANDO MENU ===");
        } else{
            System.out.println("Impossível! Controle Desligado.");
        }
    }

    @Override
    public void maisVolume() {
        if (this.getLigado() == true) {
            this.setVolume(this.getVolume() + 5);
        } else{
            System.out.println("Impossível! Controle Desligado");
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado() == true) {
            this.setVolume(this.getVolume() - 5);
            
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() == true && this.getVolume() > 0) {
            this.setVolume(0);
        } else{
            System.out.println("Impossível! Controle Desligado.");
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() == true && this.getVolume() == 0) {
            this.setVolume(50);
        } else{
            System.out.println("Impossível! Controle Desligado.");
        }
    }

    @Override
    public void play() {
        if (this.getLigado() == true && this.getTocando() == false) {
            this.setTocando(true);
        } else{
            System.out.println("Impossível! Controle Desligado.");
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() == true && this.getTocando() == true) {
            this.setTocando(false);
        } else{
            System.out.println("Impossível! Controle Desligado");
        }
    }
    
    
}
