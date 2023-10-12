package dzseminar5;

import dzseminar5.View.View;
import dzseminar5.Controller.Controller;
import dzseminar5.Data.*;


import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main (String[] args)
    {
        Controller controller = new Controller();
        controller.addHotDrink("Американо", 50, 500, 80);
        controller.addBottleWithWater("Бонаква",50,500);


        System.out.println(controller.getAutomat_1().getProduct("Американо",500,80));
    }
}
