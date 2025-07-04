package core.basesyntax;

public class Rectangle extends Figure {
  private double width, height;
  public Rectangle(String color, double width, double height) {
    super(color);
    this.width = width;
    this.height = height;
  }

  @Override
  public double getArea() {
    return width * height;
  }

  @Override
  public void draw() {
    super.draw();
    System.out.println("Width: " + width);
    System.out.println("Height: " + height);
  }
}
