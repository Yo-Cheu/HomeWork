
public class Triangle implements Shape {

    private double sideA;
    private double sideB;
    private double sideC;
    private double height;
    private String fillColor;
    private String borderColor;

    public Triangle(double sideA, double sideB, double sideC,
                    double height, String fillColor, String borderColor) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.height = height;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double calculateArea() {
        return sideA * height / 2;
    }

    public double getPerimeter() {
        return calculatePerimeter(sideA, sideB, sideC);
    }

    @Override
    public String getFillColor() {
        return fillColor;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }
}
