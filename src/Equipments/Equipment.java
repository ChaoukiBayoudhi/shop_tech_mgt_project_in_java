package Equipments;

import details.Constructor;
import details.Microprocessor;
import enumerations.EquipmentState;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//Equipment is a superclass of Computer, Smartphone and Printer
//Equipment is a parent of Computer, Smartphone and Printer
//Equipment is a base class of Computer, Smartphone and Printer
public class Equipment {
    private long id;
    private String name;
    private double price;
    private Microprocessor processor;
    private Constructor constructor;
    private EquipmentState state=EquipmentState.IN_STOCK;

}
