package util;

import java.io.InputStream;

/**
 * Created by kendsilva on 3/20/18.
 */
public class FileReader {
    public static InputStream read(String filepath){
        ClassLoader classLoader = FileReader.class.getClassLoader();
        return classLoader.getResourceAsStream(filepath);
    }
}
