import java.util.UUID;

public abstract class Unit {
    public double value;
    private String unitName;
    private UUID unitID;

    public Unit(String unitName, double value){
        this.unitName = unitName;
        this.value = value;
        this.unitID = UUID.randomUUID();
    }

    public String getName(){
        return unitName;
    }

    public UUID getID(){
        return unitID;
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString(){
        return getName() + " " + getValue();
    }
}
