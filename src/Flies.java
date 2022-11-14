public interface Flies {

    String fly();

}

class ItFliesHigh implements Flies{

    @Override
    public String fly() {
        return "Flying high..";
    }
}

class ItFliesLow implements  Flies{

    @Override
    public String fly() {
        return "Flaying low...";
    }
}


class CantFly implements Flies{
    @Override
    public String fly() {
        return "Sorry, I can't fly...";
    }

}
