package ichwan.sholihin;

import org.junit.jupiter.api.Test;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class MessageFormatTest {

    @Test
    void testMessageFormat(){
        var pattern = "Hi {0}, anda adalah \"{0}\" kan?";
        var message = new MessageFormat(pattern);

        var format = message.format(new Object[]{"Ichwan"});

        System.out.println(format);
    }

    @Test
    void testResourceMessageFormat(){
        var locale = new Locale("in","ID");
        var resBundle = ResourceBundle.getBundle("message",locale);
        var pattern = resBundle.getString("welcome.message");

        var message = new MessageFormat(pattern);
        var format = message.format(new Object[]{"Ichwan","Bandarlampung"});

        System.out.println(format);
    }
}
