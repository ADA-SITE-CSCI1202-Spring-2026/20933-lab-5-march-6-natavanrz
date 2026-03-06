public class Circle implements Movable {
    Point center;
    int radius;
    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public void moveUp() { center.y++; }
    public void moveDown() { center.y--; }
    public void moveLeft() { center.x--; }
    public void moveRight() { center.x++; }
}