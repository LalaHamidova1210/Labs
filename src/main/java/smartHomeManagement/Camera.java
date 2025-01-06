package smartHomeManagement;

public class Camera extends Device {
    public Camera(int id, String name, boolean status, DeviceType deviceType) {
        super(id, name, DeviceType.CAMERA);
    }
    public void turnOn (){
        System.out.println("Camera " + getName() + " is  on");
    }
    public void turnOff (){
        System.out.println("Camera " + getName() + " is  off");
    }
    public void startRecording () {
        System.out.println("Camera " + getName() + " started recording");
    }
    public void stopRecording () {
        System.out.println("Camera " + getName() + " stopped recording");
    }
}
