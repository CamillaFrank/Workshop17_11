import java.util.ArrayList;
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
    public void getBuilding(UUID id){
        buildings.forEach(building -> building.getId().equals(id));
    }

    @Override
    public ArrayList<Building> getBuildings(){ return buildings;
    }

    @Override
    public ArrayList<Unit> getAllType(String type, UUID buildingId){
        ArrayList<Unit> typeList = new ArrayList<Unit>();
        typeList = Building.getAllType(type);
        return typeList;
    }
}
