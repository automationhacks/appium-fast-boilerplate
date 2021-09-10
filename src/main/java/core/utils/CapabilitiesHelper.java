package core.utils;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class CapabilitiesHelper {
    public static HashMap readAndMakeCapabilities(String fileName) throws IOException {
        String caps = new FileReader().readFile(fileName);
        HashMap map = convertCapsToMap(caps);

        updateAbsolutePath(map);
        return map;
    }

    private static HashMap convertCapsToMap(String caps) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        HashMap map = mapper.readValue(caps, HashMap.class);
        return map;
    }

    private static void updateAbsolutePath(HashMap map) {
        String path = (String) map.get("app");
        File appPath = new File(path);
        map.put("app", appPath.getAbsolutePath());
    }
}
