package ichwan.sholihin;

import org.junit.jupiter.api.Test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest {

    //output bahasanya sesuai sistem
    @Test
    void testResourceBundle(){
        //cukup panggil nama file nya dari properties
        var resourceBundle = ResourceBundle.getBundle("message");
        System.out.println(resourceBundle.getString("hello"));
        System.out.println(resourceBundle.getString("goodBye"));
    }

    @Test
    void testResourceBundlePaksain(){
        //untuk parameter bahasa dan negara tinggal di load dari database terus buat condition
        var indo = new Locale("in","ID");
        //cukup panggil nama file nya dari properties
        var resourceBundle = ResourceBundle.getBundle("message",indo);
        System.out.println(resourceBundle.getString("hello"));
        System.out.println(resourceBundle.getString("goodBye"));
    }
}
