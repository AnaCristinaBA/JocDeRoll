package Altres;

public class Poder {
    String nom;
    int bonusAtac;
    int bonusDefensa;
    public Poder(String nom, int bonusAtac, int bonusDefensa){
        this.nom=nom;
        this.bonusAtac=bonusAtac;
        this.bonusDefensa=bonusDefensa;
    }

    @Override
    public String toString(){
        return nom+" ( BA: " +bonusAtac+ ", BD:" +bonusDefensa + ")";
    }


    public void setBonusAtac(int bonusAtac) {
        this.bonusAtac = bonusAtac;
    }

    public void setBonusDefensa(int bonusDefensa) {
        this.bonusDefensa = bonusDefensa;
    }

    public int getBonusDefensa() {
        return bonusDefensa;
    }

    public int getBonusAtac() {
        return bonusAtac;
    }
}