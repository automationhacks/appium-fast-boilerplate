package core.utils;

import constants.Target;

import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import java.util.Properties;

public class PropertiesReader {
    private final Properties props = new Properties();

    public PropertiesReader() {
        load();
    }

    public Target getTarget() {
        String target = System.getProperty("target");

        if (Objects.equals(target, "NONE")) {
            return Target.valueOf(props.getProperty("target"));
        } else {
            return Target.valueOf(target);
        }
    }

    public void load() {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();

        String propertyFileName = "env.properties";
        try (InputStream stream = loader.getResourceAsStream(propertyFileName)) {
            props.load(stream);
        }
        catch (IOException e) {
            throw new RuntimeException("Failed to read file " + propertyFileName, e);
        }
    }
}
