public class AppLogger {
    // Private constructor
    private AppLogger() {
        System.out.println("AppLogger initialized");
    }

    // Static inner class - lazy loaded by JVM
    private static class SingletonHelper {
        // Instance created when inner class is loaded
        private static final AppLogger INSTANCE = new AppLogger();
    }

    // Public access point
    public static AppLogger getInstance() {
        return SingletonHelper.INSTANCE;
    }

    public void log(String message) {
        System.out.println("[LOG] " + message);
    }
}

