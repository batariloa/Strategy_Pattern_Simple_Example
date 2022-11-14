public class Main {
    public static void main(String[] args) {


        Cow cow = new Cow();
        Bird bird = new Bird();


        System.out.println("Cow: "+ cow.tryToFly());
        System.out.println("Bird: "+ bird.tryToFly());
    }
}