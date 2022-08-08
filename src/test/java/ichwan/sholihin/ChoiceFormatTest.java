package ichwan.sholihin;

import org.junit.jupiter.api.Test;

import java.text.ChoiceFormat;
import java.text.MessageFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class ChoiceFormatTest {

    @Test
    void testChoiceFormat(){
        var pattern = "-1#negative | 0#null | 1#one | 1<more";
        var choiceFormat = new ChoiceFormat(pattern);
        System.out.println(choiceFormat.format(-2));
        System.out.println(choiceFormat.format(2));
        System.out.println(choiceFormat.format(0));
    }

    @Test
    void testChoiceInMessageFormat(){
        var locale = new Locale("in","ID");
        var resBundle = ResourceBundle.getBundle("message",locale);
        var pattern = resBundle.getString("balance");

        var message = new MessageFormat(pattern, locale);

        System.out.println(message.format(new Object[]{-1000000}));
        System.out.println(message.format(new Object[]{0}));
        System.out.println(message.format(new Object[]{1000000}));
    }
}
