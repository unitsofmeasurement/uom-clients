package tec.uom.client.fitbit.model.activity;

import tec.units.ri.function.Nameable;
import tec.uom.lib.common.function.LongIdentifiable;


public class DisplayableActivity implements Nameable, LongIdentifiable {

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
