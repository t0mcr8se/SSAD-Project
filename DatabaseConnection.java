public class DatabaseConnection {
    private static DatabaseConnection db;

    private DatabaseConnection() {}

    public DatabaseConnection getDB(){
        if(db == null){
            db = new DatabaseConnection();
        }
        return db;
    }

    void write(String sql){
        System.out.println("DATA succesfully written to the database!");
    }

    String read(String sql){
        // TODO: return smth
        System.out.println("DATA succesfully read from database!");
        return "";

    }

    
}
