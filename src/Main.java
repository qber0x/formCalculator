public class Main {
    public static void main(String[] args) {
        Calculateable triangle = new Triangle(10, 5,7);
        Calculateable circle = new Circle(5);
        Calculateable square = new Square(10);
        Calculateable rectangle = new Rectangle(10, 5);

        printForm(triangle);
        printForm(circle);
        printForm(square);
        printForm(rectangle);

    }
     public static void printForm(Calculateable form) {
         System.out.println("Площадь фигуры = " + form.calculateArea());
         System.out.println("Периметр фигуры = " + form.calculatePerimeter());
         System.out.println();
     }
}
