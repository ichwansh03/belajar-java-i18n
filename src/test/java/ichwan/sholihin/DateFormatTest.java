package ichwan.sholihin;

import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatTest {

    @Test
    void testDateFormat(){
        //https://www.iban.com/country-codes
        //https://www.loc.gov/standards/iso639-2/php/code_list.php
        var locale = new Locale("ar","SA");
        var dateFormat = new SimpleDateFormat("EEEE dd MMMM yyyy", locale);
        var format = dateFormat.format(new Date());
        System.out.println(format);
    }

    @Test
    void testParseDateFormat(){
        var locale = new Locale("in","ID");
        var dateFormat = new SimpleDateFormat("EEEE dd MMMM yyyy", locale);

        try {
            var date = dateFormat.parse("Jum'at 29 Juli 2022");
            System.out.println(date);
        } catch (ParseException e){
            System.out.println("error parse : "+e.getMessage());
        }
    }
}
