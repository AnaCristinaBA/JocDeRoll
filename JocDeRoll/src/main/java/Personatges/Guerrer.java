package Personatges;

public class Guerrer extends Huma{

    public Guerrer(String nom, int puntsAtac, int puntsDefensa, int vides, String equip){
        super(nom, puntsAtac, puntsDefensa, vides, equip);
        System.out.println("Sóc el constructor de Guerrer però estic creant un " +this.getClass().getSimpleName());
    }
    protected void esColpejatAmb(int puntsAtac){
        int puntsRestants = puntsAtac - puntsDefensa;
        if (puntsRestants < 5){
            puntsRestants = 0;
        }
        int vidaFinal = vides - (puntsAtac - puntsDefensa);
        if (vidaFinal < 0) {vidaFinal = 0;}
        if (puntsRestants < 0) {puntsRestants = 0;}

        System.out.println("   " + nom +" és colpejat amb " + puntsAtac + " i es defén amb " + puntsDefensa +
                ". Vides: " + vides + "-" + puntsRestants + "=" +vidaFinal);
        vides = vidaFinal;
    }
}
