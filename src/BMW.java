public class BMW implements CarFunctionality {

    @Override
    public void startEngine(){
        System.out.println("Starting engine by finger-print");
    }

    @Override
    public void shutdownEngine() {
        System.out.println("Shutting down engine by button");
    }

    @Override
    public void shiftGear() {
        System.out.println("Shifting gear up or down as long as you are happy");
    }

}
