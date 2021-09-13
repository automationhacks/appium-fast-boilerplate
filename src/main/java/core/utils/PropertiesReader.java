package core.utils;

import constants.Platform;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesReader {
    Properties props = new Properties();

    public PropertiesReader() {
        try {
            load();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Platform getPlatform() {
        return Platform.valueOf(props.getProperty("platform"));
    }

    public void load() throws IOException {
        String propertyFileName = "env.properties";
        ClassLoader loader = Thread.currentThread().getContextClassLoader();

        try (InputStream stream = loader.getResourceAsStream(propertyFileName)) {
            props.load(stream);
        }
    }
}
