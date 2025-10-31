public class Main {
    public static void main(String[] args) {
        Calculateable triangle = new Triangle(10, 5,7);
        Calculateable circle = new Circle(5);
        Calculateable square = new Square(10);

        printForm(triangle);
        printForm(circle);
        printForm(square);

    }
     public static void printForm(Calculateable form) {
         System.out.println("Площадь фигуры = " + form.calculateArea());
         System.out.println("Периметр фигуры = " + form.calculatePerimeter());
         System.out.println();
     }
}
