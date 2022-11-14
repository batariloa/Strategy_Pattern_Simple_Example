public class Cow extends  Animal{


    public Cow() {

        super();
        flyingType = new CantFly();

    }

    public void milk(){

        System.out.println("Milking cow...");
    }
}
