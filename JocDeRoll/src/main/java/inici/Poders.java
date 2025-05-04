package inici;

import java.util.ArrayList;
import java.util.List;

import Altres.Poder;
import Teclat.Teclat;

public class Poders {
    static List<Poder> llista = new ArrayList<>();

    public static void crear() {
        System.out.println("Crear poder");
        String nomPoder = Teclat.lligString("Quin nom vols posar al poder?: ");
        int puntsAtaque = Teclat.lligInt("Punts d'atac: ");
        int puntsDefensa= Teclat.lligInt("Punts de defensa: ");
        llista.add(new Poder(nomPoder, puntsAtaque, puntsDefensa));
        consultar();
    }

    public static void consultar() {
        System.out.println("Consultar poders");
        System.out.println("Poders registrats: " + llista.size());
        for (Poder poder : llista) {
            System.out.println("\t -"+poder);
        }
        Teclat.lligString("Enter per a eixir...");
    }
    public static void eliminar() {
        System.out.println("Eliminar poder");
        String nomPoder = Teclat.lligString("Nom del poder que vols eliminar: ");
        Poder poderBorrar = new Poder(nomPoder, 0,0);
        if (llista.contains(poderBorrar)) {
            llista.remove(poderBorrar);
            System.out.println("Equip esborrat correctamet");
        } else {
            System.out.println("Equip no existix");
        }
    }

    public static void menuPoders() {
        System.out.println("1. Crear \n2. Consultar \n3. Eliminar\n 0. Eixir ");
        int opcio = Teclat.lligInt("Selecciona el nombre", 0, 3);
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
            case 0:
            JocDeRol.menuConfiguracio();
                break;

            default:
                break;
        }
        menuPoders();
    }

}
