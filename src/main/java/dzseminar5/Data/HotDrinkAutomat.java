package dzseminar5.Data;

import dzseminar5.View.View;

import java.util.List;


public class HotDrinkAutomat extends HotDrink {

    private final List<HotDrink> products;

    public HotDrinkAutomat(List<HotDrink> products){
        this.products = products;
    }

    public HotDrinkAutomat(String name, double cost, int value, int temperature, List<HotDrink> products) {
        super(name, cost, value, temperature);
        this.products = products;
    }

    public Product getProduct(String name){
        for (Product product : products){
            if (product.getName().equalsIgnoreCase(name)){
                return product;
            }
        }
        throw new IllegalStateException(String.format("Продукт c названием %s не найден.", name));
    }

    public HotDrink getProduct(String name, int volume, int temperature) {
        for (HotDrink product: products){
            if(product != null) {
                if(product.getName().equalsIgnoreCase(name) && ((HotDrink) product).getVolume() == volume && ((HotDrink) product).getTemperature() == temperature) {
                    return (HotDrink) product;
                }
            }
        }
        throw new IllegalStateException(String.format("Продукт c названием %s не найден.", name));
    }
}
