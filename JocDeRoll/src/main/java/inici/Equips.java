package inici;

import java.util.ArrayList;
import java.util.List;

import Altres.Equip;
import Teclat.Teclat;

public class Equips {

    static List<Equip> llista = new ArrayList<>();

    public static void crear() {
        System.out.println("Crear equip");
        String nomEquip = Teclat.lligString("Quin nom vols posar al'equip?: ");
        llista.add(new Equip(nomEquip));
        consultar();
    }

    public static void consultar() {
        System.out.println("Consultar equip");
        System.out.println("Equips registrats: " + llista.size());
        for (Equip equip : llista) {
            System.out.println("\t -"+equip);
        }
        Teclat.lligString("Enter per a eixir...");
    }

    public static void eliminar() {
        System.out.println("Eliminar equip");
        String nomEquip = Teclat.lligString("Nom del equip que vols eliminar: ");
        Equip equipBorrar = new Equip(nomEquip);
        if (llista.contains(equipBorrar)) {
            llista.remove(equipBorrar);
            System.out.println("Equip esborrat correctamet");
        } else {
            System.out.println("Equip no existix");
        }
    }

    public static void menuEquips() {
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
        menuEquips();
    }

}