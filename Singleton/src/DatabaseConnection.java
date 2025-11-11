public class DatabaseConnection {
    private static final DatabaseConnection instance = new DatabaseConnection();

    private DatabaseConnection(){
        System.out.println("Database connection established");
    }

    public static DatabaseConnection getInstance(){
        return instance;
    }

    public void query(String sql){
        System.out.println("Executing query " + sql);
    }
}
