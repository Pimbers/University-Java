public class BillPughDemo {
    public static void main(String[] args) {
        System.out.println("=== Application Started ===");
        System.out.println("AppLogger class loaded, but instance not created yet");

        System.out.println("\n=== First Call to getInstance() ===");
        AppLogger logger1 = AppLogger.getInstance();
        // At this point:
        // 1. SingletonHelper class loads
        // 2. INSTANCE field initialises
        // 3. AppLogger constructor runs
        // 4. Instance returned

        logger1.log("First log message");

        System.out.println("\n=== Second Call to getInstance() ===");
        AppLogger logger2 = AppLogger.getInstance();
        // At this point:
        // 1. SingletonHelper already loaded (from first call)
        // 2. INSTANCE already exists (from first call)
        // 3. Just return existing instance (no constructor call)

        logger2.log("Second log message");

        System.out.println("\n=== Verify Same Instance ===");
        System.out.println("logger1 == logger2: " + (logger1 == logger2));
        System.out.println("logger1.hashCode(): " + logger1.hashCode());
        System.out.println("logger2.hashCode(): " + logger2.hashCode());
    }
}
