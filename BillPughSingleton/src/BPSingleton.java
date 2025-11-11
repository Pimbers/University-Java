public class BPSingleton {
    private BPSingleton() {
        System.out.println("BPSingleton initialised");
    }

    private static class SingletonHelper {
        private static final BPSingleton INSTANCE = new BPSingleton();
    }

    public static BPSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    public void showMessage() {
        System.out.println("Hello from BPSingleton!");
    }
}
