package Personatges;

public class Alien extends Jugador{
    public Alien(String nom, int puntsAtac, int puntsDefensa, int vides){
        super(nom, puntsAtac, puntsDefensa, vides);
        System.out.println("Sóc el constructor de Alien però estic creant un " +this.getClass().getSimpleName());

    }
}
