import junit.framework.Assert;
import org.junit.Test;
import tax.Budget;
import tax.TaxCalculator;
import tax.type.ICMS;
import tax.type.ISS;

public class TaxCalculatorTest {

    @Test
    public void taxCalculatorICMS() {
        Budget budget = new Budget(100);

        TaxCalculator taxCalculator = new TaxCalculator();

        Assert.assertEquals(10.0, taxCalculator.calcTax(budget, new ICMS()));
    }

    @Test
    public void taxCalculatorISS() {
        Budget budget = new Budget(100);

        TaxCalculator taxCalculator = new TaxCalculator();

        Assert.assertEquals(6.0, taxCalculator.calcTax(budget, new ISS()));
    }
}
