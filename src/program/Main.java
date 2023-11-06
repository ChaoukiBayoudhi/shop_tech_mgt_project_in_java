package program;

import Equipments.Equipment;
import enumerations.EquipmentState;
import printer_mgt.Printer;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Equipment p1 = new Printer();
        p1.setId(1);
        p1.setName("HP LaserJet");
        p1.setPrice(1000);
        p1.setState(EquipmentState.IN_STOCK);
        p1.print();
    }
}