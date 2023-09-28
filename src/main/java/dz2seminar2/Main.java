package dz2seminar2;

public class Main {

    public static void main(String[] args) {

        Market market = new Market();
        Human human1 = new Human("Aleksandr");
        Human human2 = new Human("Fedor");

        market.acceptToMarket(human2);
        market.acceptToMarket(human1);
        market.update();

    }
}