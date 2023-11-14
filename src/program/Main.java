package program;

import Equipments.Equipment;
import enumerations.EquipmentState;
import enumerations.PrinterBrand;
import enumerations.PrinterType;
import printer_mgt.Printer;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Printer p1 = new Printer();
        p1.setId(1);
        p1.setName("HP LaserJet");
        p1.setPrice(1000);
        p1.setState(EquipmentState.IN_STOCK);
        p1.setMaxPaperCapacity(1000);
        p1.setBrand(PrinterBrand.HP);
        p1.setPrintSpeed(100);
        p1.setType(PrinterType.LASER);
        p1.print();
    }
}