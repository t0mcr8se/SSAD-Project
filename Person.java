class Person{
    protected int age;
    protected boolean isAdmin;
    protected String username, password, firstName, surName;
    int id;
    Person(String username, String password, boolean isAdmin, int age, String firstName, String surName){
        // TODO: get user from the database if already exists, else generate new ID
        this.username = username;
        this.password = password;
        this.age = age;
        this.isAdmin = isAdmin;
        this.firstName = firstName;
        this.surName = surName;
    }
    Person(int id){
        // TODO: get person from the database
    }
    void login(String username, String password){}
}
