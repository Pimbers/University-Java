public class SingletonTest {
    public static void main(String[] args) {
        // Get the only instance of Singleton
        Singleton singleton1 = Singleton.getInstance();
        singleton1.showMessage();

        // Get the only instance of Singleton again
        Singleton singleton2 = Singleton.getInstance();

        // Check if both instances are the same
        if (singleton1 == singleton2) {
            System.out.println("Both instances are the same.");
        } else {
            System.out.println("Instances are different.");
        }
    }
}
