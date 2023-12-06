public class TV implements ElectronicDevice{
    @Override
    public void turnOn() {
        System.out.println("TV turning on...");
    }

    @Override
    public void turnOff() {
        System.out.println("TV turning off...");
    }
}
