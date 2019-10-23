package tax;

public class TaxCalculator {

    public double calcTax(Budget budget, Tax tax) {
        return tax.calcTax(budget);
    }
}
