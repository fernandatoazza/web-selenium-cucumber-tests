package steps;

import java.io.InputStream;
import java.util.Properties;

public class Setup {

    private static final Properties properties = new Properties();

    static {
        try {
            InputStream in = Setup.class.getResourceAsStream("/" + System.getProperty("env") + ".properties");
            properties.load(in);
            in.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static String getString(String key) {
        return properties.getProperty(key);
    }

    public static String getString(String key, String def) {
        return properties.getProperty(key, def);
    }
}
