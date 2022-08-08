package ichwan.sholihin;

import org.junit.jupiter.api.Test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Currency;
import java.util.Locale;

public class NumberFormatTest {

    @Test
    void testNumberFormat(){
        Locale indo = new Locale("in","ID");
        var numberFormat = NumberFormat.getInstance(indo);
        var format = numberFormat.format(1000000.500);
        System.out.println(format);
    }

    @Test
    void testParseNumberFormat(){
        Locale indo = new Locale("in","ID");
        var numberFormat = NumberFormat.getInstance(indo);
        try {
            var result = numberFormat.parse("10.000.000,50").doubleValue();
            System.out.println(result);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    @Test
    void testCurrency(){
        var indo = new Locale("in","ID");
        var currency = Currency.getInstance(indo);

        System.out.println(currency.getDisplayName());
        System.out.println(currency.getCurrencyCode());
        System.out.println(currency.getSymbol(indo));
    }

    //bisa diparsing juga
    @Test
    void testCurrencyNumberFormat(){
        Locale indo = new Locale("in","ID");
        var numberFormat = NumberFormat.getCurrencyInstance(indo);
        var format = numberFormat.format(1000000.500);
        System.out.println(format);
    }
}
