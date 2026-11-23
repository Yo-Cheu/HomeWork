
public interface Shape {

    double calculateArea();

    default double calculatePerimeter(double... sides) {
        double perimeter = 0;

        for (double side : sides) {
            perimeter += side;
        }

        return perimeter;
    }

    String getFillColor();

    String getBorderColor();
}
