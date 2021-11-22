import java.util.ArrayList;
import java.util.Optional;
import java.util.UUID;

public class BuildingSystem implements IBuildingManagementSystem {
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

    public Building getBuilding(UUID id){
        for (Building b : buildings) {
            if(b.getId() == id){
                return b;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Building> getBuildings(){ return buildings;
    }

    @Override
    public ArrayList<Unit> getAllType(String type, UUID buildingId) {
        Building result = this.getBuilding(buildingId);
        return result.bgetAllType(type);
    }
}
