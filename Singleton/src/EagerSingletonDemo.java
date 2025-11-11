public class EagerSingletonDemo {
    public static void main(String[] args) {
        // Get the singleton instance
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        DatabaseConnection db2 = DatabaseConnection.getInstance();

        // Both variables point to the same instance
        System.out.println(db1 == db2);  // Output: true

        db1.query("SELECT * FROM users");

        // This would cause a compile error:
        // DatabaseConnection db3 = new DatabaseConnection();  // ERROR: constructor is private
    }
}

