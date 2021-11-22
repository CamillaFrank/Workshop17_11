public class Main {
    public static void main(String[] args) {
        BuildingSystem buildingSystem = new BuildingSystem();
        buildingSystem.addBuilding("U48");
        buildingSystem.addBuilding("U45");
        System.out.println(buildingSystem.getBuildings());

        //tilføj units
        Building U48 = buildingSystem.getBuildings().get(0);
        U48.addTempSensor("Roomtemperature", 20.0);
        U48.addCO2Sensor("RoomCO2", 15.0);
        U48.addActuator("RoomVentilation", 0.0);

        Building U45 = buildingSystem.getBuildings().get(1);
        U45.addCO2Sensor("Sensor1",4.0);
        U45.addCO2Sensor("Sensor2", 5.0);

        System.out.println(U48.getAllUnits());
        System.out.println(U48.getAllType("CO2_Sensor"));
        System.out.println(U45.getAllType("CO2_Sensor"));

        System.out.println(U45.getId());

        U48.removeUnit(U48.getAllUnits().get(0).getID());
        System.out.println(U48.getAllUnits());

        buildingSystem.removeBuilding(U45.getId());
        System.out.println(buildingSystem.getBuildings());
    }
}
