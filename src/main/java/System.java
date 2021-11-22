import java.util.ArrayList;
import java.util.UUID;

public class System {
    private ArrayList<Building> buildings;

    public void addBuilding(String name){
        Building newBuilding = new Building(name);
        buildings.add(newBuilding);
    }
    public void removeBuilding(UUID id){
        for (Building building: buildings){
            if (building.getId() == id){
                buildings.remove(building);
            }
        }
    }
    public ArrayList<Building> getBuildings(){
        return buildings;
    }
}
