package tax.type;

import tax.Budget;
import tax.Tax;

public class ISS implements Tax {


    @Override
    public double calcTax(Budget budget) {
        return budget.getValue() * 0.06;
    }
}
