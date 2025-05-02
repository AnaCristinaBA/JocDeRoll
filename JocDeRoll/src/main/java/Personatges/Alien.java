package Personatges;

public class Alien extends Jugador{
    public Alien(String nom, int puntsAtac, int puntsDefensa, int vides, String equip){
        super(nom, puntsAtac, puntsDefensa, vides, equip);
        System.out.println("Sóc el constructor de Alien però estic creant un " +this.getClass().getSimpleName());
        }
    public void ataca(Jugador jugador){
        System.out.println("\n \033[0;1m               " + nom + " VS " +jugador.nom);
        System.out.println("ABANS DE L'ATAC:\n   Atacant: " + getNom() + " (" + this.getClass().getSimpleName() + ", PA: " + getPuntsAtac() + " / PD: " + getPuntsDefensa() + " / PV: " + getVides() + ") \n   Atacant: " + jugador.getNom() + " (" + jugador.getClass().getSimpleName() + ", PA: " + jugador.getPuntsAtac() + " / PD: " + jugador.getPuntsDefensa() + " / PV: " + jugador.getVides() + ") ");
        int contador=0;
            if (vides > 20 && contador==0) {
                puntsAtac += 3;
                puntsDefensa -= 3;
                contador ++;
                if (puntsDefensa < 0) {
                    puntsDefensa = 0;
                }

        }else {
                puntsAtac=this.puntsAtac;
                puntsDefensa=this.puntsDefensa;
            };

        System.out.println("\nATAC:");
        jugador.esColpejatAmb(puntsAtac);
        esColpejatAmb(jugador.getPuntsAtac());
        System.out.println("\nDESPRÉS DE L'ATAC: \n   Atacant: " + getNom() + " (" + this.getClass().getSimpleName() + ", PA: " + getPuntsAtac() + " / PD: " + getPuntsDefensa() + " / PV: " + getVides() + ") \n   Atacant: " + jugador.getNom() + " (" + jugador.getClass().getSimpleName() + ", PA: " + jugador.getPuntsAtac() + " / PD: " + jugador.getPuntsDefensa() + " / PV: " + jugador.getVides() + ") ");
    }
    }
