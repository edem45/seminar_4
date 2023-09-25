package dz1seminar1;
import java.util.*;
public class dz1seminar1 {

    public static void main (String[] args)
    {
        List<HotDrink> newList = new LinkedList<>();
        HotDrinkAutomat automat_1 = new HotDrinkAutomat(newList);

        HotDrink americano = new HotDrink("Американо", 50, 500, 80);
        HotDrink greentea = new HotDrink("Зеленый чай", 40, 500, 60);

        newList.add(americano);
        newList.add(greentea);

        System.out.println(automat_1.getProduct("Американо",500,80));
        System.out.println(automat_1.getProduct("Зеленый чай",500,60));
    }
}
