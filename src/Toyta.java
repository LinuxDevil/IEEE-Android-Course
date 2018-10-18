public class Toyta implements CarFunctionality {
    @Override
    public void startEngine() {
        System.out.println("You broke my Gear and engine and my heart!");
    }

    @Override
    public void shutdownEngine() {
        System.out.println("Can't be shutdown!");
    }

    @Override
    public void shiftGear() {
        System.out.println("Can you ?");
    }
}
