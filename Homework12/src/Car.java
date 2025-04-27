public class Car {

    public void start() {
        System.out.println("Car is starting");
        startElectricity();
        startCommand();
        startFuelSystem();
    }
    private void startElectricity() {
        System.out.println("Electricity is starting");
    }
    private void startCommand() {
        System.out.println("Command is starting");
    }
    private void startFuelSystem() {
        System.out.println("Fuel system is starting");
    }
}
