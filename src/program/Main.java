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
        //p1.print();
        System.out.println("p1 = "+p1);
        Printer p2= new Printer();
        p2.setId(1);
        p2.setName("HP LaserJet");
        p2.setPrice(1000);
        p2.setState(EquipmentState.IN_STOCK);
        p2.setMaxPaperCapacity(1000);
        p2.setBrand(PrinterBrand.HP);
         //test of Object methods
        //System.out.println("toString() result = "+ p1.toString());
        System.out.println("toString() result = "+ p1);
        System.out.println("toString() result = "+ p2);
        System.out.println("equals() result = "+ p1.equals(p2));
        System.out.println("hashCode() result = "+ p1.hashCode());
        System.out.println("hashCode() result = "+ p2.hashCode());
        System.out.println("getClass() result = "+ p1.getClass());
    }
}