import java.util.Properties;

public class ConfigManager {
// Instance not created until needed
    private static ConfigManager instance;
    private Properties config;

    private ConfigManager() {
        // Expensive initialisation
        System.out.println("Loading configuration...");
        config = new Properties();
        // Load config from file
    }

    public static ConfigManager getInstance() {
        if (instance == null) {
            instance = new ConfigManager();
        }
        return instance;
    }

    public String getProperty(String key) {
        return config.getProperty(key);
    }
}
