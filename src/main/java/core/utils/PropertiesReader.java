package core.utils;

import constants.Target;

import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
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

    public Target getTarget() {
        String target = System.getProperty("target");

        if (Objects.equals(target, "NONE")) {
            return Target.valueOf(props.getProperty("target"));
        } else {
            return Target.valueOf(target);
        }
    }

    public void load() throws IOException {
        String propertyFileName = "env.properties";
        ClassLoader loader = Thread.currentThread().getContextClassLoader();

        try (InputStream stream = loader.getResourceAsStream(propertyFileName)) {
            props.load(stream);
        }
    }
}
