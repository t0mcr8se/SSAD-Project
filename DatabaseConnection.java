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

    }

    String read(String sql){
        // TODO: return smth
        return "";

    }

    
}
