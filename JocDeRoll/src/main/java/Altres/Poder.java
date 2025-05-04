package Altres;

import java.util.Objects;


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
    public boolean equals(Object o) {
        if (o == null)
            return false;
            Poder poder = (Poder) o;
        return Objects.equals(nom, poder.nom);
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