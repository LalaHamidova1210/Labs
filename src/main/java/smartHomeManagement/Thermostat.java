package smartHomeManagement;

public class Thermostat extends smartHomeManagement.Device {
    private int temperature;
    public Thermostat(int id, String name, boolean status, DeviceType deviceType) {
        super(id, name, DeviceType.THERMOSTAT);
    }



    public void turnOn () {
        System.out.println("Thermostat " + getName() + " is  on");
    }
    public void turnOff () {
        System.out.println("Thermostat " + getName() + " is  off");
    }
    public int getTemperature() {
        return temperature;
    }
    public void setTemperature (int temperature){
        this.temperature = temperature;
        System.out.println("Thermostat " + getName() + "  " + temperature + "C");
    }
}
