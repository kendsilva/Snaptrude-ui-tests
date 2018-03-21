package util;

import models.Config;
import models.Data;
import org.yaml.snakeyaml.Yaml;

/**
 * Created by kendsilva on 3/20/18.
 */
public class YamlReader {
    private String filePath;

    public YamlReader(String filePath) {
        this.filePath = filePath;
    }

    public Config readConfig() {
        return new Yaml().loadAs(FileReader.read(filePath),Config.class);
    }

    public Data readData() {
        return new Yaml().loadAs(FileReader.read(filePath),Data.class);
    }
}
