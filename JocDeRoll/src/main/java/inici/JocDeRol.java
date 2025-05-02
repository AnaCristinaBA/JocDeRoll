package inici;

import Personatges.Guerrer;
import Personatges.Huma;
import Personatges.Jugador;
import Altres.Equip;
import Altres.Poder;
import Personatges.Alien;

public class JocDeRol {
    public static void provaFase1() {
        System.out.println("Vaig a crear un Guerrer");
        Guerrer guerrer = new Guerrer(null, 0, 0, 0);
        System.out.println("Vaig a crear un Huma");
        Huma huma = new Huma(null, 0, 0, 0);
        System.out.println("Vaig a crear un Alien");
        Alien alien = new Alien(null, 0, 0, 0);

        Huma ana = new Huma("Ana", 10, 5, 40);
        Alien jacinto = new Alien("Jacinto", 14, 2, 35);
        ana.ataca(jacinto);
    }

    public static void provaFase2() {
        Huma ana = new Huma("Ana", 6, 5, 555);
        Alien jacinto = new Alien("Jacinto", 7, 2, 26);
        Guerrer joanmi = new Guerrer("Joanmi", 12, 5, 122);

        jacinto.ataca(ana);
        ana.ataca(jacinto);
        ana.ataca(joanmi);
        jacinto.ataca(joanmi);
        jacinto.ataca(ana);
    }

    public static void provaFase3() {
        Equip salmon = new Equip("Salmón");
        Equip trucha = new Equip("Trucha");

        Huma ana = new Huma("Ana", 6, 5, 555);
        Alien jacinto = new Alien("Jacinto", 7, 2, 55);
        Guerrer joanmi = new Guerrer("Joanmi", 12, 5, 122);
        Alien ana1 = new Alien("Ana", 5, 7, 234);
        salmon.posa(ana);
        salmon.posa(ana1);
        salmon.posa(joanmi);

        jacinto.ataca(ana);
        jacinto.ataca(joanmi);
        ana.ataca(jacinto);
        jacinto.ataca(joanmi);
        salmon.lleva(ana);

    }

    public static void provaFase5() {
        Poder poder1 = new Poder("poder1", 5, 30);
        Poder poder2 = new Poder("poder2", 1, 100);
        
        Huma ana = new Huma("Ana", 6, 5, 555);
        Alien jacinto = new Alien("Jacinto", 7, 2, 55);
        Guerrer joanmi = new Guerrer("Joanmi", 12, 5, 122);
    
        joanmi.posa(poder1);
        jacinto.posa(poder1);

        ana.posa(poder2);

        joanmi.ataca(jacinto);
        jacinto.ataca(joanmi);


    }

    public static void main(String[] args) {
        // new Huma(null, 0, 0, 0);
        // new Guerrer(null, 0, 0, 0);
        // new Alien(null, 0, 0, 0);

        provaFase5();

    }
}