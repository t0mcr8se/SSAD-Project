public class DatabaseConnection {
    private static DatabaseConnection db;

    private DatabaseConnection() {
    }

    /**
     * Singleton design pattern for the Database connection to control the load balance, unnecessary connections, shared db connection management... etc
     *
     * @return
     */
    public static DatabaseConnection getDB() {
        if (db == null) {
            db = new DatabaseConnection();
        }
        return db;
    }

    /**
     * this method is used to add data to the database
     *
     * @param sql
     */
    void write(String sql) {
        System.out.println("DATA succesfully written to the database!");
    }

    /**
     * this method is used to retrieve data from the database
     *
     * @param sql
     * @return
     */
    String read(String sql) {
        // TODO: return smth
        System.out.println("DATA succesfully read from database!");
        return "";

    }


}
