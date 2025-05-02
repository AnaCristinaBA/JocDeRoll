package Personatges;

import Altres.Poder;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Jugador {
    String nom;
    int puntsAtac;
    int puntsDefensa;
    int vides;
    String equip;

    Jugador(String nom, int puntsAtac, int puntsDefensa, int vides, String equip) {
        this.nom = nom;
        this.puntsAtac = puntsAtac;
        this.puntsDefensa = puntsDefensa;
        this.vides = vides;
        this.equip = equip;
        System.out.println("Sóc el constructor de jugador però estic creant un " + this.getClass().getSimpleName());
    }

    @Override
    public String toString() {
        return nom + " ( " + this.getClass().getSimpleName() + ", PA: " + puntsAtac + ", PD: " + puntsDefensa + ", PV: " + vides + " )";
    }
    protected void setPuntsDefensa(int puntsDefensa) {
        this.puntsDefensa = puntsDefensa;
    }

    protected void esColpejatAmb(int puntsAtac) {
        int sumaAtac = 0;
        for (int i = 0; i < poders.size() ; i++) {
            sumaAtac
                    + poders.get(i).setBonusAtac();
        }
        int puntsRestants = puntsAtac - puntsDefensa;
        int vidaFinal = vides - (puntsAtac - puntsDefensa);
        if (vidaFinal < 0) {
            vidaFinal = 0;
        }
        if (puntsRestants < 0) {
            puntsRestants = 0;
        }

        System.out.println("   " + nom + " és colpejat amb " + puntsAtac + " i es defén amb " + puntsDefensa +
                ". Vides: " + vides + "-" + puntsRestants + "=" + vidaFinal);
        vides = vidaFinal;
    }

    public void ataca(Jugador jugador) {
        System.out.println("\n \033[0;1m               " + nom + " VS " + jugador.nom);
        System.out.println("ABANS DE L'ATAC:\n   Atacant: " + getNom() + " (" + this.getClass().getSimpleName() + ", PA: " + getPuntsAtac() + " / PD: " + getPuntsDefensa() + " / PV: " + getVides() + ") \n   Atacant: " + jugador.getNom() + " (" + jugador.getClass().getSimpleName() + ", PA: " + jugador.getPuntsAtac() + " / PD: " + jugador.getPuntsDefensa() + " / PV: " + jugador.getVides() + ") ");
        System.out.println("\nATAC:");
        jugador.esColpejatAmb(puntsAtac);
        esColpejatAmb(jugador.getPuntsAtac());
        System.out.println("\nDESPRÉS DE L'ATAC: \n   Atacant: " + getNom() + " (" + this.getClass().getSimpleName() + ", PA: " + getPuntsAtac() + " / PD: " + getPuntsDefensa() + " / PV: " + getVides() + ") \n   Atacant: " + jugador.getNom() + " (" + jugador.getClass().getSimpleName() + ", PA: " + jugador.getPuntsAtac() + " / PD: " + jugador.getPuntsDefensa() + " / PV: " + jugador.getVides() + ") ");
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Jugador jugador = (Jugador) o;
        return Objects.equals(nom, jugador.nom);
    }



    public String getNom() {
        return nom;
    }

    protected void setNom(String nom) {
        this.nom = nom;
    }

    public int getPuntsAtac() {
        return puntsAtac;
    }

    protected void setPuntsAtac(int puntsAtac) {
        this.puntsAtac = puntsAtac;
    }

    public int getVides() {
        return vides;
    }

    protected void setVides(int vides) {
        this.vides = vides;
    }

    public int getPuntsDefensa() {
        return puntsDefensa;
    }
}