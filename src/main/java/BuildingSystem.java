import java.util.ArrayList;
import java.util.UUID;

public class BuildingSystem {
    private ArrayList<Building> buildings;

    public BuildingSystem(){
        this.buildings = new ArrayList<Building>();
    }

    public void addBuilding(String name){
        Building newBuilding = new Building(name);
        buildings.add(newBuilding);
    }
    public void removeBuilding(UUID id){
        buildings.removeIf(building -> building.getId().equals(id));

        /*for (Building building: buildings){
            if (building.getId() == id){
                buildings.remove(building);
            }
        }
         */
    }
    public ArrayList<Building> getBuildings(){ return buildings;
    }
}
