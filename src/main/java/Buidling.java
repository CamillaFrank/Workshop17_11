import java.util.ArrayList;
import java.util.UUID;

public class Buidling {
    private ArrayList<Unit> units;
    private String name;
    private UUID id;

    public Buidling(String name){
        this.name = name;
        this.id = UUID.randomUUID();
    }

    public String getName() {
        return name;
    }

    public UUID getId() {
        return id;
    }
    @Override
    public String toString(){
        return this.name;
    }

    public void addActuator(String unitName, double value){
        Actuator unit = new Actuator(unitName, value);
        units.add(unit);
    }

    public void addTempSensor(String unitName, double value){
        Temp_Sensor unit = new Temp_Sensor(unitName, value);
        units.add(unit);
    }

    public void addCO2Sensor(String unitName, double value){
        CO2_Sensor unit = new CO2_Sensor(unitName, value);
        units.add(unit);
    }
}
