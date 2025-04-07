package inici;

import Personatges.Guerrer;
import Personatges.Huma;
import Personatges.Alien;

public class JocDeRol {
    public static void provaFase1(){
        System.out.println("Vaig a crear un Guerrer");
        Guerrer guerrer = new Guerrer(null, 0, 0, 0);
        System.out.println("Vaig a crear un Huma");
        Huma huma = new Huma(null, 0, 0, 0);
        System.out.println("Vaig a crear un Alien");
        Alien alien = new Alien(null, 0, 0, 0);

        Huma ana = new Huma("Ana", 6, 5, 40);
        Alien jacinto = new Alien("Jacinto", 4, 10, 35);
        ana.ataca(jacinto);
    }
    public static void main(String[] args) {
        //new Huma(null, 0, 0, 0);
        //new Guerrer(null, 0, 0, 0);
        //new Alien(null, 0, 0, 0);

        provaFase1();

    }
}