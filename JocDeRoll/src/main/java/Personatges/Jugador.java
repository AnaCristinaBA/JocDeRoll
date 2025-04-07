package Personatges;

public class Jugador {
    String nom;
    int puntsAtac;
    int puntsDefensa;
    int vides;
    Jugador(String nom, int puntsAtac, int puntsDefensa, int vides){
        System.out.println("Sóc el constructor de jugador però estic creant un " +this.getClass().getSimpleName());
    }

    @Override
    public String toString() {
        return nom +" ( " + this.getClass().getSimpleName() + ", PA: " + puntsAtac +", PD: " + puntsDefensa + ", PV: " + vides +" )";
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

    protected void setPuntsDefensa(int puntsDefensa) {
        this.puntsDefensa = puntsDefensa;
    }

    protected void esColpejatAmb(int puntsAtac){ //Cómo se la cantidad de punts con la que le atacan
        int puntsRestants = puntsAtac - puntsDefensa;
        int vidaFinal = vides - (puntsAtac - puntsDefensa);
        if (vidaFinal < 0) {vidaFinal = 0;}

        System.out.println(nom +" és colpejat amb " + puntsAtac + " i es defén amb " + puntsDefensa +
        ". Vides: " + vides + " - " + puntsRestants + "=" +vidaFinal);
    }

    public void ataca(Jugador jugador){
        System.out.println("ABANS DE L'ATAC: \n Atacant: " + getNom() + " (" + this.getClass().getSimpleName() + ", PA: " + getPuntsAtac() + " / PD: " + getPuntsDefensa() + " / PV: " + getVides() + ") \n Atacant: " + jugador.getNom() + " (" + jugador.getClass().getSimpleName() + ", PA: " + jugador.getPuntsAtac() + " / PD: " + jugador.getPuntsDefensa() + " / PV: " + jugador.getVides() + ") ");
        jugador.esColpejatAmb(puntsAtac);
        esColpejatAmb(jugador.getPuntsAtac());
        

    }
}