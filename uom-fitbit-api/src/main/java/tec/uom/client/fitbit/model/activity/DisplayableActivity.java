package tec.uom.client.fitbit.model.activity;


public class DisplayableActivity {

    private long id;
    private  String name;

    public DisplayableActivity(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
