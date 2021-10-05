class Person{
    boolean isAdmin;
    String username, password; // TODO: make private
    // TODO: add name or smth
    int id;
    Person(String username, String password, boolean isAdmin){
        // TODO: get user from the database if already exists, else generate new ID
        this.username = username;
        this.password = password;
        this.isAdmin = isAdmin;
    }
    Person(int id){
        // TODO: get person from the database
    }
    void login(String username, String password){}
}