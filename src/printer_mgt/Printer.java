package printer_mgt;

import Equipments.Equipment;
import details.Constructor;
import details.Microprocessor;
import enumerations.EquipmentState;
import enumerations.PrinterBrand;
import enumerations.PrinterType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Scanner;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//Printer is a subclass of Equipment
//Printer inherits from Equipment
//Printer is a child of Equipment
//Printer is a derived class of Equipment
public class Printer extends Equipment {
    private  int printSpeed;
    private int maxPaperCapacity;
    private PrinterBrand brand=PrinterBrand.HP;
    private PrinterType type=PrinterType.LASER;

    //redefinition of the print method
    /*@Override
    public void  print(){
        super.print();//call the print method of the superclass (Equipment)
        System.out.println("printSpeed: "+printSpeed);
        System.out.println("maxPaperCapacity: "+maxPaperCapacity);
        System.out.println("brand: "+brand);
        System.out.println("type: "+type);
    }*/
    @Override
    public void getProperties(){
        super.getProperties();//get the properties id, name, price, microprocessor and ram
        //get other properties (defined into the class "Printer").
        Scanner sc=new Scanner(System.in);
        System.out.println("print speed = ");
        printSpeed=sc.nextInt();
        System.out.println("max papers capacity = ");
        maxPaperCapacity=sc.nextInt();
        //the same thing for brand and type

    }
    //redefinition of toString method
    public String toString() {
        return super.toString()+ //return the attributes values defined in Equipment
                ", print speed : "+printSpeed+
                ", max papers capacity : "+ maxPaperCapacity+
                ", brand : "+ brand+
                ", type : "+type;
    }
}
