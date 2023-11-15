package smartphone_mgt;

import Equipments.Equipment;
import details.Microprocessor;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class Smartphone extends Equipment {
    private  String screen;
    private  String camera;
    private  String battery;
}
