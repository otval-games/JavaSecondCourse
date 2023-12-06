public class PC implements ElectronicDevice{
    @Override
    public void turnOn() {
        System.out.println("PC turning on...");
    }

    @Override
    public void turnOff() {
        System.out.println("PC turning off...");
    }
}
