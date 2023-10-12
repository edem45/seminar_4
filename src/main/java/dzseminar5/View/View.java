package dzseminar5.View;

import dzseminar5.Controller.Controller;
import dzseminar5.Data.Product;

public class View {
    protected Product getProduct(String name) throws IllegalStateException {
        return null;
    }

    Controller controller = new Controller();

    public void createHotDrink (String name, double cost, int value, int temperature)
    {
        controller.addHotDrink(name,cost,value,temperature);
    }


    public void createBottleWithWater (String name, double cost, int volume)
    {
        controller.addBottleWithWater(name,cost,volume);
    }

    public void printInfo(){
        System.out.println(controller);
    }

}