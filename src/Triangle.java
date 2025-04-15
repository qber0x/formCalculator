public class Triangle implements Calculateable{
    private final double a;
    private final double b;
    private final double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    @Override
    public double calculateArea() {
        double polPerimetra = calculatePerimeter() / 2;
        return Math.sqrt((polPerimetra * (polPerimetra - a) * (polPerimetra - b) * (polPerimetra - c)));
    }

    @Override
    public double calculatePerimeter() {
        return a + b + c;
    }

}

