public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        PC pc = new PC();
        Steak steak = new Steak();
        car.start();
        car.stop();
        pc.turnOn();
        pc.turnOff();
        steak.cook();
    }
}