public class Rectangle implements Calculateable{
    private final double a;
    private final double b;

    public Rectangle(double a, double b){
        this.a = a;
        this.b = b;
    }


    @Override
    public double calculateArea() {
        return a * b;
    }

    @Override
    public double calculatePerimeter() {
        return a + b + a + b;
    }
}
