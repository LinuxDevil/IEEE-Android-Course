public class Asus implements laptopFunctionality {
    @Override
    public void boot() {
        System.out.println("Starting Asus device");
    }

    @Override
    public void restart() {
        System.out.println("restarting Asus");
    }

    @Override
    public void shutdown() {
        System.out.println("Asus says Goodbye");
    }

    @Override
    public void openProgram() {
        System.out.println("opening what you asked");
    }
}
