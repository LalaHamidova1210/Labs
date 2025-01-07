package smartHomeManagement;

public class SmartHomeTest {
    public SmartHomeTest() {
    }

    public static void main(String[] args) {
        User user = new User("Lala", "Hamidova", "lalahamidova@gmail.com", "lala1210");
        user.register();

        Light light = new Light(1, "Bed Room Light" );
        Thermostat thermostat = new Thermostat(2, "Main Thermostat");
        Camera camera = new Camera(3, "Front  Camera");
        Doorbell doorbell = new Doorbell(4, "Front Doorbell");

        SmartHome home = new SmartHome();
        home.addDevice(light);
        home.addDevice(thermostat);
        home.addDevice(camera);
        home.addDevice(doorbell);

        Device[] devices = {light, thermostat, camera, doorbell};
        for (Device device : devices) {
            device.turnOn();
        }
        thermostat.setTemperature(30);
        for (Device device : devices) {
            device.turnOff();
        }
    }
}
