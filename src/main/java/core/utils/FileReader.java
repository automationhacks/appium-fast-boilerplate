package core.utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Objects;

public class FileReader {
    public String readFile(String fileName) throws IOException {
        ClassLoader load = getClass().getClassLoader();
        File file = new File(Objects.requireNonNull(load.getResource(fileName)).getFile());
        return getString(file);
    }

    private String getString(File file) throws IOException {
        return new String(Files.readAllBytes(file.toPath()));
    }
}
