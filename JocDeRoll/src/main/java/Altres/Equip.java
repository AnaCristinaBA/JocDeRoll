package Altres;

import Personatges.Jugador;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Equip {
    String nom;
    public List<Jugador> jugadors = new ArrayList<>();

    public Equip(String nom) {
        this.nom = nom;
    }

    public void posa(Jugador o) {
        if (!jugadors.contains(o)) {
            jugadors.add(o);
            o.setEquip(this);
            System.out.println("El " + o.getNom() + " ha sigut afegix al equip " + getNom());
        } else {
            System.out.println("Ja ni ha un jugador amb el mateix nom que el jugador " + o.getNom());
        }
        mostra();
    }

    public void lleva(Jugador o) {
        jugadors.remove(o);
        o.setEquip(null);
        mostra();
    }

    public void mostra() {
        System.out.println("Equip: " + nom);
        for (Jugador j : jugadors) {
            System.out.println(j);
        }
    }

    @Override
    public String toString() {
        return nom;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null)
            return false;
        Equip equip = (Equip) o;
        return Objects.equals(nom, equip.nom);
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

}
