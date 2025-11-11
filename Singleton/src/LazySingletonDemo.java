public class LazySingletonDemo {
    public static void main(String[] args) {
        System.out.println("Application started");
        System.out.println("Doing other work...");

        // Configuration not loaded yet - constructor hasn't run

        System.out.println("Now we need config");
        ConfigManager config = ConfigManager.getInstance();  // Constructor runs NOW

        System.out.println("Getting config again");
        ConfigManager config2 = ConfigManager.getInstance();  // Constructor doesn't run

        System.out.println("Same instance? " + (config == config2));
    }
}

