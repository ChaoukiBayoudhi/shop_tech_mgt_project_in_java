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
}
