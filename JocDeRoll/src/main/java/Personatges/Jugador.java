package Personatges;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import Altres.Equip;
import Altres.Poder;

public class Jugador {
    String nom;
    int puntsAtac;
    int puntsDefensa;
    int vides;
    private Equip equip;
    List<Poder> poders = new ArrayList<>();
    static public int videsInicials = 200;

    public Jugador(String nom, int puntsAtac, int puntsDefensa, int vides) {
        this.nom = nom;
        this.puntsAtac = puntsAtac;
        this.puntsDefensa = puntsDefensa;
        this.vides = vides;
        System.out.println("Sóc el constructor de jugador però estic creant un " + this.getClass().getSimpleName());
    }

    public void posa(Poder o) {
        poders.add(o);
    }

    public void lleva(Poder o) {
        poders.remove(o);
    }

    @Override
    public String toString() {
        String resultat;
        if (equip == null || equip.getNom() == null) {
            resultat = nom + " ( " + this.getClass().getSimpleName() + "/ PA: " + puntsAtac + "/ PD: "
                    + puntsDefensa + " PV: " + vides + " ) té els poders: \n";
            for (Poder p : poders) {
                p.toString();
            }
            
        } else {
            resultat = nom + " [" + equip.getNom() + "] ( " + this.getClass().getSimpleName() + "/ PA: " + puntsAtac
                    + "/ PD: "
                    + puntsDefensa + " PV: " + vides + " )";
        }
        if (!poders.isEmpty()) {
            resultat += " té els poders:\n";
            for (Poder p : poders) {
                resultat += "\t - " + p.toString() + "\n";
            }
        }

        return resultat;
    }

    protected void setPuntsDefensa(int puntsDefensa) {
        this.puntsDefensa = puntsDefensa;
    }

    protected void esColpejatAmb(int puntsAtacTotals) {
        int puntsDefensaTotals = puntsDefensa;
        for (Poder p : poders) {
            puntsDefensaTotals += p.getBonusDefensa();

        }

        int puntsRestants = puntsAtacTotals - puntsDefensaTotals;
        if (puntsRestants < 0) {
            puntsRestants = 0;
        }
        int vidaFinal = vides - puntsRestants;
        if (vidaFinal < 0) {
            vidaFinal = 0;

        }

        System.out.println("   " + nom + " és colpejat amb " + puntsAtacTotals + " i es defén amb " + puntsDefensaTotals +
                        ". Vides: " + vides + "-" + puntsRestants + "=" + vidaFinal);
        vides = vidaFinal;
    }

    public void ataca(Jugador jugador) {
        System.out.println("\n \033[0;1m               " + nom + " VS " + jugador.nom);
        System.out.println("ABANS DE L'ATAC:\n   Atacant: " + toString() + ") \n   Atacat: " + jugador.toString());
        System.out.println("\nATAC:");
        //Ataque jugador 1
        int puntsAtacTotals = puntsAtac;
        for (Poder p : poders) {
            puntsAtacTotals += p.getBonusAtac();
        }
        jugador.esColpejatAmb(puntsAtacTotals);
        
        //Ataque jugador 2
        puntsAtacTotals = jugador.puntsAtac;
        for (Poder p : jugador.poders) {
            puntsAtacTotals += p.getBonusAtac();
        }
        esColpejatAmb(puntsAtacTotals);

        System.out.println("\nDESPRÉS DE L'ATAC: \n   Atacant: " + toString() + " \n   Atacant: " + jugador.toString());
    }

    @Override
    public boolean equals(Object o) {
        if (o == null)
            return false;
        Jugador jugador = (Jugador) o;
        return Objects.equals(nom, jugador.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom);
    }

    public String getEquip() {
        return nom;
    }

    public void setEquip(Equip equip) {
        this.equip = equip;
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