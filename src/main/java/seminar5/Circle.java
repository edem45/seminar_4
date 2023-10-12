package seminar5;

public class Circle extends Rectangle implements AreaCalculator{


    private double radius;

    @Override
    public double getArea() {
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public double getArrea() {
        return 0;
    }
}
