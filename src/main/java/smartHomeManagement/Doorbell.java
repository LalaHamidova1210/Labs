package smartHomeManagement;

public class Doorbell extends smartHomeManagement.Device {
    public Doorbell(int id, String name, boolean status, DeviceType deviceType) {
        super(id, name,  DeviceType.DOORBELL);
    }
    public void turnOn (){
        System.out.println("Doorbell " + getName() + " is  on");
    }
    public void turnOff (){
        System.out.println("Doorbell " + getName() + " is  off");
    }
    public void ring () {
        System.out.println("Doorbell " + getName() + " is ringing");

    }
}
