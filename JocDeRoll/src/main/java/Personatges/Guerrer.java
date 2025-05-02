package Personatges;

import Altres.Poder;

public class Guerrer extends Huma{

    public Guerrer(String nom, int puntsAtac, int puntsDefensa, int vides){
        super(nom, puntsAtac, puntsDefensa, vides);
        System.out.println("Sóc el constructor de Guerrer però estic creant un " +this.getClass().getSimpleName());
    }
    protected void esColpejatAmb(int puntsAtac){
        int puntsAtacTotals = puntsAtac;
        int puntsDefensaTotals = puntsDefensa;
        for (Poder p : poders) {
            puntsAtacTotals += p.getBonusAtac();
            puntsDefensaTotals += p.getBonusDefensa();

        }

        int puntsRestants = puntsAtacTotals - puntsDefensaTotals;
        if (puntsRestants < 5) {
            puntsRestants = 0;
        }
        int vidaFinal = vides - puntsRestants;
        if (vidaFinal < 0) {
            vidaFinal = 0;

        }

        System.out.println("   " + nom +" és colpejat amb " + puntsAtacTotals + " i es defén amb " + puntsDefensaTotals +
                ". Vides: " + vides + "-" + puntsRestants + "=" +vidaFinal);
        vides = vidaFinal;
    }
}
