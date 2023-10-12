package dzseminar5.Data;

public class HotDrink extends BottleWithWater {
    private int temperature;
    private int value;

    public HotDrink(String name, double cost, int value, int temperature) {
        super(name, cost, value);
        this.temperature = temperature;
    }

    public HotDrink() {
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "HotDrink {" +
                "name='" + super.getName() + '\'' + ", " +
                "cost='" + super.getCost() + '\'' + ", " +
                "volume='" + super.getVolume() + '\'' + ", " +
                "temperature=" + temperature +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HotDrink)) {
            return false;
        }

        HotDrink that = (HotDrink) o;

        return super.getName().equalsIgnoreCase(that.getName())
                && super.getCost() == that.getCost()
                && getVolume() == that.getVolume();

    }
}
