package utility;

import java.io.IOException;
import java.util.Properties;

public class PropertyLoader {
    private static PropertyLoader propertyLoader = null;
    private Properties properties;


    protected PropertyLoader() throws IOException {

        this.properties = new Properties();

        properties.load(getClass().getResourceAsStream("/Configuration/config.properties"));


    }
    public static PropertyLoader getPropertyLoader() {
        if(propertyLoader == null) {
            try {
                propertyLoader = new PropertyLoader();
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
        return propertyLoader;
    }

    public String getValue(String key) {
        return properties.getProperty(key);
    }

}
