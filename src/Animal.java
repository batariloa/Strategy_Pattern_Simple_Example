public class Animal {

    public  Flies flyingType;
    private String name;
    private int weightKg;
    private int heightCm;

    public String tryToFly(){
        return this.flyingType.fly();
    }

    public void setFlyingType(Flies newFlyingType){
        this.flyingType = newFlyingType;
    }
}
