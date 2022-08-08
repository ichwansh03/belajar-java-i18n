package ichwan.sholihin;

import org.junit.jupiter.api.Test;

import java.text.MessageFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class FormatTypeTest {

    @Test
    void testMessageFormatTypeTest(){
        var locale = new Locale("in","ID");
        var resBundle = ResourceBundle.getBundle("message",locale);
        var pattern = resBundle.getString("status");

        var message = new MessageFormat(pattern, locale);
        var format = message.format(new Object[]{"Ichwan",new Date(),2000000});

        System.out.println(format);
    }
}
