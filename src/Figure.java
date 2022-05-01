public class Figure {
    public int x;
    public int y;
    public String color;

    public Figure() {
    }

    public Figure(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Figure{" +
                "x=" + x +
                ", y=" + y +
                ", color='" + color + '\'' +
                '}';
    }

    double distance(){
        return Math.sqrt(x * x + y * y);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }


}
