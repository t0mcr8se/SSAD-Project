public class Company {
    protected String name, owner, grievances[];
    protected int revenue, id;

    Company(String name, String owner, String grievances[]) {
        this.name = name;
        this.owner = owner;
        this.grievances = grievances;
    }
    Company(int id){
        // TODO: get company by id from the database
    }
}
