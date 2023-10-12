package dzseminar5.Controller;

import dzseminar5.Data.HotDrink;
import dzseminar5.Data.HotDrinkAutomat;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Controller {

    List<HotDrink> HotDrinkList = new ArrayList<>();
    HotDrinkAutomat automat_1 = new HotDrinkAutomat(HotDrinkList);
    List<HotDrink> BottleWithWaterList = new ArrayList<>();
    HotDrinkAutomat automat_2 = new HotDrinkAutomat(BottleWithWaterList);

    public List<HotDrink> getHotDrinkList() {
        return HotDrinkList;
    }

    public void setHotDrinkList(List<HotDrink> hotDrinkList) {
        HotDrinkList = hotDrinkList;
    }

    public HotDrinkAutomat getAutomat_1() {
        return automat_1;
    }

    public void setAutomat_1(HotDrinkAutomat automat_1) {
        this.automat_1 = automat_1;
    }

    public List<HotDrink> getBottleWithWaterList() {
        return BottleWithWaterList;
    }

    public void setBottleWithWaterList(List<HotDrink> bottleWithWaterList) {
        BottleWithWaterList = bottleWithWaterList;
    }

    public HotDrinkAutomat getAutomat_2() {
        return automat_2;
    }

    public void setAutomat_2(HotDrinkAutomat automat_2) {
        this.automat_2 = automat_2;
    }

    public void createHotDrink (String name, double cost, int value, int temperature)
    {
        automat_1.setName(name);
        automat_1.setCost(cost);
        automat_1.setValue(value);
        automat_1.setTemperature(temperature);
    }

    public void createBottleWithWater (String name, double cost, int volume)
    {
        automat_2.setName(name);
        automat_2.setCost(cost);
        automat_2.setVolume(volume);
    }

    @Override
    public String toString() {
        return "Controller{" +
                "HotDrinkList=" + HotDrinkList +
                ", automat_1=" + automat_1 +
                ", BottleWithWaterList=" + BottleWithWaterList +
                ", automat_2=" + automat_2 +
                '}';
    }

    public void addHotDrink(String name, double cost, int value, int temperature) {
    }

    public void addBottleWithWater(String name, double cost, int volume) {
    }
}


