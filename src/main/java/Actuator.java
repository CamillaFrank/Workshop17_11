public class Actuator extends Unit {
    public Actuator(String unitName, double value){
      super(unitName, value);
    }
    public void setValue(double value){
        this.value = value;
    }
}
