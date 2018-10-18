public class Dell implements laptopFunctionality {
    @Override
    public void boot() {
        System.out.println("Dell is booting");
    }

    @Override
    public void restart() {
        System.out.println("Dell is restarting");
    }

    @Override
    public void shutdown() {
        System.out.println("shutting down dell");
    }

    @Override
    public void openProgram() {
        System.out.println("opening program");
    }
}
