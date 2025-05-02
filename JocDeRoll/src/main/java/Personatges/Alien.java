package Personatges;

import Altres.Poder;

public class Alien extends Jugador {
    public Alien(String nom, int puntsAtac, int puntsDefensa, int vides) {
        super(nom, puntsAtac, puntsDefensa, vides);
        System.out.println("Sóc el constructor de Alien però estic creant un " + this.getClass().getSimpleName());
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
        // Propio de alien
        if (vides > 20 && puntsDefensaTotals > 0) {
            puntsDefensaTotals -= 3;
            if (puntsDefensaTotals < 0) {
                puntsDefensaTotals = 0;
            }
        }
        System.out
                .println("   " + nom + " és colpejat amb " + puntsAtacTotals + " i es defén amb " + puntsDefensaTotals +
                        ". Vides: " + vides + "-" + puntsRestants + "=" + vidaFinal);
        vides = vidaFinal;
    }

    public void ataca(Jugador jugador) {
        System.out.println("\n \033[0;1m               " + nom + " VS " + jugador.nom);
        System.out.println("ABANS DE L'ATAC:\n   Atacant: " + toString() + " \n   Atacant: " + jugador.toString());
        int puntsAtacTotals = puntsAtac;
        for (Poder p : poders) {
            puntsAtacTotals += p.getBonusAtac();
            jugador.esColpejatAmb(puntsAtacTotals);
            esColpejatAmb(jugador.getPuntsAtac());
        }
        // Propio de alien
        if (vides > 20) {
            puntsAtacTotals += 3;

        }

        System.out.println("\nATAC:");
        jugador.esColpejatAmb(puntsAtacTotals);
        esColpejatAmb(jugador.getPuntsAtac());
        System.out.println("\nDESPRÉS DE L'ATAC: \n   Atacant: " + toString() + " \n   Atacant: " + jugador.toString());
    }
}
