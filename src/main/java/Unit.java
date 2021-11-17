import java.util.UUID;

public abstract class Unit {
    private double value;
    private String unitName;
    private UUID unitID;

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
