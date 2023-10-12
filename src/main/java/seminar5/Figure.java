package seminar5;

public class Figure extends Rectangle implements AreaCalculator{

    @Override
    public double getArea() {
        return height*width;
    }

    @Override
    public double getArrea() {
        return 0;
    }
}
