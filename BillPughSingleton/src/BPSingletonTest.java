public class BPSingletonTest {
    public static void main(String[] args) {
        System.out.println("=== Application Started ===");
        System.out.println("Requesting BPSingleton instance...");

        System.out.println("\n=== First call to getInstance() ===");
        BPSingleton singleton = BPSingleton.getInstance();
        System.out.println("First message from singleton:");
        singleton.showMessage();

        System.out.println("\n=== Second call to getInstance() ===");
        BPSingleton anotherSingleton = BPSingleton.getInstance();
        System.out.println("Second message from anotherSingleton:");
        anotherSingleton.showMessage();

        System.out.println("\n=== Application Finished ===");

        System.out.println("\n === Demonstrating that both instances are the same ===");
        if (singleton == anotherSingleton) {
            System.out.println("Both instances are the same. Singleton works!");
        } else {
            System.out.println("Instances are different. Singleton failed!");
        }
    }
}
