import java.util.ArrayList;

public class Company {
    protected String name, owner;
    protected ArrayList<String> grievances; // Initially empty
    protected int revenue, id;
    private static int cnt = 0;

    Company(String name, String owner) {
        this.name = name;
        this.owner = owner;
        id = cnt++;
    }

    Company(int id){
        // TODO: get company by id from the database
    }

    int getId(){
        return this.id;
    }
}
