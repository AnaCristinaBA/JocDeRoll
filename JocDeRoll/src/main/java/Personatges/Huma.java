package Personatges;

public class Huma extends Jugador{
    public Huma(String nom, int puntsAtac, int puntsDefensa, int vides, String equip){
        super(nom, puntsAtac, puntsDefensa, Math.min(vides, 100), equip);
        System.out.println("Sóc el constructor de Huma però estic creant un " +this.getClass().getSimpleName());
    }

    }