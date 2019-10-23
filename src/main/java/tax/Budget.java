package tax;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Budget {

    private double value;

    public Budget(double value) {
        this.value = value;
    }
}
