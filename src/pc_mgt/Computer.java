package pc_mgt;

import Equipments.Equipment;
import details.Screen;
import enumerations.ComputerBrand;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter //generates getters for all fields in the runtime
@Setter //generates setters for all fields
@AllArgsConstructor //generates a constructor with 1 parameter for each field in your class.
@NoArgsConstructor //generates a default constructor with no parameters
//Computer is a subclass of Equipment
//Computer inherits from Equipment
//Computer is a child of Equipment
//Computer is a derived class of Equipment
public class Computer extends Equipment{

    private Screen screen;
    private String battery;
    private ComputerBrand brand;
}
