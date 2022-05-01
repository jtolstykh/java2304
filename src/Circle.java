
public class Circle extends Figure{

    private int radius;

    public Circle (){

    }

    public Circle(int x, int y, String color, int radius) {
        super(x, y, color);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", x=" + x +
                ", y=" + y +
                ", color='" + color + '\'' +
                '}';
    }
    public double area(){
        return Math.PI * radius * radius;
    }
}
