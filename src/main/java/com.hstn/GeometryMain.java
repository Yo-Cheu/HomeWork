
public class GeometryMain {

    public static void main(String[] args) {

        Circle circle = new Circle(5, "Красный", "Черный");

        Rectangle rectangle = new Rectangle(
                4, 6, "Синий", "Белый"
        );

        Triangle triangle = new Triangle(
                3, 4, 5, 4, "Зеленый", "Черный"
        );

        // Вывод информации о круге
        System.out.println("===== КРУГ =====");
        System.out.println("Периметр: " + circle.getPerimeter());
        System.out.println("Площадь: " + circle.calculateArea());
        System.out.println("Цвет заливки: " + circle.getFillColor());
        System.out.println("Цвет границы: " + circle.getBorderColor());

        // Вывод информации о прямоугольнике
        System.out.println("\n===== ПРЯМОУГОЛЬНИК =====");
        System.out.println("Периметр: " + rectangle.getPerimeter());
        System.out.println("Площадь: " + rectangle.calculateArea());
        System.out.println("Цвет заливки: " + rectangle.getFillColor());
        System.out.println("Цвет границы: " + rectangle.getBorderColor());

        // Вывод информации о треугольнике
        System.out.println("\n===== ТРЕУГОЛЬНИК =====");
        System.out.println("Периметр: " + triangle.getPerimeter());
        System.out.println("Площадь: " + triangle.calculateArea());
        System.out.println("Цвет заливки: " + triangle.getFillColor());
        System.out.println("Цвет границы: " + triangle.getBorderColor());
    }
}
