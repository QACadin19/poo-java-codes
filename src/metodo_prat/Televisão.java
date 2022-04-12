package metodo_prat;

public class Televisão {
    public String modelo;
    public String cor;
    private int controle;
    private int canais;
    public boolean ligado;

    public String getModelo() {
        return this.modelo;
    }
    public String setModelo(String m) {
        return this.modelo = m;
    }
    public int getControle() {
        return this.controle;
    }
    public void setControle (int c) {
        this.controle = c;
    }
    public void status() {
        System.out.println("A televisão é " + modelo);
        System.out.println("O controle possui " + controle);
    }
}
