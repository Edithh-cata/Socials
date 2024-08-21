// facebook.java
import java.awt.Desktop;
import java.net.URI;

public class FacebookLink {
    public static void main(String[] args) {
        System.out.println("name: edithh");
        try {
            URI url = new URI("https://guns.lol/edithh");
            Desktop.getDesktop().browse(url);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
