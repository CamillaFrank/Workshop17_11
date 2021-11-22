import java.util.ArrayList;
import java.util.UUID;

public class Building {
    private ArrayList<Unit> units;
    private String name;
    private UUID id;

    public Building(String name){
        this.name = name;
        this.id = UUID.randomUUID();
        this.units = new ArrayList<Unit>();
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

    public void removeUnit(UUID id){
        units.removeIf(unit -> unit.getID().equals(id));

        /*for (Unit unit: units) {
            if (unit.getID() == id){
                units.remove(unit);
            }
        }*/
    }

    public ArrayList<Unit> getAllUnits(){
        return units;
    }

    public ArrayList<Unit> getAllType(String type){
        ArrayList<Unit> typelist = new ArrayList<Unit>();
        
        for (Unit unit: units) {
            if (type == "Temp_Sensor" && unit instanceof Temp_Sensor){
                typelist.add(unit);
            } else if(type == "CO2_Sensor" && unit instanceof CO2_Sensor){
                typelist.add(unit);
            } else if(type == "Actuator" && unit instanceof Actuator){
                typelist.add(unit);
            }
        }
        return typelist;
    }
}
