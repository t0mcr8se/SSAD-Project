class Person {
    protected int age;
    protected boolean isAdmin;
    protected String username, password, firstName, surName;
    protected int id; // each person should have a unique ID when created

    Person(String username, String password, boolean isAdmin, int age, String firstName, String surName) {
        // TODO: get user from the database if already exists, else generate new ID
        this.username = username;
        this.password = password;
        this.age = age;
        this.isAdmin = isAdmin;
        this.firstName = firstName;
        this.surName = surName;
    }

    /**
     * this is used to fetch the person from the database based on his/her ID
     * @param id
     */
    Person(int id) {
        // TODO: get person from the database
    }

    /**
     * this method is used to login into the system
     * @param username
     * @param password
     */
    boolean login(String username, String password) {
        return true;        
    }
}
