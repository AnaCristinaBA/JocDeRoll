package Personatges;

public class Huma extends Jugador{
    public Huma(String nom, int puntsAtac, int puntsDefensa, int vides){
        super(nom, puntsAtac, puntsDefensa, vides);
        System.out.println("Sóc el constructor de Huma però estic creant un " +this.getClass().getSimpleName());
    }
}
