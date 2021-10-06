class Person{
    int age;
    boolean isAdmin;
    String username, password, firstName, sureName; // TODO: make private
    // TODO: add name or smth
    int id;
    Person(String username, String password, boolean isAdmin, int age, String firstName, String sureName){
        // TODO: get user from the database if already exists, else generate new ID
        this.username = username;
        this.password = password;
        this.age = age;
        this.isAdmin = isAdmin;
        this.firstName = firstName;
        this.sureName = sureName;
    }
    Person(int id){
        // TODO: get person from the database
    }
    void login(String username, String password){}
}
