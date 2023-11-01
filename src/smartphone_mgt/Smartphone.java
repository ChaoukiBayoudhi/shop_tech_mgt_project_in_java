package smartphone_mgt;

import details.Microprocessor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Smartphone {
    private long id;
    private String name;
    private Microprocessor processor;
    //....
}
