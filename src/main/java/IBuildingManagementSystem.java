/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;


public interface IBuildingManagementSystem {

    public ArrayList<Building> getBuildings();

    public ArrayList<Unit> getAllType(String type);

    public void addCO2Sensor(String unitName, double value);

    public void addTempSensor(String unitName, double value);

    public void addActuator(String unitName, double value);

    public void removeUnit(UUID id);

    ArrayList<Unit> getAllType(String type, UUID buildingId);
}
