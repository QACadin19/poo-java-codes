package aula_06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProjetoBanco p1 = new ProjetoBanco();
        p1.setNumConta(1204);
        p1.setDono("Cadinho");
        p1.abrirConta("CC");

        ProjetoBanco p2 = new ProjetoBanco();
        p2.setNumConta(1904);
        p2.setDono("Ingrid");
        p2.abrirConta("CP");

        p1.depositar(430);
        p2.depositar(220);

        p1.sacar(230);
        p2.sacar(210);

        p1.estadoAtual();
        p2.estadoAtual();
    }
}
