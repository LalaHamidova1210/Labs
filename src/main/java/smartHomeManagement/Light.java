package smartHomeManagement;

public class Light extends smartHomeManagement.Device {
    public Light(int id, String name) {
        super(id, name,  DeviceType.LIGHT);
    }

    public void turnOn (){
        System.out.println("Light " + getName() + " is on");
    }
    public void turnOff () {
        System.out.println("Light " + getName() + " is  off");
    }
}
