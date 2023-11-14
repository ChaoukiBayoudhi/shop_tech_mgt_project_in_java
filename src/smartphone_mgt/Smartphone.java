package smartphone_mgt;

import Equipments.Equipment;
import details.Microprocessor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Smartphone extends Equipment {
    private  String screen;
    private  String camera;
    private  String battery;
}
