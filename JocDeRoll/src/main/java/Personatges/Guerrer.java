package Personatges;

public class Guerrer extends Huma{

    public Guerrer(String nom, int puntsAtac, int puntsDefensa, int vides){
        super(nom, puntsAtac, puntsDefensa, vides);
        System.out.println("Sóc el constructor de Guerrer però estic creant un " +this.getClass().getSimpleName());


    }

}
