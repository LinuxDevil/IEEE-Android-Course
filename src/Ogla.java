public class Ogla {

//    public private protected synchronized
    private String name;
    private String skin;
    private String thoughts;
    private String eyeColor;

    private boolean isAwake;

    private double weight;
    private double lengthOfHair;

    public String getName() {
        return name;
    }

    public String getSkin() {
        return skin;
    }

    public String getThoughts() {
        return thoughts;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public boolean isAwake() {
        return isAwake;
    }

    public double getWeight() {
        return weight;
    }

    public double getLengthOfHair() {
        return lengthOfHair;
    }

    public Ogla () {
        System.out.println("a new ogla has been born!");
    }

    public Ogla(String name, String skin, String thoughts, String eyeColor, boolean isAwake, double weight, double lengthOfHair) {
        this.name = name;
        this.skin = skin;
        this.thoughts = thoughts;
        this.eyeColor = eyeColor;
        this.isAwake = isAwake;
        this.weight = weight;
        this.lengthOfHair = lengthOfHair;
    }



    public void invokeSleeping () {
        isAwake = !isAwake;
    }

    public String think (){
        return "Thinking in something " +
                "new while sleeping is: " + isAwake;
    }

    public void eat(){
        System.out.println("Ogla is eating!");
    }

    public void smoke () {
        System.out.println("Ogla is smoking");
    }


}
