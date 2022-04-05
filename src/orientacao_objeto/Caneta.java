package orientacao_objeto;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status() {
        System.out.println("Caneta de cor " + cor);
        System.out.println("Caneta de ponta " + ponta);
        System.out.println("Caneta com carga " + carga);
        System.out.println("A caneta está tampada? " + tampada);
    }

    void rabiscar() {
        if (tampada == false) {
            System.out.println("estou rabiscando");
        } else {
            System.out.println("Não posso rabiscar");
        }

    }
    void tampar() {
        tampada = false;
    }
}
