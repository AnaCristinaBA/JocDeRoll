package inici;

import java.util.ArrayList;
import java.util.List;

import Altres.Equip;
import Altres.Poder;
import Personatges.Alien;
import Personatges.Guerrer;
import Personatges.Huma;
import Personatges.Jugador;
import Teclat.Teclat;

public class Jugadors {
    static List<Jugador> llista = new ArrayList<>();

    public static void crear() {
        boolean bucleCrearJugador = true;
        do {
            System.out.println("··Crear jugador··");
            // TODO - Controlar que sea H G A
            String tipusJugador = Teclat.lligString("- El tipus de jugador (H, G o A)", 1);
            boolean nomRepetit;
            String nomJugador = "sense nom";
            do {
                nomRepetit = false;
                nomJugador = Teclat.lligString("- El nom del jugador");
                for (Jugador o : llista) {
                    if (o.getNom().contains(nomJugador)) {
                        System.out.println("Ja ni ha un jugador amb el mateix nom");
                        nomRepetit = true;
                    }
                }
            } while (nomRepetit);

            int atacJugador = Teclat.lligInt("- Els punts d'atac: ", 1, 100);
            int defensaJugador = 100 - atacJugador;
            switch (tipusJugador) {
                case "H":
                case "h":
                    llista
                            .add(new Huma(nomJugador, atacJugador, defensaJugador, Jugador.videsInicials));
                    break;
                case "G":
                case "g":
                    llista
                            .add(new Guerrer(nomJugador, atacJugador, defensaJugador, Jugador.videsInicials));
                    break;
                case "A":
                case "a":
                    llista
                            .add(new Alien(nomJugador, atacJugador, defensaJugador, Jugador.videsInicials));
                    break;

                default:
                    break;
            }
            String nouJugador = Teclat.lligString("Vols crear un altre jugador? (SI/NO)");
            switch (nouJugador) {
                case "SI":
                case "S":
                case "si":
                case "s":
                    bucleCrearJugador = true;
                    break;

                default:
                    bucleCrearJugador = false;
                    break;
            }
        } while (bucleCrearJugador);
        System.out.println();
        consultar();

    }

    public static void consultar() {
        System.out.println("··Consultar jugador··");
        System.out.println("Jugadors registrats: " + llista.size());
        for (Jugador o : llista) {
            System.out.println("\t -" + o);
        }
        Teclat.lligString("Enter per a eixir...");

    }

    public static void eliminar() {
        System.out.println("Eliminar jugador");
        String nomJugador = Teclat.lligString("Nom del jugador que vols eliminar: ");
        Jugador jugadorBorrar = new Jugador(nomJugador, 0, 0, 0);
        if (llista.contains(jugadorBorrar)) {
            llista.remove(jugadorBorrar);
            System.out.println("Jugador esborrat correctamet");
        } else {
            System.out.println("Jugador no existix");
        }

    }

    public static void assignarEquip() {
        System.out.println("Assignar jugador a un equip ");
        String nomJugador = Teclat.lligString("Nom del jugador: ");
        String nomEquip = Teclat.lligString("Nom del equip: ");

        Jugador jugadorEquip = new Jugador(nomJugador, 0, 0, 0);
        Equip equipTemporal = new Equip(nomEquip);

        int indexJugador = llista.indexOf(jugadorEquip);
        int indexEquip = Equips.llista.indexOf(equipTemporal);

        if (indexJugador == -1) {
            System.out.println("Jugador no trobat.");
            menuJugadors();
        }

        if (indexEquip == -1) {
            System.out.println("Equip no trobat.");
            menuJugadors();
        }

        Jugador jugador = llista.get(indexJugador);
        Equip equip = Equips.llista.get(indexEquip);

        equip.posa(jugador);
        System.out.println("Jugador " + nomJugador + " assignat a l'equip " + nomEquip + " correctament.");

    }

    public static void llevar() {
        System.out.println("Llevar jugador de un equip ");
        String nomJugador = Teclat.lligString("Nom del jugador: ");
        String nomEquip = Teclat.lligString("Nom del equip: ");

        Jugador jugadorEquip = new Jugador(nomJugador, 0, 0, 0);
        Equip equipTemporal = new Equip(nomEquip);

        int indexJugador = llista.indexOf(jugadorEquip);
        int indexEquip = Equips.llista.indexOf(equipTemporal);

        if (indexJugador == -1) {
            System.out.println("Jugador no trobat.");
            menuJugadors();
        }

        if (indexEquip == -1) {
            System.out.println("Equip no trobat.");
            menuJugadors();
        }

        Jugador jugador = llista.get(indexJugador);
        Equip equip = Equips.llista.get(indexEquip);

        equip.lleva(jugador);
        System.out.println("Jugador " + nomJugador + " eliminat del'equip " + nomEquip + " correctament.");

    }

    public static void assignarPoder() {
        System.out.println("Assignar poder");
        String nomJugador = Teclat.lligString("Nom del jugador: ");
        String nomPoder = Teclat.lligString("Nom del poder: ");

        Jugador jugadorEquip = new Jugador(nomJugador, 0, 0, 0);
        Poder poderTemporal = new Poder(nomPoder, 0, 0);

        int indexJugador = llista.indexOf(jugadorEquip);
        int indexPoder = Poders.llista.indexOf(poderTemporal);

        if (indexJugador == -1) {
            System.out.println("Jugador no trobat.");
            menuJugadors();
        }

        if (indexPoder == -1) {
            System.out.println("Poder no trobat.");
            menuJugadors();
        }

        Jugador jugador = llista.get(indexJugador);
        Poder poder = Poders.llista.get(indexPoder);

        jugador.lleva(poder);
        System.out.println("Jugador " + nomJugador + " assignat el poder " + nomPoder + " correctament.");

    }

    public static void menuJugadors() {
        System.out.println(
                "··MENÚ JUGADORS·· \n1. Crear \n2. Consultar \n3. Eliminar \n4. Assignar a equip \n5. Llevar d'equip \n6.Assigna poder \n 0. Eixir ");
        int opcio = Teclat.lligInt("Selecciona el nombre", 0, 6);
        switch (opcio) {
            case 1:
                crear();
                break;
            case 2:
                consultar();
                break;
            case 3:
                eliminar();
                break;
            case 4:
                assignarEquip();
                break;
            case 5:
                llevar();
                break;
            case 6:
                assignarPoder();
                break;
            case 0:
                JocDeRol.menuConfiguracio();
                break;

            default:
                break;
        }
        menuJugadors();
    }
}
