public class Ford implements CarFunctionality {
    @Override
    public void startEngine() {
        System.out.println("Starting engine and starting noise");
    }

    @Override
    public void shutdownEngine() {
        System.out.println("Error 2019: Can't start engine for some reason");
    }

    @Override
    public void shiftGear() {
        System.out.println("Can't shift gear, no human can control me!");
    }
}
